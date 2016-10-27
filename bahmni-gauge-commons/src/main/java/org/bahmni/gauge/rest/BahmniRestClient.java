package org.bahmni.gauge.rest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.bahmni.gauge.common.Model;
import org.bahmni.gauge.common.admin.domain.OrderSet;
import org.bahmni.gauge.common.admin.domain.OrderSetMember;
import org.bahmni.gauge.common.clinical.domain.DrugOrder;
import org.bahmni.gauge.common.clinical.domain.Specimen;
import org.bahmni.gauge.common.program.domain.PatientProgram;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.common.registration.domain.Visit;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.io.StringWriter;
import java.net.URLEncoder;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BahmniRestClient {

	private static BahmniRestClient bahmniRestClient;

	private static final String ORDERSET_URL = "/openmrs/ws/rest/v1/bahmniorderset/";

	private static final String PATIENT_PROFILE_URL = "/openmrs/ws/rest/v1/bahmnicore/patientprofile";

	private static final String PATIENT_URL = "/openmrs/ws/rest/v1/patient/";

	private static final String PROGRAM_ENROLLMENT_URL = "/openmrs/ws/rest/v1/bahmniprogramenrollment";

	private static final String EMRAPI_URL = "/openmrs/ws/rest/v1/bahmnicore/bahmniencounter";

	private static final String GET_ORDERTYPE_LIST_URL = "/openmrs/ws/rest/v1/ordertype?v=custom:(uuid,display)";

	private static final String GET_DRUG_LIST_URL = "/openmrs/ws/rest/v1/drug";

	private static final String GET_DRUG_UNDER_CONCEPT_URL="/openmrs/ws/rest/v1/drug?conceptUuid=%s&q=%s&s=ordered&v=custom:(uuid,name,dosageForm:(uuid,display))";

	private static final String GET_CONCEPT_UUID_URL = "/openmrs/ws/rest/v1/concept?q=%s&v=custom:(uuid,display)";

	private static final String GET_CONCEPT_ANSWER_URL = "/openmrs/ws/rest/v1/concept?q=%s&v=custom:(uuid,name:(uuid,name),answers:(uuid,display))";

	private static final String ADMIT_INPATIENT_CREATE_URL = "/openmrs/ws/rest/v1/bahmnicore/bahmniencounter";

	private static final String DISCHARGE_PATIENT_URL = "/openmrs/ws/rest/v1/bahmnicore/discharge";

	private Configuration freemarkerConfiguration;

	private String url;

	private String username;

	private String password;

	private BahmniRestClient() {
		setFreemarkerConfig();
		setupUnirest();
	}

	private void setupUnirest() {
		try {
			SSLContext sslcontext = SSLContexts.custom()
				.loadTrustMaterial(null, new TrustStrategy() {
					public boolean isTrusted(X509Certificate[] certificate, String authType) {
						return true;
					}
				})
				.build();
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext);
			CloseableHttpClient httpclient = HttpClients.custom()
				.setSSLSocketFactory(sslsf)
				.build();
			Unirest.setHttpClient(httpclient);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static BahmniRestClient get() {
		if (bahmniRestClient == null) {
			bahmniRestClient = new BahmniRestClient();
			bahmniRestClient.url = System.getenv("BAHMNI_GAUGE_APP_URL");
			bahmniRestClient.username = System.getenv("BAHMNI_GAUGE_APP_USER");
			bahmniRestClient.password = System.getenv("BAHMNI_GAUGE_APP_PASSWORD");
		}

		return bahmniRestClient;
	}

	private void setFreemarkerConfig() {
		try {
			freemarkerConfiguration = new Configuration(Configuration.VERSION_2_3_22);
			freemarkerConfiguration.setTemplateLoader(new ClassTemplateLoader(BahmniRestClient.class, "/org/bahmni/gauge/rest"));
			freemarkerConfiguration.setDefaultEncoding("UTF-8");
			freemarkerConfiguration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		} catch (Exception ex) {
			throw new IllegalArgumentException("The freemarker directory location configured is not ");
		}
	}

	public void createPatient(Patient patient,String templateName) {
		try {
			Template freemarkerTemplate = freemarkerConfiguration.getTemplate(templateName);
			Map<String, Object> patientData = new HashMap<>();
			patientData.put("patient", patient);

			StringWriter stringWriter = new StringWriter();
			freemarkerTemplate.process(patientData, stringWriter);
			String requestJson = stringWriter.toString();

			HttpResponse<JsonNode> response = Unirest.post(url + PATIENT_PROFILE_URL)
					.basicAuth(username, password)
					.header("content-type", "application/json")
					.body(requestJson)
					.asJson();
			Object patientUuid=null;
			if(response.getBody().getObject()!=null)
				patientUuid = JSONs.get(response.getBody().getObject(), "patient", "uuid");
			if (null == patientUuid) {
				System.err.println("Response from the server for patient creation:");
				System.err.println(response.getBody().toString());
				throw new BahmniAPIException("Patient creation failed!!");
			}
			JSONArray identifiers = (JSONArray) JSONs.get(response.getBody(), "patient", "identifiers");
			patient.setUuid(patientUuid.toString());
			patient.setIdentifier(getPreferred(identifiers));
		} catch (Exception e) {
			throw new BahmniAPIException(e);
		}
	}

	private String getPreferred(JSONArray identifiers) {
		for (Object identifier : identifiers) {
			JSONObject jsonObject = (JSONObject) identifier;
			if (jsonObject.get("preferred").equals(true)) {
				return (String) jsonObject.get("identifier");
			}
		}
		return null;
	}

	public void retirePatient(String uuid) {
		try {
			Unirest.delete(url + PATIENT_URL + uuid)
				.basicAuth(username, password)
				.header("content-type", "application/json")
				.asString();
		} catch (Exception e) {
			throw new BahmniAPIException(e);
		}
	}

	public void retireOrderSet(String uuid) {
		try {
			Unirest.delete(url + ORDERSET_URL + uuid)
				.basicAuth(username, password)
				.header("content-type", "application/json")
				.asString();
		} catch (Exception e) {
			throw new BahmniAPIException(e);
		}
	}

	public void enrollToProgram(PatientProgram patientProgram) {
		try {
			Template freemarkerTemplate = freemarkerConfiguration.getTemplate("program_enrollment.ftl");
			Map<String, Object> programData = new HashMap<>();
			programData.put("patient", patientProgram.getPatient());
			programData.put("program", patientProgram.getProgram());

			StringWriter stringWriter = new StringWriter();
			freemarkerTemplate.process(programData, stringWriter);
			String requestJson = stringWriter.toString();

			HttpResponse<JsonNode> response = Unirest.post(url + PROGRAM_ENROLLMENT_URL)
				.basicAuth(username, password)
				.header("content-type", "application/json")
				.body(requestJson)
				.asJson();

			Object programUuid = JSONs.get(response.getBody(), "program", "uuid");
			if (null == programUuid) {
				System.err.println("Response from the server for program enrollment:");
				System.err.println(response.getBody().toString());
				throw new BahmniAPIException("Program enrollment failed!!");
			}
			patientProgram.setPatientProgramUuid((String) JSONs.get(response.getBody(), "uuid"));
		} catch (Exception e) {
			throw new BahmniAPIException(e);
		}
	}

	public void createForm(String formTemplate, Map<String, Object> attributes) {
		try {
			Template freemarkerTemplate = freemarkerConfiguration.getTemplate(formTemplate);

			StringWriter stringWriter = new StringWriter();
			freemarkerTemplate.process(attributes, stringWriter);
			String requestJson = stringWriter.toString();

			HttpResponse<JsonNode> response = Unirest.post(url + EMRAPI_URL)
				.basicAuth(username, password)
				.header("content-type", "application/json")
				.body(requestJson)
				.asJson();

			if (response.getStatus() != 200) {
				throw new BahmniAPIException("Invalid response for [" + formTemplate + "]");
			}

		} catch (Exception ex) {
			throw new BahmniAPIException(ex);
		}
	}

	public void createDrugOrders(List<DrugOrder> drugOrders) {
		try {
			Template freemarkerTemplate = freemarkerConfiguration.getTemplate("drug_order_create.ftl");
			Map<String, Object> drugOrderData = new HashMap<>();

			drugOrderData.put("drugOrders", drugOrders);

			StringWriter stringWriter = new StringWriter();
			freemarkerTemplate.process(drugOrderData, stringWriter);

			String requestJson = stringWriter.toString();

			HttpResponse<JsonNode> response = Unirest.post(url + EMRAPI_URL)
				.basicAuth(username, password)
				.header("content-type", "application/json")
				.body(requestJson)
				.asJson();

			if (response.getStatus() != 200)
				throw new BahmniAPIException("Drug Order Creation Failed!!");
		} catch (Exception e) {
			throw new BahmniAPIException(e);
		}
	}

	public String getUuidOfDrug(String drugName) {
		try {
			HttpResponse<JsonNode> request = Unirest.get(url + GET_DRUG_LIST_URL)
				.basicAuth(username, password)
				.header("content-type", "application/json")
				.asJson();

			int size = request.getBody().getArray().getJSONObject(0).getJSONArray("results").length();

			for (int pos = 0; pos < size; pos++) {
				if (request.getBody().getArray().getJSONObject(0).getJSONArray("results").getJSONObject(pos).get("display").equals(drugName)) {
					return String.valueOf(request.getBody().getArray().getJSONObject(0).getJSONArray("results").getJSONObject(pos).get("uuid"));
				}
			}

		} catch (Exception e) {
			throw new BahmniAPIException(e);
		}
		return null;
	}

	public String getUuidOfOrderType(String orderType) {
		try {
			HttpResponse<JsonNode> request = Unirest.get(url + GET_ORDERTYPE_LIST_URL)
				.basicAuth(username, password)
				.header("content-type", "application/json")
				.asJson();

			int size = request.getBody().getArray().getJSONObject(0).getJSONArray("results").length();

			for (int pos = 0; pos < size; pos++) {
				if (request.getBody().getArray().getJSONObject(0).getJSONArray("results").getJSONObject(pos).get("display").equals(orderType)) {
					return String.valueOf(request.getBody().getArray().getJSONObject(0).getJSONArray("results").getJSONObject(pos).get("uuid"));
				}
			}

		} catch (Exception e) {
			throw new BahmniAPIException(e);
		}
		return null;
	}

	public String getUuidOfDrugWithConcept(String drugName, String conceptUuid) {
		try {
			HttpResponse<JsonNode> request = Unirest.get(url + String.format(GET_DRUG_UNDER_CONCEPT_URL, URLEncoder.encode(conceptUuid, "UTF-8"), URLEncoder.encode(drugName, "UTF-8")))
				.basicAuth(username, password)
				.header("content-type", "application/json")
				.asJson();

			int size = request.getBody().getArray().getJSONObject(0).getJSONArray("results").length();

			for (int pos = 0; pos < size; pos++) {
				if (request.getBody().getArray().getJSONObject(0).getJSONArray("results").getJSONObject(pos).get("name").equals(drugName)) {
					return String.valueOf(request.getBody().getArray().getJSONObject(0).getJSONArray("results").getJSONObject(pos).get("uuid"));
				}
			}

		} catch (Exception e) {
			throw new BahmniAPIException(e);
		}
		return null;
	}

	public String getUuidOfConceptName(String conceptName) {
		try {
			HttpResponse<JsonNode> request = Unirest.get(url + String.format(GET_CONCEPT_UUID_URL, URLEncoder.encode(conceptName, "UTF-8")))
				.basicAuth(username, password)
				.header("content-type", "application/json")
				.asJson();

			int size = request.getBody().getArray().getJSONObject(0).getJSONArray("results").length();

			for (int pos = 0; pos < size; pos++) {
				if (request.getBody().getArray().getJSONObject(0).getJSONArray("results").getJSONObject(pos).get("display").equals(conceptName)) {
					return String.valueOf(request.getBody().getArray().getJSONObject(0).getJSONArray("results").getJSONObject(pos).get("uuid"));
				}
			}

		} catch (Exception e) {
			throw new BahmniAPIException(e);
		}
		return null;
	}

	public Map<String, String> getConceptAnswersForConceptName(String conceptName) {
		Map<String, String> conceptAnswerDetailsMap = new HashMap<>();

		try {
			String conceptUrl = url + String.format(GET_CONCEPT_ANSWER_URL, URLEncoder.encode(conceptName, "UTF-8"));

			HttpResponse<JsonNode> response = Unirest.get(conceptUrl)
				.basicAuth(username, password)
				.header("content-type", "application/json")
				.asJson();

			JSONArray answers = (JSONArray) JSONs.get(response.getBody(), "results", 0, "answers");
			if (null != answers) {
				for (Object answer_ : answers) {
					JSONObject answer = (JSONObject) answer_;
					conceptAnswerDetailsMap.put(answer.get("display").toString(), answer.get("uuid").toString());
				}
			}
		} catch (Exception e) {
			throw new BahmniAPIException(e);
		}
		return conceptAnswerDetailsMap;
	}

	public  <T extends Model> T create (T entity){
		try {
			Template freemarkerTemplate = freemarkerConfiguration.getTemplate(entity.getMRSName() + "_create.ftl");
			Map<String, Object> objectData = new HashMap<>();

			objectData.put("object", entity);

			StringWriter stringWriter = new StringWriter();
			freemarkerTemplate.process(objectData, stringWriter);

			String requestJson = stringWriter.toString();

			HttpResponse<JsonNode> response = Unirest.post(url + "/openmrs/ws/rest/v1/" + entity.getMRSName())
				.basicAuth(username, password)
				.header("content-type", "application/json")
				.body(requestJson)
				.asJson();

			if (response.getStatus() != 200 && response.getStatus() != 201)
				throw new BahmniAPIException(entity.getClass() + " Creation Failed!!");
		} catch (Exception e) {
			throw new BahmniAPIException(e);
		}
		return entity;
	}

	public <T extends Model> T getModelByName(T model) {
		try {
			HttpResponse<JsonNode> request = Unirest.get(url + "/openmrs/ws/rest/v1/" + model.getMRSName())
					.basicAuth(username, password)
					.header("content-type", "application/json")
					.asJson();

			int size = request.getBody().getArray().getJSONObject(0).getJSONArray("results").length();

			for (int pos = 0; pos < size; pos++) {
				if (request.getBody().getArray().getJSONObject(0).getJSONArray("results").getJSONObject(pos).get("display").equals(model.getDisplay())) {
					model.setUuid(String.valueOf(request.getBody().getArray().getJSONObject(0).getJSONArray("results").getJSONObject(pos).get("uuid")));
					return model;
				}
			}

		} catch (Exception e) {
			throw new BahmniAPIException(e);
		}
		return null;
	}

	public void createBacteriologySpecimen(String formTemplate, Specimen specimen, Patient patient, PatientProgram patientProgram) {
		Map<String, Object> attributes = new HashMap<>();
		attributes.put("patient", patient);
		attributes.put("patientProgram", patientProgram);
		attributes.put("specimen", specimen);

		createForm(formTemplate, attributes);
	}


	public void createOrderSet(OrderSet orderSet, String templateName) {
		try {
			for (OrderSetMember member : orderSet.getOrderSetMembers()) {
				String conceptUuid = getUuidOfConceptName(member.getConceptName());
				member.setDrugUuid(getUuidOfDrugWithConcept(member.getDrugName(), conceptUuid));
				member.setConceptUuid(conceptUuid);
				member.setOrderTypeUuid(getUuidOfOrderType(member.getOrderType()));

			}
			Template freemarkerTemplate = freemarkerConfiguration.getTemplate(templateName);
			Map<String, Object> orderSetData = new HashMap<>();
			orderSetData.put("orderSet", orderSet);

			StringWriter stringWriter = new StringWriter();
			freemarkerTemplate.process(orderSetData, stringWriter);
			String requestJson = stringWriter.toString();

			HttpResponse<JsonNode> response = Unirest.post(url + ORDERSET_URL)
				.basicAuth(username, password)
				.header("content-type", "application/json")
				.body(requestJson)
				.asJson();

			Object uuid = JSONs.get(response.getBody(), "uuid");
			if (null == uuid) {
				System.err.println("Response from the server for patient creation:");
				System.err.println(response.getBody().toString());
				throw new BahmniAPIException("Patient creation failed!!");
			}
			orderSet.setUuid(uuid.toString());
		} catch (Exception e) {
			throw new BahmniAPIException(e);
		}
	}


	public void admitPatient(Visit visit, String templateName) {
		try {
			Template freemarkerTemplate = freemarkerConfiguration.getTemplate(templateName);
			Map<String, Object> visitData = new HashMap<>();
			visitData.put("visitFTL", visit);

			StringWriter stringWriter = new StringWriter();
			freemarkerTemplate.process(visitData, stringWriter);
			String requestJson = stringWriter.toString();

			HttpResponse<JsonNode> response = Unirest.post(url + ADMIT_INPATIENT_CREATE_URL)
				.basicAuth(username, password)
				.header("content-type", "application/json")
				.body(requestJson)
				.asJson();
			if (response.getStatus() != 200 && response.getStatus() != 201)
				throw new BahmniAPIException("Admit patient creation through API Failed!!");
		} catch (Exception e) {
			throw new BahmniAPIException(e);
		}
	}

	public static void dischargePatient(Patient patient) {
		BahmniRestClient bahmniRestClient = get();
		String requestBody = bahmniRestClient.serialize(patient, "discharge_patient.ftl");
		post(DISCHARGE_PATIENT_URL, requestBody);
	}

	public String serialize(Object object, String templateName) {
		Map<String, Object> requestObject = new HashMap<>();
		requestObject.put("self", object);
		StringWriter stringWriter = new StringWriter();
		try {
			Template template = freemarkerConfiguration.getTemplate(templateName);
			template.process(requestObject, stringWriter);
		} catch (TemplateException | IOException e) {
			throw new BahmniAPIException(e);
		}
		return stringWriter.toString();
	}

	private static String baseUrl() {
		return System.getenv("BAHMNI_GAUGE_APP_URL");
	}

	private static String username() {
		return System.getenv("BAHMNI_GAUGE_APP_USER");
	}

	private static String password() {
		return System.getenv("BAHMNI_GAUGE_APP_PASSWORD");
	}

	public static JsonNode post(String restAPIUrl, String body) {
		HttpResponse<JsonNode> response = null;
		try {
			String url = baseUrl() + restAPIUrl;
			response = Unirest.post(url)
				.basicAuth(username(), password())
				.header("content-type", "application/json")
				.body(body)
				.asJson();
			if (response.getStatus() != 200 && response.getStatus() != 201) {
				throw new BahmniAPIException("Post request failed!! Url: " + url + " Content:" + body.substring(0, 100));
			}
		} catch (UnirestException e) {
			throw new BahmniAPIException(e);
		}
		return response.getBody();
	}
}

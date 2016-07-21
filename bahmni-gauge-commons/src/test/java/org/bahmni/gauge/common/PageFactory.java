package org.bahmni.gauge.common;

import org.bahmni.gauge.common.clinical.ObservationsPage;
import org.bahmni.gauge.common.clinical.PatientListingPage;
import org.bahmni.gauge.common.home.HomePage;
import org.bahmni.gauge.common.login.LoginPage;
import org.bahmni.gauge.common.program.ProgramManagementPage;
import org.bahmni.gauge.common.registration.RegistrationFirstPage;
import org.bahmni.gauge.common.registration.RegistrationSearch;
import org.bahmni.gauge.common.registration.RegistrationVisitDetailsPage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PageFactory {

	private static final String LOGIN = "login";
	private static final String HOME = "home";
	private static final String REGISTRATION_SEARCH = "registration.search";
	private static final String REGISTRATION_FIRST_PAGE = "registration.page1";
	private static final String REGISTRATION_VISIT_PAGE = "registration.visitPage";
	private static final String PROGRAMS_PAGE = "programs";
	private static final String PATIENT_LISTING_PAGE = "patient.listing.page";
	private static final String OBSERVATIONS_PAGE = "observations.page";
	private static final String BASELINE_PAGE = "baseline.pge";

	private static Properties props = new Properties();

	static{
		String implementationName = System.getenv("bahmni_gauge_impl_name");
		String fileName = implementationName == null ? "page.properties": implementationName + "-page.properties";
		InputStream is = ClassLoader.getSystemResourceAsStream(fileName);
		try {
			props.load(is);
		}
		catch (IOException e) {
			e.printStackTrace();
			throw new TestSpecException("Unable to locate page.properties");
		}

	}

	public static BahmniPage getPage(String key){
		if(!props.containsKey(key)){
			throw new TestSpecException("The page key ["+key+"] is not defined in page.properties file");
		}
		try {
			BahmniPage bahmniPage = (BahmniPage) org.openqa.selenium.support.PageFactory.initElements(DriverFactory.getDriver(), Class.forName((String) props.get(key)));
			return bahmniPage;
		}
		catch (ClassNotFoundException e) {
			throw new TestSpecException("The class defined in page.properites file ["+props.get(key)+"] not available");
		}
	}

	public static LoginPage getLoginPage(){
		return (LoginPage) getPage(LOGIN);
	}

	public static HomePage getHomePage(){
		return (HomePage) getPage(HOME);
	}

	public static RegistrationSearch getRegistrationSearchPage(){
		return (RegistrationSearch) getPage(REGISTRATION_SEARCH);
	}

	public static RegistrationFirstPage getRegistrationFirstPage() {
		return (RegistrationFirstPage) getPage(REGISTRATION_FIRST_PAGE);
	}

	public static RegistrationVisitDetailsPage getRegistrationVisitPage() {
		return (RegistrationVisitDetailsPage) getPage(REGISTRATION_VISIT_PAGE);
	}

	public static ProgramManagementPage getProgramManagementPage() {
		return (ProgramManagementPage) getPage(PROGRAMS_PAGE);
	}

	public static PatientListingPage getPatientListingPage() {
		return (PatientListingPage) getPage(PATIENT_LISTING_PAGE);
	}

	public static ObservationsPage getObservationsPage(){ return (ObservationsPage) getPage(OBSERVATIONS_PAGE);}
}

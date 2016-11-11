package org.bahmni.gauge.common;

import org.bahmni.gauge.common.clinical.DashboardPage;
import org.bahmni.gauge.common.clinical.TreatmentPage;
import org.bahmni.gauge.common.home.HomePage;
import org.bahmni.gauge.common.orders.OrdersFulfillmentPage;
import org.bahmni.gauge.common.program.ProgramManagementPage;
import org.bahmni.gauge.common.registration.RegistrationFirstPage;
import org.bahmni.gauge.common.registration.RegistrationVisitDetailsPage;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PageFactory {

	private static final String HOME = "home";
	private static final String REGISTRATION_FIRST_PAGE = "registration.page1";
	private static final String REGISTRATION_VISIT_PAGE = "registration.visitPage";
	private static final String PROGRAMS_PAGE = "programs";
	private static final String PROGRAM_DASHBOARD_PAGE = "program.dashboard";
	private static Properties props = new Properties();
	private static final String ORDERS_FULFILLMENT_PAGE="orders.fulfillment";
	private static final String TREATMENT_PAGE="clinical.treatment";
	static{
		InputStream is = ClassLoader.getSystemResourceAsStream("page.properties");
		try {
			props.load(is);
		}
		catch (IOException e) {
			e.printStackTrace();
			throw new TestSpecException("Unable to locate page.properties");
		}

	}

	public static BahmniPage get(String key){
		if(!props.containsKey(key)){
			throw new TestSpecException("The page key ["+key+"] is not defined in page.properties file");
		}
		try {
			return get((Class) Class.forName((String) props.get(key)));
		}
		catch (ClassNotFoundException e) {
			throw new TestSpecException("The class defined in page.properites file ["+props.get(key)+"] not available");
		}
	}

	public static HomePage getHomePage(){
		return (HomePage) get(HOME);
	}

	public static RegistrationFirstPage getRegistrationFirstPage() {
		return (RegistrationFirstPage) get(REGISTRATION_FIRST_PAGE);
	}

	public static RegistrationVisitDetailsPage getRegistrationVisitPage() {
		return (RegistrationVisitDetailsPage) get(REGISTRATION_VISIT_PAGE);
	}

	public static ProgramManagementPage getProgramManagementPage() {
		return (ProgramManagementPage) get(PROGRAMS_PAGE);

	}

	public static DashboardPage getProgramDashboardPage(){
		return (DashboardPage) get(PROGRAM_DASHBOARD_PAGE);

	}

	public static <T extends BahmniPage> T get(Class<T> page) {
		WebDriver driver = DriverFactory.getDriver();
		T bahmniPage = org.openqa.selenium.support.PageFactory.initElements(driver, page);
		bahmniPage.setDriver(driver);
		return bahmniPage;
	}

	public static OrdersFulfillmentPage getOrdersFulfillmentPage() {
		return (OrdersFulfillmentPage) get(ORDERS_FULFILLMENT_PAGE);
	}

	public static TreatmentPage getTreatmentPage() {
		return (TreatmentPage) get(TREATMENT_PAGE);
	}
}

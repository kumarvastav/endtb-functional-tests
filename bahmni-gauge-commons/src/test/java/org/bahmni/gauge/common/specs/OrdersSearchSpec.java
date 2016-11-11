package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.orders.OrdersSearchPage;
import org.bahmni.gauge.common.registration.RegistrationSearch;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.openqa.selenium.By;

public class OrdersSearchSpec extends BahmniPage{

	@BeforeClassSteps
	public void waitForAppReady(){
		BahmniPage.waitForSpinner(DriverFactory.getDriver());
	}

	@Step("Search previously created patient with exact identifier on orders search page")
	public void searchPreviousCreatedPatientWithIdentifier() {
		OrdersSearchPage ordersSearchPage=PageFactory.get(OrdersSearchPage.class);
		ordersSearchPage.searchById(getPatientFromSpecStore());
	}
}

package org.bahmni.gauge.endtb.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.endtb.registration.EndTBRegistrationFirstPage;

public class EndTBProgramManagementSpec {

	@BeforeClassSteps
	public void waitForAppReady(){ new BahmniPage().waitForSpinner(DriverFactory.getDriver());}

	@Step("Click on treatment enrollment")
	public void clickOnTreatmentEnrollment() {
		EndTBRegistrationFirstPage registrationPage = (EndTBRegistrationFirstPage) PageFactory.getRegistrationFirstPage();
		registrationPage.clickTreatmentRegistration();
	}
}

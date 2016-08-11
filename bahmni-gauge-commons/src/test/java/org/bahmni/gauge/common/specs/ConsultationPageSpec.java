package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.ConsultationPage;

public class ConsultationPageSpec extends BahmniPage {

    @BeforeClassSteps
    public void waitForAppReady(){ new BahmniPage().waitForSpinner(DriverFactory.getDriver());}

    @Step("Save the consultation")
    public void saveConsultation(){
        ConsultationPage consultationPage = PageFactory.getConsultationPage();
        consultationPage.saveConsultation();
        waitForAppReady();
    }

    @Step("Navigate to patient dashboard")
    public void clickOnDashboard(){
        ConsultationPage consultationPage = PageFactory.getConsultationPage();
        consultationPage.clickPatientProfile();
    }

    @Step("Go to <tab> tab")
    public void goToTab(String tab){
        ConsultationPage consultationPage = PageFactory.getConsultationPage();
        consultationPage.clickOnTab(tab);
    }
}

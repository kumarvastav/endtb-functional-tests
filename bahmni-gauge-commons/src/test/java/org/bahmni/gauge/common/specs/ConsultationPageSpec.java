package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.ConsultationPage;

public class ConsultationPageSpec {

    ConsultationPage consultationPage;

    public ConsultationPageSpec(){
        consultationPage = PageFactory.getConsultationPage();

    }
    @BeforeClassSteps
    public void waitForAppReady(){ BahmniPage.waitForSpinner(DriverFactory.getDriver());}

    @Step("Save the consultation")
    public void saveConsultation(){
        consultationPage.saveConsultation();
        waitForAppReady();
    }

    @Step("Navigate to patient dashboard")
    public void clickOnDashboard(){
        consultationPage.clickPatientProfile();
        waitForAppReady();
    }

    @Step("Go to <tab> tab")
    public void goToTab(String tab){
        consultationPage.clickOnTab(tab);
        waitForAppReady();
    }
}

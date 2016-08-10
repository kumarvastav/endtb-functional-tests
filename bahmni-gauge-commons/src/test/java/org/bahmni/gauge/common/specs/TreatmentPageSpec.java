package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.ConsultationPage;
import org.bahmni.gauge.common.clinical.TreatmentPage;
import org.openqa.selenium.WebDriver;

public class TreatmentPageSpec {

    @BeforeClassSteps
    public void waitForAppReady(){ new BahmniPage().waitForSpinner(DriverFactory.getDriver());}



    @Step("Create drug order")
    public void createDrugOrder(){
        TreatmentPage treatmentPage = PageFactory.getTreatmentPage();
        treatmentPage.createDrugOrder();
    }
}

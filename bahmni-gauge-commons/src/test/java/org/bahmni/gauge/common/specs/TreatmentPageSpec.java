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

    private final WebDriver driver;
    private final ConsultationPage consultationPage;


    private TreatmentPage treatmentPage;

    private TreatmentPageSpec(){
        this.driver = DriverFactory.getDriver();
        this.treatmentPage = PageFactory.getTreatmentPage();
        this.consultationPage = PageFactory.getConsultationPage();

    }

    @BeforeClassSteps
    public void waitForAppReady() {
        new BahmniPage().waitForSpinner(driver);
    }



    @Step("Create drug order")
    public void createDrugOrder(){

        treatmentPage.createDrugOrder();
    }
}

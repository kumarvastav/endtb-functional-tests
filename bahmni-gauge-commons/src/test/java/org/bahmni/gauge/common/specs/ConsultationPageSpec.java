package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.ConsultationPage;
import org.bahmni.gauge.common.clinical.DashboardPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by dharmens on 8/8/16.
 */
public class ConsultationPageSpec {

    @BeforeClassSteps
    public void waitForAppReady(){ new BahmniPage().waitForSpinner(DriverFactory.getDriver());}

    @Step("Save the consultation")
    public void saveConsultation(){
        ConsultationPage consultationPage = PageFactory.getConsultationPage();
        consultationPage.saveConsultation();
        waitForAppReady();
    }
}

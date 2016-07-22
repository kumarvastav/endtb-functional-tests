package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.registration.RegistrationVisitDetailsPage;
import org.openqa.selenium.WebDriver;

public class RegistrationVisitPageSpec {
    private final WebDriver driver;

    public RegistrationVisitPageSpec() {
        this.driver = DriverFactory.getDriver();
    }

    @BeforeClassSteps
    public void waitForAppReady() {
        new BahmniPage().waitForSpinner(driver);
    }

    @Step("Close visit")
    public void closeVisit() {
        RegistrationVisitDetailsPage registrationVisitPage = PageFactory.getRegistrationVisitPage();
        registrationVisitPage.closeVisit(driver);
    }
}

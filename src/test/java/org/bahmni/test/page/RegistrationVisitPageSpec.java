package org.bahmni.test.page;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.test.DriverFactory;
import org.bahmni.test.PageFactory;
import org.bahmni.test.page.registration.RegistrationFirstPage;
import org.openqa.selenium.WebDriver;
import org.bahmni.test.page.registration.RegistrationVisitDetailsPage;
import org.openqa.selenium.WebElement;

/**
 * Created by swarup on 21/7/16.
 */
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
    public void closeVisit() throws InterruptedException {
        RegistrationVisitDetailsPage registrationVisitPage = PageFactory.getRegistrationVisitPage();
        registrationVisitPage.closeVisit(driver);
    }
}

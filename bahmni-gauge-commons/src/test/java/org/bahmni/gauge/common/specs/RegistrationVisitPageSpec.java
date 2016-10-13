package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.registration.RegistrationVisitDetailsPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegistrationVisitPageSpec {
    private final WebDriver driver;

    public RegistrationVisitPageSpec() {
        this.driver = DriverFactory.getDriver();
    }

    @BeforeClassSteps
    public void waitForAppReady() {
        BahmniPage.waitForSpinner(driver);
    }

    @Step("Close visit")
    public void closeVisit() {
        RegistrationVisitDetailsPage registrationVisitPage = PageFactory.getRegistrationVisitPage();
        registrationVisitPage.closeVisit(driver);
    }

    @Step("Navigate to latest visit page")
    public void navigateToVisit() {
        RegistrationVisitDetailsPage registrationVisitPage = PageFactory.getRegistrationVisitPage();
        registrationVisitPage.openLastVisit();
    }

    @Step("Verify display control <displayControl> on visit page, has the following details <table>")
    public void verifyDisplayControlOnVisitPage(String displayControl, Table table) {
        RegistrationVisitDetailsPage registrationVisitPage = PageFactory.getRegistrationVisitPage();
        String displayControlText = registrationVisitPage.getDisplayControlText(displayControl);
        for (String drugOrder : table.getColumnValues("details")) {
            Assert.assertTrue("String "+drugOrder+" does not exist. Actual String :"+displayControlText,displayControlText.contains(drugOrder));
        }
    }

}

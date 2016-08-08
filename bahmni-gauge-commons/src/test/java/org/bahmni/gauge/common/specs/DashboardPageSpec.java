package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.DashboardPage;
import org.bahmni.gauge.common.home.HomePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by dharmens on 8/1/16.
 */
public class DashboardPageSpec {

    private final WebDriver driver;
    private DashboardPage dashboardPage;

    public DashboardPageSpec(){
        this.driver = DriverFactory.getDriver();
    }

    @BeforeClassSteps
    public void waitForAppReady(){
        new BahmniPage().waitForSpinner(driver);
    }

    @Step("Navigate to dashboard")
    public void navigateToHomePage() {
        driver.get(HomePage.URL);
    }


    @Step("Navigate to consultation")
    public void goToConsultation(){
        dashboardPage = PageFactory.getDashboardPage();
        dashboardPage.clickEnterData();
    }



}

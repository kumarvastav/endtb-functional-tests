package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.home.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeSpec extends BahmniPage {
	private final WebDriver driver;
	private HomePage homePage;

	public HomeSpec(){
		this.driver = DriverFactory.getDriver();
	}

	@BeforeClassSteps
	public void waitForAppReady(){
		new BahmniPage().waitForSpinner(driver);
	}

//	@Step("Navigate to dashboard")
//	public void navigateToHomePage() {
//		driver.get(HomePage.URL);
//		new BahmniPage().we;
//		//new BahmniPage().waitForSpinner(driver);
//	}


	@Step("Click on registration app")
	public void goToRegistrationPage(){
		homePage = PageFactory.getHomePage();
		homePage.clickRegistrationApp();
		new BahmniPage().waitForSpinner(driver);
	}

	@Step("Click on programs app")
	public void goToProgramsPage(){
		homePage = PageFactory.getHomePage();
		homePage.clickProgramsApp();
	}

	@Step("Click on clinical app")
	public void goToClinicalPage(){
		homePage = PageFactory.getHomePage();
		homePage.clickClinicalApp();
	}

	@Step("Logout the user")
	public void logout(){
		//new BahmniPage().waitForElementOnPage(driver, ".i.icon-bahmni-registration");
		homePage = PageFactory.getHomePage();
		homePage.logout();
	}

	@Step("Verify Login Page")
	public void validateLogin() {
		homePage = PageFactory.getHomePage();
		Assert.assertTrue(homePage.registration.isDisplayed());
		Assert.assertTrue(homePage.admin.isDisplayed());
		Assert.assertTrue(homePage.exports.isDisplayed());
	}

}

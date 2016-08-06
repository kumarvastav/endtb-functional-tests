package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.login.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginSpec {

	private final WebDriver driver;

	public LoginSpec(){
		this.driver = DriverFactory.getDriver();
	}

	@BeforeClassSteps
	public void waitForAppReady(){
		new BahmniPage().waitForSpinner(driver);
	}

	@Step("On the login page")
	public void navigateToLoginPage() {
        driver.get(PageFactory.getLoginPage().LOGIN_URL);
    }

	@Step("Login with username <username> and password <password>")
	public void login(String username, String password){
        LoginPage loginPage = PageFactory.getLoginPage();
		loginPage.waitForElementOnPage(driver,"#username");
		loginPage.login(System.getenv(username), System.getenv(password));
    }

    @Step("Login to the application")
    public void login() {
        login("BAHMNI_GAUGE_APP_USER", "BAHMNI_GAUGE_APP_PASSWORD");
    }
}

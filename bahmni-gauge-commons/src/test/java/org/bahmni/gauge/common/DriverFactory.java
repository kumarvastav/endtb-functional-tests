package org.bahmni.gauge.common;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static WebDriver driver;

	//TODO: Remove this static method!!!!!
	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeSuite
	public void setup() {
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1440, 900));
	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}
}

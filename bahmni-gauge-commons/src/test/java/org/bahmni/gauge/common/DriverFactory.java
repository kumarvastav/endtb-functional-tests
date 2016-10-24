package org.bahmni.gauge.common;

import com.thoughtworks.gauge.AfterSpec;
import com.thoughtworks.gauge.BeforeSpec;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

	private static WebDriver driver;

	//TODO: Remove this static method!!!!!
	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeSpec
	public void setup() {
		ChromeDriverManager.getInstance().setup();
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver = new ChromeDriver(capability);
		driver.manage().window().setSize(new Dimension(1440, 900));
	}

	@AfterSpec
	public void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}
}

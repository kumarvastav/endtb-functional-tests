package org.bahmni.gauge.common;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

	private static WebDriver driver;

	//TODO: Remove this static method!!!!!
	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeSuite
	public void setup() {
		if(isCI()){
			setupRemoteDriver();
		}else{
			ChromeDriverManager.getInstance().setup();
			driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(1440, 900));
		}
	}

	private void setupRemoteDriver(){
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.LINUX);
		capabilities.setCapability("screenResolution","1024x768");
		try {
			String selenium_hub_ip = System.getenv("SELENIUM_HUB_IP");
			this.driver = new RemoteWebDriver(new URL(selenium_hub_ip), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@AfterSuite
	public void tearDown() {
		if(driver!=null){
			driver.close();
			driver.quit();
		}
	}

	private boolean isCI(){
		return System.getenv("env") !=null && System.getenv("env").equals("ci");
	}

}

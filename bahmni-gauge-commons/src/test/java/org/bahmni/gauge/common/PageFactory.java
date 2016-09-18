package org.bahmni.gauge.common;

import org.openqa.selenium.WebDriver;

public class PageFactory {

	public static <T extends BahmniPage> T get(Class<T> page) {
		WebDriver driver = DriverFactory.getDriver();
		T bahmniPage = org.openqa.selenium.support.PageFactory.initElements(driver, page);
		bahmniPage.setDriver(driver);
		return bahmniPage;
	}
}

package org.bahmni.gauge.common.formBuilder;

import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ImplementerInterfacePage extends BahmniPage {

	public static final String URL = BASE_URL.concat("/implementer-interface#/");

	@FindBy(how = How.CSS, using = "i.fa-user-secret")
	public WebElement formBuilder;

	public void clickFormBuilderApp() {
		formBuilder.click();
	}
}

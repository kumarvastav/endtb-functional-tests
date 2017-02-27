package org.bahmni.gauge.common.formBuilder;

import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FormBuilderPage extends BahmniPage {

	public static final String URL = BASE_URL.concat("/implementer-interface#/form-builder");

	@FindBy(how = How.CSS, using = ".btn--highlight")
	public WebElement createForm;

	@FindBy(how= How.CSS, using = ".form-name")
	public WebElement formNameInput;

	@FindBy(how= How.CSS, using = ".button")
	public WebElement btnCreateForm;

	public void clickCreateForm() {
		createForm.click();
	}

	public void enterName(String formName) {
		formNameInput.sendKeys(formName);
		btnCreateForm.click();
	}
}

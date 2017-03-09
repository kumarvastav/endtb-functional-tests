package org.bahmni.gauge.common.formBuilder;

import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class FormBuilderPage extends BahmniPage {

	public static final String URL = BASE_URL.concat("/implementer-interface#/form-builder");

	@FindBy(how = How.CSS, using = ".btn--highlight")
	public WebElement createForm;

	@FindBy(how= How.CSS, using = ".form-name")
	public WebElement formNameInput;

	@FindBy(how= How.CSS, using = "tbody")
	public WebElement formTableBody;

	@FindBy(how= How.CSS, using = ".button")
	public WebElement btnCreateForm;

	public void clickCreateForm() {
		createForm.click();
	}

	public void enterName(String formName) {
		formNameInput.sendKeys(formName);
		btnCreateForm.click();
		waitForSpinner();
	}

    public void clickOnAction(String versionNumber, String formName) {
		WebElement icon = findFormIcon(formName, versionNumber);
		icon.click();
    }

    public WebElement findFormByNameAndVersion(String versionNum, String formName) {
		WebElement formIcon = findFormIcon(formName, versionNum);
		return formIcon.findElement(By.xpath("../.."));
	}

	private WebElement findFormIcon(String formName, String versionNumber) {
		List<WebElement> formList = formTableBody.findElements(By.cssSelector("tr"));
		for(int i = 0; i < formList.size(); i++) {
			if(formList.get(i).findElements(By.cssSelector("td")).get(0).getText().equals(formName) &&
					formList.get(i).findElements(By.cssSelector("td")).get(1).getText().equals(versionNumber)){
				return formList.get(i).findElement(By.cssSelector("a"));
			}
		}
		return null;
	}
}

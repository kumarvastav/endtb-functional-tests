package org.bahmni.gauge.common.formBuilder;

import com.thoughtworks.selenium.Selenium;
import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class FormDetailPage extends BahmniPage {
    @FindBy(how = How.CSS, using = "button")
    public WebElement editButton;

	@FindBy(how = How.CSS, using = ".button")
	public WebElement okButton;

	@FindBy(how = How.CSS, using = ".breadcrumbs")
	public  WebElement breadCrumbsGuider;

	@FindBy(how = How.CSS, using = ".publish-button")
    public  WebElement publishButton;

    @FindBy(how = How.CSS, using = ".header-title")
    public  WebElement formHeader;

	@FindBy(how = How.CSS, using = ".grid")
	public  WebElement canvas;

	@FindBy(how = How.CSS, using = ".save-button")
	public  WebElement saveButton;

	@FindBy(how = How.CSS, using = ".form-properties")
	public  WebElement propertiesBody;

	public void clickOnEdit() {
		editButton.click();
	}

	public void clickOnOK() { okButton.click(); }

	public void clickOnFormBuilder() {
		breadCrumbsGuider.findElements(By.cssSelector("a")).get(1).click();
	}

    public void clickOnPublish() {
	    publishButton.click();
    }

    public String getFormInfo() {
        return formHeader.getText();
    }

	public List<WebElement> getCanvasBodyLabelList() {
		return canvas.findElements(By.cssSelector("label"));
	}

	public void clickOnSave() {
		saveButton.click();
	}
	public void clickOnControl(WebElement control) {
		control.click();
	}

	public void clickOnProperty(String propertyType) {
		List<WebElement> allPropertyType = propertiesBody.findElements(By.cssSelector("label"));
		List<WebElement> propertyCheckBox = propertiesBody.findElements(By.cssSelector("input"));

		for (int i = 0; i < allPropertyType.size(); i++) {
			if (allPropertyType.get(i).getText().equals(propertyType)) {
				propertyCheckBox.get(i).click();
			}
		}
	}


	public WebElement getEditButton() {
		return editButton;
	}

	public void changeName(String labelName, String name) {
		List<WebElement> labelList = driver.findElements(By.tagName("label"));
		for (WebElement label : labelList) {
			if(label.getText().contains(labelName)){
				WebElement parentElement = label.findElement(By.xpath("../.."));

				Actions action = new Actions(driver).doubleClick(label);
				action.build().perform();

				WebElement childElement = parentElement.findElement(By.cssSelector(".form-builder-label"));

				childElement.clear();
				childElement.sendKeys(name);
			}
		}
	}
}

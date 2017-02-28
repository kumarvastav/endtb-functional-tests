package org.bahmni.gauge.common.formBuilder;

import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FormDetailPage extends BahmniPage {
	@FindBy(how = How.CSS, using = "button")
	public WebElement editButton;

	@FindBy(how = How.CSS, using = ".button")
	public WebElement okButton;

	@FindBy(how = How.CSS, using = ".breadcrumbs")
	public  WebElement breadCrumbsGuider;

	@FindBy(how = How.CSS, using = ".publish-button")
    public  WebElement publishButton;

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
}

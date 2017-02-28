package org.bahmni.gauge.common.formBuilder;

import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FormDetailPage extends BahmniPage {
	@FindBy(how = How.CSS, using = "button")
	public WebElement editButton;

	public void clickOnEdit() {
		editButton.click();
	}
}

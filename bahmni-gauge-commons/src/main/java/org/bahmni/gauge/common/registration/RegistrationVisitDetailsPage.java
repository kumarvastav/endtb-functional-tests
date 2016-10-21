package org.bahmni.gauge.common.registration;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.common.registration.domain.Visit;
import org.bahmni.gauge.data.StoreHelper;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.bahmni.gauge.util.TableTransformer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationVisitDetailsPage extends BahmniPage{
	
	@FindBy(how= How.CSS, using = "#observation_1")
	public WebElement height;
	
	@FindBy(how= How.CSS, using = "#observation_2")
	public WebElement weight;
	
	@FindBy(how= How.CSS, using = "#observation_4")
	public WebElement fees;
	
	@FindBy(how= How.CSS, using = "#observation_5")
	public WebElement comments;
	
	@FindBy(how= How.CSS, using = ".confirm")
	public WebElement saveButton;
	
	@FindBy(how= How.CSS, using = ".fa-home")
	public WebElement homeButton;
	
	@FindBy(how= How.CSS, using = "button[ng-click='back()']")
	public WebElement backButton;

	@FindBy(how= How.CSS, using = "button.cancel")
	public WebElement closeVisit;
	
	@FindBy(how= How.CSS, using = ".fa-search")
	public WebElement searchLink;

	@FindBy(how= How.CSS, using = "#visitDisplayTable tr:nth-last-child(1) a")
	public WebElement openLastVisit;

	public void closeVisit(WebDriver driver) {
		closeVisit.click();
		waitForAlertPopup(driver);
		acceptAlert(driver);
	}
	public void tryCloseVisit(){
		closeVisit.click();
	}
	public void openLastVisit() {
		openLastVisit.click();
	}

	public String getDisplayControlText(String displayControlName) {
			waitForElementOnPage("[data-ng-switch-when*='"+displayControlName+"']");
			WebElement displayControl = findElement(By.cssSelector("[data-ng-switch-when*='"+displayControlName.toLowerCase()+"']"));
			waitForSpinner();
			return displayControl.getText().replace("\n", "");

	}

	@Step("Open visit for previous patient using api <table>")
	public void openVisitThroughApi(Table table){
		Visit visit=new TableTransformer<>(Visit.class).transformTableToEntity(table);
		visit.setPatient(StoreHelper.getEntityInSpectStore(Patient.class));
		switch (visit.getLocation().toLowerCase())
		{
			case "opd-1":
				visit.setLocation("c58e12ed-3f12-11e4-adec-0800271c1b75");
				break;
			default:
				visit.setLocation("c58e12ed-3f12-11e4-adec-0800271c1b75");
				break;
		}

		switch (visit.getType().toLowerCase())
		{
			case "opd":
				visit.setType("c22a5000-3f10-11e4-adec-0800271c1b75");
				break;
			default:
				visit.setType("c22a5000-3f10-11e4-adec-0800271c1b75");
				break;
		}
		BahmniRestClient.get().create(visit);
		storeVisitInSpecStore(visit);
	}
}

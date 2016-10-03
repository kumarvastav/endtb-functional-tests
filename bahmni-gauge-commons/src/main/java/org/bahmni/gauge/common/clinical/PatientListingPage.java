package org.bahmni.gauge.common.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PatientListingPage extends BahmniPage {

	@FindBy(how= How.CSS, using = ".tabs .tab-item")
    public List<WebElement> tab;

    @FindBy(how= How.CSS, using = "#patientIdentifier")
    public WebElement searchbox_txt;
    
    @FindBy(how= How.CSS, using = ".active-patient")
    public List<WebElement> patient_list;
    
    @FindBy(how= How.CSS, using = ".patient-list-table")
    public WebElement patient_table;

	@FindBy(how= How.CSS, using = "button[type='submit']")
	public WebElement search_btn;
    
    public WebElement findTab(String Tab){
    	for(int i=0;i<=tab.size();i++)
    	{
    		if(tab.get(i).getText().contains(Tab))
    			return tab.get(i);
    	}
    	return tab.get(tab.size()-1);
    }
    
    public void clickTab(String Tab){
    	WebElement tab = findTab(Tab);
    	tab.click();
    }
    
    public void enterPatientIDOrName(String Patient){
    	searchbox_txt.sendKeys(Patient);
    }
    
    public void selectPatient(String Patient){
		WebElement lastElement = null;
    	for (WebElement patient : patient_list){
    		if (patient.findElement(By.cssSelector(".patient-id")).getText().contains(Patient) ||
					patient.findElement(By.cssSelector(".patient-name")).getText().contains(Patient)){
    			lastElement = patient;
			}
		}
		lastElement.click();
		return;
    }
  
    public void searchSelectPatientFromTab(String patientID, String tab) {
		clickTab(tab);
    	enterPatientIDOrName(patientID);
		if("All".equals(tab)){
			search_btn.click();
		}
		waitForSpinner();
    	selectPatient(patientID);
    }
}

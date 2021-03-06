package org.bahmni.test.page.home;

import org.bahmni.test.Common;
import org.bahmni.test.page.BahmniPage;
import org.bahmni.test.page.PageFactory;
import org.bahmni.test.page.registration.RegistrationSearch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BahmniPage {

	@FindBy(how= How.CSS, using = "i.icon-bahmni-registration")
    public WebElement registration;
	
	@FindBy(how= How.CSS, using = "i.icon-bahmni-documents")
    public WebElement patientDocuments;
	
	@FindBy(how= How.CSS, using = "i.icon-bahmni-admin")
    public WebElement admin;
	
	@FindBy(how= How.CSS, using = "i.icon-bahmni-reports")
    public WebElement exports;

	//TODO: logout doesn't recognize
	@FindBy(how= How.XPATH, using = "#view-content > div > header > div > ul > li:nth-child(3) > a > span")
	public WebElement logout;

    public RegistrationSearch clickRegistrationApp(){
    	registration.click();
	    return PageFactory.getRegistrationSearchPage();
    }
    
    public void clickPatientRecords() throws InterruptedException {
    	Common.waitForSpinner();
    	patientDocuments.click();
    }
    
    public void clickAdminApp() throws InterruptedException {
    	Common.waitForSpinner();
    	admin.click();
    }
    
    public void clickExportsApp() throws InterruptedException {
    	Common.waitForSpinner();
    	exports.click();
    }

	public void logout(){
		logout.click();
	}
}

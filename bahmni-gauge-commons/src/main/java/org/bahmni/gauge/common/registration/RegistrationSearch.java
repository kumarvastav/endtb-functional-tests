package org.bahmni.gauge.common.registration;

import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.data.BahmniTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegistrationSearch extends BahmniPage{

	@FindBy(how= How.CSS, using = ".fa-home")
    public WebElement iconHome;
	
	@FindBy(how= How.CSS, using = ".fa-search")
    public WebElement iconSearch;
	
	@FindBy(how= How.CSS, using = "i.fa-plus")
    public WebElement iconCreateNew;
	
	@FindBy(how= How.CSS, using = "#registrationNumber")
    public WebElement txtRegistration;
	
	@FindBy(how= How.CSS, using = "#name")
    public WebElement txtName;

	@FindBy(how= How.CSS, using = "#addressFieldValue")
	public WebElement txtGramPanchayat;
	
	@FindBy(how= How.CSS, using = "#identifierPrefix")
    public List<WebElement> txtIdentifier;
	
	@FindBy(how= How.CSS, using = ".search-patient-id .reg-srch-btn")
    public WebElement btnIdentifierSearch;

	@FindBy(how = How.CSS, using = ".search-seperator-r .reg-srch-btn")
	public WebElement btnRegSearch;
	
	@FindBy(how= How.CSS, using = ".registraition-search-results-container > table")
    public WebElement gridSearchResults;

	@FindBy(how= How.CSS, using = "#programAttribute")
	public WebElement prgm_attribute;

    public void clickSearch() {
    	iconSearch.click();
    }

    public void clickHome() {
    	iconHome.click();
    }

    public void clickCreateNew() {
    	iconCreateNew.click();
    }

    public void verifyCreateNewIconNotDisplayed(){
    		Assert.assertFalse(driver.findElements(By.cssSelector("i.fa-plus")).size() != 0);
	}

    public void enterName(String name) {
    	txtName.sendKeys(name,Keys.ENTER);
    }

    public void searchByExactIdentifier(String prefix, String id){
	    selectPrefix(prefix);

	    txtRegistration.sendKeys(id);
	    btnIdentifierSearch.click();
    }

	private void selectPrefix(String prefix) {
		if(txtIdentifier.size()>0){
			new Select(txtIdentifier.get(0)).selectByVisibleText(prefix);
		}
	}

	public void searchByIdentifier(String prefix, String id){
		selectPrefix(prefix);

		txtRegistration.sendKeys(id);
		btnIdentifierSearch.click();
    }

	public void searchByName(String name){
		txtName.sendKeys(name);
		btnRegSearch.click();
	}

	public void searchByProgramAttribute(String attribute){
		prgm_attribute.sendKeys(attribute);
		btnRegSearch.click();
	}

	public void getFirstResult() {
		waitForElementOnPage(gridSearchResults);
		gridSearchResults.findElements(By.tagName("a")).get(0).click();
	}
	public void verifySearchResults(){
		//TODO: add verifying search results
	}
	public void verifySearchResults(Patient patient){
		BahmniTable dataOnUI=extractTableDataFrom(By.className("table"));
		for(TableRow row : dataOnUI.getTableRows()){
			if(row.getCell("ID").equals(patient.getIdentifier()))
			{
				Assert.assertEquals("Name dont match",patient.getFirstName()+" " + patient.getLastName(),row.getCell("Name"));
				Assert.assertEquals("Gender dont match",patient.getGender().equals("Male")?"M":patient.getGender().equals("Female")?"F":"O",row.getCell("Gender"));
				Assert.assertEquals("Age dont match",patient.getAge(),row.getCell("Age"));
			}
		}
	}
	public void verifySearchResults(String text, String column) {
		BahmniTable dataOnUI=extractTableDataFrom(By.className("table"));
		Assert.assertTrue("Column values dont match",dataOnUI.doesColumnOfEachRowContainsValue(text,column));
	}

    public void searchByGramPanchayat(String gramPanchayat) {
		txtGramPanchayat.sendKeys(gramPanchayat);
		btnRegSearch.click();
    }
}

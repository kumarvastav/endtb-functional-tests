package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.registration.RegistrationSearch;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationSearchSpec {

	@BeforeClassSteps
	public void waitForAppReady(){
		BahmniPage.waitForSpinner(DriverFactory.getDriver());
	}

	@Step("Click on create new patient link")
	public void clickOnCreateNew() {
        RegistrationSearch registrationSearch = PageFactory.get(RegistrationSearch.class);
		registrationSearch.clickCreateNew();
	}

	@Step({"Click on search patient link","Navigate to Registration search page"})
	public void clickOnSearch() {
        RegistrationSearch registrationSearch = PageFactory.get(RegistrationSearch.class);
		registrationSearch.clickSearch();
	}

	@Step("Search patient with prefix <prefix> identifier <identifier>")
	public void clickOnSearch(String prefix, String identifier) {
        RegistrationSearch registrationSearch = PageFactory.get(RegistrationSearch.class);
		registrationSearch.searchByIdentifier(prefix, identifier);
	}

	@Step("Search patient with name <name>")
	public void searchPatientByName(String name){
		RegistrationSearch registrationSearch = PageFactory.get(RegistrationSearch.class);
		registrationSearch.searchByName(name);
	}

	@Step("Search previously created patient with exact identifier")
	public void searchPreviousCreatedPatientWithIdentifier() {
        RegistrationSearch registrationSearch = PageFactory.get(RegistrationSearch.class);
		Patient recentlyCreatedPatient = registrationSearch.getPatientFromSpecStore();
		waitForAppReady();
		registrationSearch.searchByExactIdentifier(recentlyCreatedPatient.getPrefix(), recentlyCreatedPatient.getIdNumber());

	}

	@Step("Search previously created patient with name")
	public void searchPreviouslyCreatedPatientWithName(){
        RegistrationSearch registrationSearch = PageFactory.get(RegistrationSearch.class);
		Patient recentlyCreatedPatient = registrationSearch.getPatientFromSpecStore();
		registrationSearch.searchByName(recentlyCreatedPatient.getFirstName());
	}

	@Step("Search previously created patient with gram panchayat")
	public void searchPreviouslyCreatedPatientWithGramPancjayat(){
		RegistrationSearch registrationSearch = PageFactory.get(RegistrationSearch.class);
		Patient recentlyCreatedPatient = registrationSearch.getPatientFromSpecStore();
		registrationSearch.searchByGramPanchayat(recentlyCreatedPatient.getGramPanchayat());
	}

	@Step("Select the patient from the search results")
	public void ensureThatTheSearchResultsAreShown(){
        RegistrationSearch registrationSearch = PageFactory.get(RegistrationSearch.class);
		registrationSearch.getFirstResult();
	}

	@Step("Validate that the search results are displayed")
	public void validateSearchResults() {
        RegistrationSearch registrationSearch = PageFactory.get(RegistrationSearch.class);
			registrationSearch.verifySearchResults();
	}

	@Step("Verify search result contains <searchText> in column <column>")
	public void validateSearchResults(String searchText, String column) {
		RegistrationSearch registrationSearch = PageFactory.get(RegistrationSearch.class);
		registrationSearch.verifySearchResults(searchText,column);
	}
	@Step("Verify previous patient is listed in search result")
	public void validatePreviousPatientSearchResults() {
		RegistrationSearch registrationSearch = PageFactory.get(RegistrationSearch.class);
		registrationSearch.verifySearchResults(new BahmniPage().getPatientFromSpecStore());
	}
	@Step("Click on previous patient link from search results")
	public void clickOnPreviousPatientLink(){
		RegistrationSearch registrationSearch = PageFactory.get(RegistrationSearch.class);
		registrationSearch.findElement(By.xpath(".//a[contains(text(),\""+new BahmniPage().getPatientFromSpecStore().getIdentifier()+"\")]")).click();
	}
}

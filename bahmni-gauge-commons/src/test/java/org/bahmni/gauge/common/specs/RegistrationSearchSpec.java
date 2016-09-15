package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.registration.RegistrationSearch;
import org.bahmni.gauge.common.registration.domain.Patient;

public class RegistrationSearchSpec {

	@BeforeClassSteps
	public void waitForAppReady(){
		new BahmniPage().waitForSpinner(DriverFactory.getDriver());
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

	@Step("Search previously created patient with exact identifier")
	public void searchPreviousCreatedPatientWithIdentifier() {
        RegistrationSearch registrationSearch = PageFactory.get(RegistrationSearch.class);
		Patient recentlyCreatedPatient = registrationSearch.getPatientFromSpecStore();
		registrationSearch.searchByExactIdentifier(recentlyCreatedPatient.getPrefix(), recentlyCreatedPatient.getIdNumber());

	}

	@Step("Search previously created patient with name")
	public void searchPreviouslyCreatedPatientWithName(){
        RegistrationSearch registrationSearch = PageFactory.get(RegistrationSearch.class);
		Patient recentlyCreatedPatient = registrationSearch.getPatientFromSpecStore();
		registrationSearch.searchByName(recentlyCreatedPatient.getFirstName());
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
}

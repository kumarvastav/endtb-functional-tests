package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.PatientListingPage;
import org.bahmni.gauge.common.registration.domain.Patient;

public class PatientListingPageSpec extends BahmniPage {

    @BeforeClassSteps
    public void waitForAppReady(){
        new BahmniPage().waitForSpinner(DriverFactory.getDriver());
    }

    @Step("Select existing patient from patient listing page under tab <tab>")
    public void selectPatientFromTab(String tab) {
        PatientListingPage patientListing = PageFactory.getPage(PatientListingPage.class);
        Patient patient = getPatientFromSpecStore();
        patientListing.searchSelectPatientFromTab(patient.getIdentifier(),tab);
        //patientListing.searchSelectPatientFromTab("BAH253047",tab);
    }

    @Step("Select patient <patient> in tab <tab>")
    public void selectPatient(String patientID , String tab){
        PatientListingPage patientListing = PageFactory.getPatientListingPage();
        patientListing.searchSelectPatientFromTab(patientID,tab);
    }
}

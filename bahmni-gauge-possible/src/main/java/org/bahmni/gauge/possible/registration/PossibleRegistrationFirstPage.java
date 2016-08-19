package org.bahmni.gauge.possible.registration;

import com.thoughtworks.gauge.TableRow;
import com.thoughtworks.gauge.datastore.DataStore;
import com.thoughtworks.gauge.datastore.DataStoreFactory;
import org.bahmni.gauge.common.registration.RegistrationFirstPage;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.possible.registration.domain.PossiblePatient;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PossibleRegistrationFirstPage extends RegistrationFirstPage {

    @FindBy(how = How.CSS, using = ".confirm")
    public WebElement programEnrollment;

    @FindBy(how = How.CSS, using = "#address1")
    public WebElement ward;

    @FindBy(how = How.CSS, using = "#cityVillage")
    public WebElement municipality;

    @FindBy(how = How.CSS, using = "#countyDistrict")
    public WebElement district;

    @FindBy(how = How.CSS, using = "#country")
    public WebElement country;

    @FindBy(how = How.CSS, using = "#Caste")
    public WebElement caste;

    @Override
    protected void doActions(Patient patient) {
        PossiblePatient possiblePatient = (PossiblePatient) patient;
        ward.sendKeys(possiblePatient.getWard());
        municipality.sendKeys(possiblePatient.getMunicipality());
        district.sendKeys(possiblePatient.getDistrict());
        country.sendKeys(possiblePatient.getCountry());
        new Select(caste).selectByVisibleText(possiblePatient.getCaste());
    }

    public Patient transformTableRowToPatient(TableRow row, List<String> headers) throws Exception {
        PossiblePatient patient = new PossiblePatient();
        /* set default values to the patient*/
        patient.setLastName("possiblePatient");
        return transform(row, patient, headers);
    }

    public void storePatientInSpecStore(Patient value) {
        DataStore specStore = DataStoreFactory.getSpecDataStore();
        specStore.put(PATIENT_KEY, value);
    }

}

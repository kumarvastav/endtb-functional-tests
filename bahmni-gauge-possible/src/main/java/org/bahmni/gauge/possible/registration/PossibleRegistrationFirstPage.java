package org.bahmni.gauge.possible.registration;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.registration.RegistrationFirstPage;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.possible.registration.domain.PossiblePatient;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        transform(row, patient, headers);
        patient.setDateOfBirth(convertDate(patient.getDateOfBirth()));
        return patient;
    }

    private String convertDate(String dateOfBirth) throws ParseException {
        SimpleDateFormat userFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat serverFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        return serverFormat.format(userFormat.parse(dateOfBirth));

    }

    public void createPatientUsingApi(Table table) throws Exception {
        Patient patient = transformTableToPatient(table);
        BahmniRestClient.get().createPatient(patient, "patient_create.ftl");
        storePatientInSpecStore(patient);
    }
}

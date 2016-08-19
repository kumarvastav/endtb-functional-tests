package org.bahmni.gauge.endtb.registration;

import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.registration.RegistrationFirstPage;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.endtb.registration.domain.EndTBPatient;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Date;
import java.util.List;
import java.util.Random;


public class EndTBRegistrationFirstPage extends RegistrationFirstPage {

	@FindBy(how= How.CSS, using = ".confirm")
	public WebElement programEnrollment;

	@FindBy(how= How.ID, using = "nationalIdentificationNumber")
	public WebElement txtNationalIdentificationNumber;

	@Override
	protected void doActions(Patient patient) {
		EndTBPatient endTBPatient = (EndTBPatient) patient;
		txtNationalIdentificationNumber.sendKeys(endTBPatient.getNationalIdentificationNumber());
	}

	public void clickTreatmentRegistration() {
		programEnrollment.click();
	}

	public Patient transformTableRowToPatient(TableRow row, List<String> headers) throws Exception {
		EndTBPatient patient = new EndTBPatient();
        /* set default values to the patient*/
		patient.setPrefix("EMR");
        patient.setIdNumber(String.valueOf(new Random().nextInt()));
		patient.setDateOfBirth(String.valueOf(new Date()));
		patient.setAge("50");
		return transform(row, patient, headers);
	}
}

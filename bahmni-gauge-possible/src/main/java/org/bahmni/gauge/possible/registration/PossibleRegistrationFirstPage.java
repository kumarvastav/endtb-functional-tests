package org.bahmni.gauge.possible.registration;

import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.registration.RegistrationFirstPage;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.possible.registration.domain.PossiblePatient;
import org.bahmni.gauge.possible.program.domain.PossibleProgram;
import org.bahmni.gauge.possible.registration.domain.PossiblePatient;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.Date;
import java.util.List;
import java.util.Random;


public class PossibleRegistrationFirstPage extends RegistrationFirstPage {

	@FindBy(how= How.CSS, using = ".confirm")
	public WebElement programEnrollment;

	@FindBy(how= How.CSS, using = "#address1")
	public WebElement ward;

	@FindBy(how= How.CSS, using = "#cityVillage")
	public WebElement municipality;

	@FindBy(how= How.CSS, using = "#countyDistrict")
	public WebElement district;

	@FindBy(how= How.CSS, using = "#country")
	public WebElement country;

	@FindBy(how= How.CSS, using = "#Caste")
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

	public Patient transformTableRowToPatient(TableRow row, List<String> columnNames){
		String randomPatientId;
		if(row.getCell(columnNames.get(0)).length() <= 3)
			randomPatientId = "BAH"+ new Random().nextInt();
		else
			randomPatientId = row.getCell(columnNames.get(0));
		PossiblePatient patient = new PossiblePatient(randomPatientId, row.getCell(columnNames.get(1)),
				row.getCell(columnNames.get(2)), row.getCell(columnNames.get(3)), new Date(), 50,
				row.getCell(columnNames.get(6)),row.getCell(columnNames.get(7)),row.getCell(columnNames.get(8)),
				row.getCell(columnNames.get(9)),row.getCell(columnNames.get(10)) );
		return patient;
	}
}

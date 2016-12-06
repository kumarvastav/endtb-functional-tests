package org.bahmni.gauge.endtb.program;

import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.program.ProgramManagementPage;
import org.bahmni.gauge.common.program.domain.Program;
import org.bahmni.gauge.endtb.program.domain.EndTBProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class EndTBProgramManagementPage extends ProgramManagementPage {

	@FindBy(how= How.ID, using = "Registration Number")
	public WebElement txtRegistrationNumber;

	@FindBy(how= How.ID, using = "Registration Facility")
	public WebElement cmbRegistrationFacility;

	protected void doActions(Program treatment) {
		super.doActions(treatment);
		EndTBProgram endTBProgram = (EndTBProgram) treatment;
		txtRegistrationNumber.sendKeys(endTBProgram.getRegistrationNumber());
		new Select(cmbRegistrationFacility).selectByVisibleText(endTBProgram.getRegistrationFacility());
	}

	protected void doModifyEnrollmentDetails(WebElement programToModify, Program treatment) {
		super.doModifyEnrollmentDetails(programToModify,treatment);

		EndTBProgram endTBProgram = (EndTBProgram)treatment;

		WebElement txtEditRegistrationNumber = programToModify.findElement(By.cssSelector("[id='Registration Number']"));
		txtEditRegistrationNumber.clear();
		txtEditRegistrationNumber.sendKeys(endTBProgram.getRegistrationNumber());

		WebElement cmbEditRegistrationFacility = programToModify.findElement(By.cssSelector("[id='Registration Facility']"));
		new Select(cmbEditRegistrationFacility).selectByVisibleText(endTBProgram.getRegistrationFacility());

	}

	public Program transformTableToProgram(Table table) {
		Program program = super.transformTableToProgram(table);

		String registrationNumber = String.valueOf(new Random().nextInt());
		String registrationFacility = table.getTableRows().get(0).getCell(table.getColumnNames().get(2));

		return new EndTBProgram(program.getName(),program.getDateOfRegistration(),registrationNumber,registrationFacility);
	}
}

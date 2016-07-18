package org.bahmni.test.page;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.test.DriverFactory;
import org.bahmni.test.page.program.ProgramManagementPage;
import org.bahmni.test.page.program.domain.Program;
import org.junit.Assert;

public class ProgramManagementSpec {

	@BeforeClassSteps
	public void waitForAppReady(){
		new BahmniPage().waitForSpinner(DriverFactory.getDriver());
	}

	@Step("Register the patient to following program <programDetails>")
	public void enrollPatientToProgram(Table programDetails) {
		ProgramManagementPage programManagementPage = org.bahmni.test.PageFactory.getProgramManagementPage();
		Program treatment = programManagementPage.transformTableToProgram(programDetails);
		programManagementPage.storeProgramInSpecStore(treatment);
		programManagementPage.enrollPatientToProgram(treatment);
	}

	@Step("Ensure that the patient is registered to mentioned program")
	public void verifyThePatientIsEnrolledToTheProgram() {
		ProgramManagementPage programManagementPage = org.bahmni.test.PageFactory.getProgramManagementPage();
		Program programDetails = programManagementPage.getProgramFromSpecStore();
		Assert.assertTrue(programManagementPage.isPatientEnrolledToProgram(programDetails));
	}

	@Step("Edit attribute to registration <registration> and facility <facility>")
	public void editAttributesEnrolledToTheProgram(String registration, String facility) {
		ProgramManagementPage programManagementPage = org.bahmni.test.PageFactory.getProgramManagementPage();
		Program programDetails = programManagementPage.getProgramFromSpecStore();
		programManagementPage.editProgramAttributes(programDetails, registration, facility);
	}

	@Step("End the program <TB Program>")
	public void endTheProgram(Program program) {
		ProgramManagementPage programManagementPage = org.bahmni.test.PageFactory.getProgramManagementPage();
		Program programDetails = programManagementPage.getProgramFromSpecStore();
		programManagementPage.endProgram(program);
	}
}

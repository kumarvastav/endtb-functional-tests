package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.DashboardPage;
import org.bahmni.gauge.common.clinical.displaycontrol.ObsDisplayControl;
import org.bahmni.gauge.common.home.HomePage;
import org.bahmni.gauge.common.program.domain.PatientProgram;
import org.bahmni.gauge.common.program.domain.Program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DashboardPageSpec {

	protected final WebDriver driver;

	public DashboardPageSpec() {
		this.driver = DriverFactory.getDriver();
	}

	@BeforeClassSteps
	public void waitForAppReady() {
		BahmniPage.waitForSpinner(driver);
	}

	@Step("Ensure that <id> Obs display control with title <title> has correct data <table>")
	public void validateContentInDisplayControl(String id, String title, Table table) {
		DashboardPage dashboardPage = PageFactory.get(DashboardPage.class);
		DashboardPage.waitForSpinner(driver);

		WebElement displayControl = dashboardPage.findElementById(id);
		assertNotNull("The display control with id [" + id + "] not found", displayControl);

		ObsDisplayControl obsDisplayControl = new ObsDisplayControl(displayControl);
		assertEquals("The display control with title [" + title + "] is incorrect", title, obsDisplayControl.getTitle());

		Map<String, String> keyValues = obsDisplayControl.getKeyValues();
		List<String> columnNames = table.getColumnNames();

		for (String columnName : columnNames) {
			assertEquals("The column [" + columnName + "] has incorrect data for the patient ["+dashboardPage.getPatientFromSpecStore().getIdNumber()+"]",
					table.getTableRows().get(0).getCell(columnName), keyValues.get(columnName));
		}
	}

	@Step("Ensure that <id> Obs display control has the message <message>")
	public void validateNoContentInDisplayControl(String id, String message) {
        DashboardPage dashboardPage = PageFactory.get(DashboardPage.class);
		BahmniPage.waitForSpinner(driver);

		WebElement displayControl = dashboardPage.findElementById(id);
		assertNotNull("The display control with id [" + id + "] not found", displayControl);

		ObsDisplayControl obsDisplayControl = new ObsDisplayControl(displayControl);
		assertEquals("The message when no data available is incorrect", obsDisplayControl.getNoRecordsFoundText(), message);

	}

	@Step("On the dashboard page")
	public void navigateToDashboardPage() {
        DashboardPage dashboardPage = PageFactory.get(DashboardPage.class);
		PatientProgram patientProgram = dashboardPage.getPatientProgramFromSpecStore();
		String url = String.format(DashboardPage.URL,patientProgram.getPatient().getUuid(),patientProgram.getPatientProgramUuid());
		driver.get(url);
	}

	@Step("Click on <name> dashboard")
	public void clickOnDashboard(String name) {
        DashboardPage dashboardPage = PageFactory.get(DashboardPage.class);
		BahmniPage.waitForSpinner(driver);
		dashboardPage.selectDashboard(name);
		waitForAppReady();
	}

	@Step("Navigate to dashboard")
	public void navigateToHomePage() {
		driver.get(HomePage.URL);
	}

	@Step("Navigate to dashboard link")
	public void navigateToDashboardLink() {
		driver.findElement(By.id("dashboard-link")).click();
	}

	@Step("Navigate to consultation")
	public void goToConsultation(){
        DashboardPage dashboardPage = PageFactory.get(DashboardPage.class);
		waitForAppReady();
		dashboardPage.clickEnterData();
		waitForAppReady();
	}

	@Step("Ensure that the program is updated on patient program dashboard")
	public void verifyProgramUpdatedOnDashboard(){
		Program program=PageFactory.getProgramManagementPage().getProgramFromSpecStore();
		PageFactory.getProgramDashboardPage().validateProgramsDisplayControl(program);

	}
	@Step("Verify details on dashboard <Programs> display control")
	public void selectDisplayControl(String name) {
		DashboardPage dashboardPage = PageFactory.get(DashboardPage.class);
		dashboardPage.selectDisplayControl(name);
	}

	@Step("Verify data on Obs display control")
	public void verifyObsDisplayControl(){
		DashboardPage dashboardPage = PageFactory.get(DashboardPage.class);
		dashboardPage.validateVitalsObservationDisplayControl();
	}

	@Step("Navigate to Program Management Page from dashboard page")
	public void navigateToProgramManagementPageFromDashboardPage(){
		DashboardPage dashboardPage = PageFactory.get(DashboardPage.class);
	}

	@Step("Verify Vitals display control is empty")
	public void verifyDisplayControlEmpty(){
		DashboardPage dashboardPage = PageFactory.get(DashboardPage.class);
		dashboardPage.verifyNoVitals();
	}
}

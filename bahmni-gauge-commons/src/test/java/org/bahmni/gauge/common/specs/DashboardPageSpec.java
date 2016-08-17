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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DashboardPageSpec {

	private final WebDriver driver;

	public DashboardPageSpec() {
		this.driver = DriverFactory.getDriver();
	}

	@BeforeClassSteps
	public void waitForAppReady() {
		new BahmniPage().waitForSpinner(driver);
	}

	@Step("Ensure <Treatment-Information> display control with title <Treatment Information> with <01 Jul 16> as Start Date <table>")
	public void validateContentInDisplayControl(String id, String title, String treatmentStartDate, Table table) throws ParseException {
		DashboardPage dashboardPage = PageFactory.getDashboardPage();
		dashboardPage.waitForSpinner(driver);

		WebElement displayControl = dashboardPage.findElementById(id);
		assertNotNull("The display control with id [" + id + "] not found", displayControl);

		ObsDisplayControl obsDisplayControl = new ObsDisplayControl(displayControl);
		assertEquals("The display control with title [" + title + "] is incorrect", title, obsDisplayControl.getTitle());

		Map<String, String> keyValues = obsDisplayControl.getKeyValues();
		List<String> columnNames = table.getColumnNames();

		String currentMonthOfTreatment = dashboardPage.calculateCurrentMonthOfTreatment(treatmentStartDate);
		table.addRow(Arrays.asList(currentMonthOfTreatment, treatmentStartDate));

		for (String columnName : columnNames) {
			assertEquals("The column [" + columnName + "] has incorrect data for the patient ["+dashboardPage.getPatientFromSpecStore().getIdNumber()+"]",
					table.getTableRows().get(0).getCell(columnName), keyValues.get(columnName));
		}
	}

	@Step("Ensure that <id> Obs display control has the message <message>")
	public void validateNoContentInDisplayControl(String id, String message) {
		DashboardPage dashboardPage = PageFactory.getDashboardPage();
		dashboardPage.waitForSpinner(driver);

		WebElement displayControl = dashboardPage.findElementById(id);
		assertNotNull("The display control with id [" + id + "] not found", displayControl);

		ObsDisplayControl obsDisplayControl = new ObsDisplayControl(displayControl);
		assertEquals("The message when no data available is incorrect", obsDisplayControl.getNoRecordsFoundText(), message);

	}

	@Step("On the dashboard page")
	public void navigateToDashboardPage() {
		DashboardPage dashboardPage = PageFactory.getDashboardPage();
		PatientProgram patientProgram = dashboardPage.getPatientProgramFromSpecStore();
		String url = String.format(DashboardPage.URL,patientProgram.getPatient().getUuid(),patientProgram.getPatientProgramUuid());
		driver.get(url);
	}

	@Step("Click on <name> dashboard")
	public void clickOnDashboard(String name) {
		DashboardPage dashboardPage = PageFactory.getDashboardPage();
		dashboardPage.waitForSpinner(driver);
		dashboardPage.selectDashboard(name);
	}

	@Step("Navigate to dashboard")
	public void navigateToHomePage() {
		driver.get(HomePage.URL);
	}


	@Step("Navigate to consultation")
	public void goToConsultation(){
		DashboardPage dashboardPage = PageFactory.getDashboardPage();
		dashboardPage.clickEnterData();
	}
}

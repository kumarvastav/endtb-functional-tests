package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.DashboardPage;
import org.bahmni.gauge.common.clinical.displaycontrol.ObsDisplayControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DashboardSpec {

	private final WebDriver driver;

	public DashboardSpec() {
		this.driver = DriverFactory.getDriver();
	}

	@BeforeClassSteps
	public void waitForAppReady() {
		new BahmniPage().waitForSpinner(driver);
	}

	@Step("Ensure that <id> Obs display control with title <title> has correct data <table>")
	public void validateContentInDisplayControl(String id, String title, Table table) {
		DashboardPage dashboardPage = PageFactory.getDashboardPage();
		dashboardPage.waitForSpinner(driver);

		WebElement displayControl = dashboardPage.findElementById(id);
		assertNotNull("The display control with id [" + id + "] not found", displayControl);

		ObsDisplayControl obsDisplayControl = new ObsDisplayControl(displayControl);
		assertEquals("The display control with title [" + title + "] is incorrect", title, obsDisplayControl.getTitle());

		Map<String, String> keyValues = obsDisplayControl.getKeyValues();
		List<String> columnNames = table.getColumnNames();

		for (String columnName : columnNames) {
			assertEquals("The column [" + columnName + "] has incorrect data",
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

	@Step("Navigate to our patient")
	public void tempNavigateToTestPatient() {
		driver.get(
				"https://endtb-qa.mybahmni.org/bahmni/clinical/#/default/patient/418b00ec-65e3-49ee-9bd5-901254a97e47/dashboard?dateEnrolled=2016-04-01T00:00:00.000&programUuid=2cc0a68b-266c-47cf-8e2a-7e18c65e47f0&enrollment=9af38863-1710-4b99-8450-1353c6ce83ef");
	}

	@Step("Click on <name> dashboard")
	public void clickOnDashboard(String name) {
		DashboardPage dashboardPage = PageFactory.getDashboardPage();
		dashboardPage.waitForSpinner(driver);
		dashboardPage.selectDashboard(name);
	}

}

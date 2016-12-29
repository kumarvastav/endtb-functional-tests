package org.bahmni.gauge.amman.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.amman.clinical.PatientQueuePage;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by swarup on 10/25/16.
 */
public class PatientQueueSpec {
    @BeforeClassSteps
    public void waitForAppReady() {
        BahmniPage.waitForSpinner(DriverFactory.getDriver());
    }

    @Step("Search and select patient <patient> from <queue> queue")
    public void selectPatientFromProgramTab(String patientName, String queueName) {
        PatientQueuePage patientQueuePage = PageFactory.get(PatientQueuePage.class);
        patientQueuePage.clickTab(queueName);
        patientQueuePage.enterPatientIDOrName(patientName);
        patientQueuePage.selectPatientFromQueue(patientName);
    }

    @Step("Search patient <patientName> from <queue> queue")
    public void searchPatientFromTab(String patientName, String queueName) {
        PatientQueuePage patientQueuePage = PageFactory.get(PatientQueuePage.class);
        patientQueuePage.clickTab(queueName);
        patientQueuePage.enterPatientIDOrName(patientName);
    }

    @Step("Verify patient details of <patientName> in queue <table>")
    public void verifyPatientDetailsinQueue(String patientName, Table table) {
        PatientQueuePage patientQueuePage = PageFactory.get(PatientQueuePage.class);
        List<String> columnNames = table.getColumnNames();
        TableRow requiredRow = null;
        for (TableRow row : table.getTableRows()) {
            if (row.getCell("Name").contains(patientName)) {
                requiredRow = row;
                break;
            }
        }


        for (String columnName : columnNames) {
            String actualData = patientQueuePage.getColumnData(columnName);
            Assert.assertEquals(requiredRow.getCell(columnName), actualData);
        }
    }

    @Step("Refresh the queues page")
    public void refreshPage() {
        DriverFactory.getDriver().navigate().refresh();
    }

    @Step("Verify patient <Kasm> is present only in <Awaiting Validation - 1st Stage > following queue")
    public void implementation1(String patientName, String queueName) {
        PatientQueuePage patientQueuePage = PageFactory.get(PatientQueuePage.class);
        Assert.assertTrue(patientQueuePage.isPatientPresentOnlyInGivenTab(patientName, queueName));
    }

    @Step("Verify patient <Kasm> is not present in any queue")
    public void implementation2(String patientName) {
        PatientQueuePage patientQueuePage = PageFactory.get(PatientQueuePage.class);
        Assert.assertTrue(patientQueuePage.isNotPatientPresentInAnyTab(patientName));
    }
}

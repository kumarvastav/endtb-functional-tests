package org.bahmni.gauge.endtb.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.TestSpecException;
import org.bahmni.gauge.common.clinical.DashboardPage;
import org.bahmni.gauge.common.clinical.ObservationsPage;
import org.bahmni.gauge.common.clinical.domain.DrugOrder;
import org.bahmni.gauge.common.program.domain.PatientProgram;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.endtb.clinical.EndTBObservationPage;
import org.bahmni.gauge.endtb.clinical.domain.BaselineForm;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObservationSpec {

    private WebDriver driver = null;

    public ObservationSpec() {
        driver = DriverFactory.getDriver();
    }

    @BeforeClassSteps
    public void waitForAppReady() {
        new BahmniPage().waitForSpinner(DriverFactory.getDriver());
    }


    @Step("Select the template <template> from on the observation page")
    public void clickOnTreatmentEnrollment(String template) throws InterruptedException {
        ObservationsPage observationsPage = PageFactory.getObservationsPage();
        template = template.replace(" ", "_");
        observationsPage.selectTemplate(template);
    }

    @Step("Create a <formName> form with following data <table>")
    public void createForm(String formName, Table table) {
        Patient patient = new BahmniPage().getPatientFromSpecStore();
        PatientProgram patientProgram = new BahmniPage().getPatientProgramFromSpecStore();

        Map<String, String> formAttributes = new HashMap<>();
        formAttributes.put("patientUuid", patient.getUuid());
        formAttributes.put("patientProgramUuid", patientProgram.getPatientProgramUuid());
        formAttributes.putAll(transformTableToMap(table));

        BahmniRestClient.get().createForm(formName + ".ftl", formAttributes);

    }

    private Map<String, String> transformTableToMap(Table table) {

        Map<String, String> formVariables = new HashMap<>();
        List<String> columnNames = table.getColumnNames();

        for (String columnName : columnNames) {
            formVariables.put(columnName, table.getTableRows().get(0).getCell(columnName));
        }

        return formVariables;
    }

    @Step("Fill baseline form <table>")
    public void enterDataInBaselineForm(Table table) {
        ObservationsPage observationPage = PageFactory.getObservationsPage();
        BaselineForm baselineForm = transformTableToBaselineForm(table);
        observationPage.fillTemplateData(table, baselineForm);
        new BahmniPage().storeObservationFormInSpecStore(baselineForm);
    }

    private BaselineForm transformTableToBaselineForm(Table table) {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        if (rows.size() != 1) {
            throw new TestSpecException("Only one patient should be provided in the table");
        }
        BaselineForm baselineForm = new EndTBObservationPage().transformTableRowToBaselineForm(rows.get(0), columnNames);
        return baselineForm;
    }

    @Step("Verify observations recorded under <formname>")
    public void verifyObservationsOnDashboard(String formname) {
        BaselineForm baselineForm = (BaselineForm) new BahmniPage().getObservationFormInSpecStore();
        DashboardPage dashboardPage = PageFactory.getDashboardPage();
        dashboardPage.validateObservationDisplayControl(formname);
    }

    @Step("Verify prescribed drugs on the dashboard page")
    public void verifyDrugsOnDashboard() {
        List<DrugOrder> drugOrder = (List<DrugOrder>) new BahmniPage().getDrugOrderFromSpecStore();
        DashboardPage dashboardPage = PageFactory.getDashboardPage();
        for (DrugOrder drug : drugOrder)
            dashboardPage.validateDrugOrderDisplayControl(drug, "All active TB Drugs");
    }


    @Step("Close the app")
    public void closeApplication() {
        new BahmniPage().closeApp(driver);
    }

    @Step("Verify previously recorded observations under <Baseline>")
    public void implementation1(Object arg0) {

    }
}

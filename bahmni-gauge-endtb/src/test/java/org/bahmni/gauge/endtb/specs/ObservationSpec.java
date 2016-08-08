package org.bahmni.gauge.endtb.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.TestSpecException;
import org.bahmni.gauge.common.clinical.ObservationsPage;
import org.bahmni.gauge.common.clinical.domain.ObservationForm;
import org.bahmni.gauge.common.program.domain.PatientProgram;
import org.bahmni.gauge.common.registration.RegistrationFirstPage;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.endtb.clinical.EndTBObservationPage;
import org.bahmni.gauge.endtb.clinical.domain.BaselineForm;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObservationSpec {


    @BeforeClassSteps
    public void waitForAppReady(){ new BahmniPage().waitForSpinner(DriverFactory.getDriver());}


    @Step("Select the template <template> from on the observation page")
    public void clickOnTreatmentEnrollment(String template) throws InterruptedException {
        ObservationsPage observationsPage = PageFactory.getObservationsPage();
        observationsPage.selectTemplate(template);
    }

    @Step("Create a <formName> form with following data <table>")
    public void createForm(String formName,Table table){
        Patient patient = new BahmniPage().getPatientFromSpecStore();
        PatientProgram patientProgram = new BahmniPage().getPatientProgramFromSpecStore();

        Map<String,String> formAttributes = new HashMap<>();
        formAttributes.put("patientUuid",patient.getUuid());
        formAttributes.put("patientProgramUuid", patientProgram.getPatientProgramUuid());
        formAttributes.putAll(transformTableToMap(table));

        BahmniRestClient.get().createForm(formName+".ftl", formAttributes);

    }

    private Map<String,String> transformTableToMap(Table table) {

        Map<String,String> formVariables = new HashMap<>();
        List<String> columnNames = table.getColumnNames();

        for(String columnName: columnNames){
            formVariables.put(columnName,table.getTableRows().get(0).getCell(columnName));
        }

        return formVariables;
    }

    @Step("Fill baseline form <table>")
    public void enterDataInBaselineForm(Table table){
        ObservationForm baselineForm = transformTableToBaselineForm(table);
        ObservationsPage observationsPage = PageFactory.getObservationsPage();
        observationsPage.fillTemplateData(table,baselineForm);
    }

    private BaselineForm transformTableToBaselineForm(Table table){
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        if (rows.size() != 1) {
            throw new TestSpecException("Only one patient should be provided in the table");
        }
        BaselineForm baselineForm = new EndTBObservationPage().transformTableRowToBaselineForm(rows.get(0), columnNames);
        return baselineForm;
    }

}

package org.bahmni.gauge.endtb.specs;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.ObservationsPage;
import org.bahmni.gauge.common.program.domain.PatientProgram;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.endtb.clinical.BaselinePage;
import org.bahmni.gauge.rest.BahmniRestClient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObservationSpec extends BaselinePage {

    @Step("Select the template <template> from on the observation page")
    public void clickOnTreatmentEnrollment(String template) {
        ObservationsPage observationsPage = PageFactory.getObservationsPage();
        observationsPage.selectTemplate(template);
    }

    @Step("Create a <formName> form with following data <table>")
    public void createForm(String formName,Table table){
        Patient patient = getPatientFromSpecStore();
        PatientProgram patientProgram = getPatientProgramFromSpecStore();

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

}

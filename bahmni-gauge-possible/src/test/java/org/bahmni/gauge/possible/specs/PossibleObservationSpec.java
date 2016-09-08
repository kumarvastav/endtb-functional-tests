package org.bahmni.gauge.possible.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.TestSpecException;
import org.bahmni.gauge.common.clinical.ObservationsPage;
import org.bahmni.gauge.possible.clinical.PossibleObservationPage;
import org.bahmni.gauge.common.clinical.domain.ObservationForm;
import org.bahmni.gauge.possible.clinical.domain.PatientVitals;

import java.util.List;

/**
 * Created by dharmens on 9/5/16.
 */
public class PossibleObservationSpec extends BahmniPage {

    @BeforeClassSteps
    public void waitForAppReady() {
        new BahmniPage().waitForSpinner();
    }

    @Step("Fill patient vitals form <table>")
    public void enterDataInPatientVitalsForm(Table table) {
        ObservationsPage observationPage = PageFactory.getObservationsPage();
        PatientVitals patientVitals = transformTableToPatientVitals(table);
        observationPage.fillTemplateData(table, patientVitals);
        new BahmniPage().storeObservationFormInSpecStore(patientVitals);
    }

    private PatientVitals transformTableToPatientVitals(Table table) {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        if (rows.size() != 1) {
            throw new TestSpecException("Only one patient should be provided in the table");
        }
        PatientVitals baselineForm = new PossibleObservationPage().transformTableRowToBaselineForm(rows.get(0), columnNames);
        return baselineForm;
    }
}

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
import org.bahmni.gauge.common.clinical.domain.ObservationForm;
import org.bahmni.gauge.common.program.domain.PatientProgram;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.endtb.clinical.EndTBObservationPage;
import org.bahmni.gauge.endtb.clinical.domain.BaselineForm;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EndTBObservationSpec {

    private WebDriver driver = null;

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
}

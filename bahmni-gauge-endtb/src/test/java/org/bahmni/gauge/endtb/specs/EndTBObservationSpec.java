package org.bahmni.gauge.endtb.specs;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.TestSpecException;
import org.bahmni.gauge.common.clinical.ObservationsPage;
import org.bahmni.gauge.endtb.clinical.EndTBObservationPage;
import org.bahmni.gauge.endtb.clinical.domain.BaselineForm;

import java.util.List;

public class EndTBObservationSpec {

    @Step("Fill baseline form <table>")
    public void enterDataInBaselineForm(Table table) {
        ObservationsPage observationPage = PageFactory.get(ObservationsPage.class);
        BaselineForm baselineForm = transformTableToBaselineForm(table);
        observationPage.fillTemplateData(table);
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

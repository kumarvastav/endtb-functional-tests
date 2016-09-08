package org.bahmni.gauge.possible.clinical;

import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.clinical.ObservationsPage;
import org.bahmni.gauge.possible.clinical.domain.PatientVitals;

import java.util.List;

public class PossibleObservationPage extends ObservationsPage {

    public PatientVitals transformTableRowToBaselineForm(TableRow row, List<String> columnNames) {
        PatientVitals patientVitals = new PatientVitals(row.getCell(columnNames.get(0)), row.getCell(columnNames.get(1)), row.getCell(columnNames.get(2))
                , row.getCell(columnNames.get(3)), row.getCell(columnNames.get(4)), row.getCell(columnNames.get(5)), row.getCell(columnNames.get(6))
                , row.getCell(columnNames.get(7)));
        return patientVitals;
    }
}

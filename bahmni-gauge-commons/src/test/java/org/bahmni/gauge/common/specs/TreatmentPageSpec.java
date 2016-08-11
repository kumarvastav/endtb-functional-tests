package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.ConsultationPage;
import org.bahmni.gauge.common.clinical.TreatmentPage;
import org.bahmni.gauge.common.clinical.domain.DrugOrder;
import org.bahmni.gauge.common.program.domain.PatientProgram;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class TreatmentPageSpec {

    private final WebDriver driver;
    private final ConsultationPage consultationPage;
    private final TreatmentPage treatmentPage;

    public TreatmentPageSpec(){
        this.driver = DriverFactory.getDriver();
        this.treatmentPage = PageFactory.getTreatmentPage();
        this.consultationPage = PageFactory.getConsultationPage();
    }

    @BeforeClassSteps
    public void waitForAppReady(){ new BahmniPage().waitForSpinner(DriverFactory.getDriver());}



    @Step("Create drug order")
    public void createDrugOrder(){
        TreatmentPage treatmentPage = PageFactory.getTreatmentPage();
        treatmentPage.createDrugOrder();
    }

    @Step("Create the following drug order using API <table>")
    public void createDrugOrderUsingAPI(Table table) {
        List<DrugOrder> drugOrders = transformTableToDrugOrder(table);
        BahmniRestClient.get().createDrugOrders(drugOrders);
    }

    private List<DrugOrder> transformTableToDrugOrder(Table table) {
        List<DrugOrder> drugOrders = new ArrayList<>();

        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        Patient patient = PageFactory.getRegistrationFirstPage().getPatientFromSpecStore();
        PatientProgram patientProgram = PageFactory.getProgramManagementPage().getPatientProgramFromSpecStore();

        DrugOrder drugOrder;

        for (TableRow row : rows) {
            drugOrder = new DrugOrder(row.getCell(columnNames.get(0)), row.getCell(columnNames.get(1)), row.getCell(columnNames.get(2)), row.getCell(columnNames.get(3)), row.getCell(columnNames.get(4)), row.getCell(columnNames.get(5)), row.getCell(columnNames.get(6)));

            drugOrder.setDrugUuid(row.getCell(columnNames.get(0)));
            drugOrder.setPatientUuid(patient.getUuid());
            drugOrder.setProgramUuid(patientProgram.getPatientProgramUuid());

            drugOrders.add(drugOrder);
        }
        return drugOrders;
    }
}

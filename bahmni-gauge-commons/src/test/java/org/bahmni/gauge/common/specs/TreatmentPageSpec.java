package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.TreatmentPage;
import org.bahmni.gauge.common.clinical.domain.DrugOrder;
import org.bahmni.gauge.common.program.domain.PatientProgram;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class TreatmentPageSpec {

    private WebDriver driver;
    private TreatmentPage treatmentPage;

    public TreatmentPageSpec(){
        driver = DriverFactory.getDriver();
        treatmentPage = PageFactory.getTreatmentPage();
    }

    @BeforeClassSteps
    public void waitForAppReady(){ new BahmniPage().waitForSpinner(driver);}



    @Step("Create drug order <table>")
    public void createDrugOrder(Table table){
        List<DrugOrder> drugOrders = transformTableToDrugOrder(table);
        for (DrugOrder drugOrder: drugOrders){
            treatmentPage.createDrugOrder(drugOrder);
        }
    }

    @Step("Create the following drug order using API <table>")
    public void createDrugOrderUsingAPI(Table table) {
        List<DrugOrder> drugOrders = transformTableToDrugOrderForApiCall(table);
        BahmniRestClient.get().createDrugOrders(drugOrders);
    }

    private List<DrugOrder> transformTableToDrugOrder(Table table) {
        List<DrugOrder> drugOrders = new ArrayList<>();

        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();

        DrugOrder drugOrder;

        for (TableRow row : rows) {
            drugOrder = new DrugOrder(row.getCell(columnNames.get(0)), row.getCell(columnNames.get(3)), row.getCell(columnNames.get(4)), row.getCell(columnNames.get(5)));

            drugOrder.setUniformDoseInfo(row.getCell(columnNames.get(1)), row.getCell(columnNames.get(2)));
            drugOrder.setAdditionalInformation("false", "As directed", row.getCell(columnNames.get(6)));
            drugOrder.setDurationInfo(row.getCell(columnNames.get(7)),row.getCell(columnNames.get(8)));
            drugOrders.add(drugOrder);
        }
        return drugOrders;
    }

    private List<DrugOrder> transformTableToDrugOrderForApiCall(Table table) {
        List<DrugOrder> drugOrders = new ArrayList<>();

        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        Patient patient = PageFactory.getRegistrationFirstPage().getPatientFromSpecStore();
        PatientProgram patientProgram = PageFactory.getProgramManagementPage().getPatientProgramFromSpecStore();

        DrugOrder drugOrder;

        for (TableRow row : rows) {
            drugOrder = new DrugOrder(row.getCell(columnNames.get(0)), row.getCell(columnNames.get(3)), row.getCell(columnNames.get(4)), row.getCell(columnNames.get(5)));

            drugOrder.setUniformDoseInfo(row.getCell(columnNames.get(1)), row.getCell(columnNames.get(2)));
            drugOrder.setAdditionalInformation("false", "As directed", row.getCell(columnNames.get(6)));
            drugOrder.setDrugUuid(row.getCell(columnNames.get(0)));
            drugOrder.setPatientUuid(patient.getUuid());
            drugOrder.setProgramUuid(patientProgram.getPatientProgramUuid());

            drugOrders.add(drugOrder);
        }
        return drugOrders;
    }
}

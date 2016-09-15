package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.apache.commons.beanutils.BeanUtils;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.TreatmentPage;
import org.bahmni.gauge.common.clinical.domain.DrugOrder;
import org.bahmni.gauge.common.program.domain.PatientProgram;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class TreatmentPageSpec {

    private WebDriver driver;
    private TreatmentPage treatmentPage;

    public TreatmentPageSpec(){
        driver = DriverFactory.getDriver();
        treatmentPage = PageFactory.get(TreatmentPage.class);
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
        List<DrugOrder> drugOrders = transformTableToDrugOrder(table);
        Patient patient = PageFactory.getRegistrationFirstPage().getPatientFromSpecStore();
        PatientProgram patientProgram = PageFactory.getProgramManagementPage().getPatientProgramFromSpecStore();

        for (DrugOrder drugOrder : drugOrders){
            drugOrder.setDrugUuid(BahmniRestClient.get().getUuidOfDrug(drugOrder.getDrugName()));
            drugOrder.setPatientUuid(patient.getUuid());
            drugOrder.setProgramUuid(patientProgram.getPatientProgramUuid());
        }
        BahmniRestClient.get().createDrugOrders(drugOrders);
        new BahmniPage().storeDrugOrderInSpecStore(drugOrders);
    }

    private List<DrugOrder> transformTableToDrugOrder(Table table) {
        List<DrugOrder> drugOrders = new ArrayList<>();

        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();

        DrugOrder drugOrder;

        for (TableRow row : rows) {
            drugOrder = new DrugOrder();
            for (String columnName:columnNames){

                try {
                    BeanUtils.getProperty(drugOrder, columnName);
                    BeanUtils.setProperty(drugOrder, columnName, row.getCell(columnName));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }

            }
            drugOrders.add(drugOrder);
        }
        return drugOrders;
    }
}

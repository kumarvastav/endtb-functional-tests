package org.bahmni.gauge.amman.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.apache.commons.beanutils.BeanUtils;
import org.bahmni.gauge.amman.registration.AmmanRegistrationPage;
import org.bahmni.gauge.amman.registration.domain.AmmanPatient;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.domain.DrugOrder;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistrationSpec {
    @BeforeClassSteps
    public void waitForAppReady() {
        new BahmniPage().waitForSpinner(DriverFactory.getDriver());
    }

    @Step("Create Amman Patient <table>")
    public void createAmmanPatient(Table table) {
        AmmanRegistrationPage registrationPage = (AmmanRegistrationPage) PageFactory.getRegistrationFirstPage();
        AmmanPatient ammanPatient = transformTableToPatient(table);
        registrationPage.storePatientInSpecStore(ammanPatient);
        registrationPage.createPatient(ammanPatient);
    }

    private AmmanPatient transformTableToPatient(Table table) {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();

        AmmanPatient ammanpatient = new AmmanPatient();
        for (String columnName:columnNames){

            try {
                BeanUtils.getProperty(ammanpatient, columnName);
                BeanUtils.setProperty(ammanpatient, columnName, rows.get(0).getCell(columnName));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

        }

        return ammanpatient;
    }
}

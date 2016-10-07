package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.MedicationsPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


/**
 * Created by nityadas on 06/10/2016.
 */
public class MedicationsPageSpec {

    WebDriver driver;
    MedicationsPage medicationsPage;
    public MedicationsPageSpec(){
        driver = DriverFactory.getDriver();
        medicationsPage = PageFactory.get(MedicationsPage.class);
    }



    @Step("Verify display control <displayTabName> on medications tab, has the following details <table>")
    public void verifyDisplayControlContent(String displayTabName,Table table) {
        String displayControlText = medicationsPage.getDisplayControlText(displayTabName);
        for (String drugOrder : table.getColumnValues("details")) {
            Assert.assertTrue(stringDoesNotExist(drugOrder),displayControlText.contains(drugOrder));
        }
    }

    private static String stringDoesNotExist(String content){
        return "String `"+content+"` does not exist";
    }

}

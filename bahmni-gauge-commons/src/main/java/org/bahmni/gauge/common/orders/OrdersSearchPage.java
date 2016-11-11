package org.bahmni.gauge.common.orders;

import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by atmaramn on 11/11/2016.
 */
public class OrdersSearchPage extends BahmniPage {
    @FindBy(how = How.CSS, using = "#patientIdentifier")
    public WebElement patientId;


    public void searchById(Patient patient) {
        patientId.sendKeys(patient.getIdentifier());

        findElement(By.partialLinkText(patient.getIdentifier())).click();
    }
}

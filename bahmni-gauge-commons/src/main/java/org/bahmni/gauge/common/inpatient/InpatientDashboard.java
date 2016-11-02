package org.bahmni.gauge.common.inpatient;

import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InpatientDashboard extends BahmniPage {
    public String getDisplayControlText(String displayControlName) {
        WebElement displayControl = findElement(By.id(displayControlName));
        waitForSpinner();
        return displayControl.getText().replace("\n", "");
    }

    public String getDisplayControlTextWitCaption(String Caption) {
        WebElement displayControl = findElement(By.xpath(".//h2[contains(text(),\""+Caption+"\")]/ancestor::section[contains(@class,\"dashboard-section\")][1]"));
        waitForSpinner();
        return displayControl.getText().replace("\n", "");
    }

    public boolean isAdmitted() {
        waitForSpinner();
        WebElement patientProfileDisplayControl = findElement(By.tagName("patient-profile"));
        return hasChild(patientProfileDisplayControl,By.cssSelector(".ipd-indication"));
    }
}

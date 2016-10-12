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

    public boolean isAdmitted() {
        waitForSpinner();
        WebElement patientProfileDisplayControl = findElement(By.tagName("patient-profile"));
        WebElement icon = patientProfileDisplayControl.findElement(By.cssSelector(".ipd-indication"));
        return null != icon;
    }
}

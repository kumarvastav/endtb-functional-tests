package org.bahmni.gauge.common.inpatient;

import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InpatientHeader extends BahmniPage{
    @FindBy(how = How.CSS, using = "#ipdDashboard")
    WebElement ipdDashboardLink;
    public void gotoIpdDashboard() {
        ipdDashboardLink.click();
    }
}

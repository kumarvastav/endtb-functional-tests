package org.bahmni.gauge.common.inpatient;

import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InpatientHeader extends BahmniPage{
    @FindBy(how = How.XPATH, using = "//a[@id='ipdDashboard' or @title='Back to IPD dashboard']")
    private WebElement ipdDashboardLink;

    @FindBy(id = "adtHomeBackLink")
    private WebElement ipdSearchPageLink;

    public void gotoIpdDashboard() {
        ipdDashboardLink.click();
    }

    public void gotoIpdSearchPage() {
        ipdSearchPageLink.click();
    }
}

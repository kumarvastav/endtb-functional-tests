package org.bahmni.gauge.common.clinical;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ConsultationPage extends BahmniPage {

    @FindBy(how = How.CSS, using = ".btn--success")
    public WebElement clinical;

    @FindBy(how = How.CSS, using = ".consultation-tabs .tab-item a")
    public List<WebElement> tabs;

    @FindBy(how = How.CSS, using = ".patient-info")
    public WebElement patient_profile;

    @FindBy(how = How.CSS, using = ".save-consultation")
    public WebElement save;

    @FindBy(how = How.CSS, using = ".tab-selected")
    public WebElement activeTab;

    @FindBy(how = How.CSS, using = ".retro-date-widget-header.fr")
    public WebElement registrationDeskButton;

    public void saveConsultation() {
        save.click();
    }

    public void clickPatientProfile() {
        patient_profile.click();
    }

    public void clickOnTab(String tab) {
        for (WebElement eachTab : tabs) {
            if (eachTab.getText().contains(tab)) {
                eachTab.click();
                return;
            }
        }
    }

    public String getActiveTab() {
        return activeTab.getText();
    }

    /**
     * Send empty char for the item you want to skip
     */
    public void openRegistrationDeskAndSet(String location, String onBehalf, String date) {
        registrationDeskButton.click();
        waitForElementOnPagewithTimeout(By.cssSelector(".retro-date-widget-panel"), 10);
        if (!location.equals(""))
            new Select(findElement(By.cssSelector("select[ng-model=\"selectedLocationUuid\"]"))).selectByVisibleText("OPD-1");
        if (!onBehalf.equals(""))
            findElement(By.xpath("//label [text()='Enter on behalf']/../input")).sendKeys(onBehalf);
        if (!date.equals(""))
            findElement(By.xpath("//label[text()='Enter data for']/../input")).sendKeys(date);
        findElement(By.cssSelector(".retro-widget-button.ok_btn")).click();
    }

    public void verifyTabsPresent(Table tabs)
    {
        WebElement element;

        for (String tabName : tabs.getColumnValues("tabName")) {
            element = findElement(By.xpath(".//a[@ng-click='showBoard($index)' and contains(text(),'"+tabName+"')]"));
            Assert.assertTrue(element.isDisplayed());
        }
    }
}

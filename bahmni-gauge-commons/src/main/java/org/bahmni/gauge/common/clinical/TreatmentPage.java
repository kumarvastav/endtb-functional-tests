package org.bahmni.gauge.common.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.domain.DrugOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TreatmentPage extends BahmniPage{

    //Drug info fields
    @FindBy(how= How.CSS, using = "#drug-name")
    public WebElement drugNameField;

    @FindBy(how= How.CSS, using = ".accept-btn")
    public WebElement acceptButton;

    @FindBy(how= How.CSS, using = "#uniform-dose")
    public WebElement dose;

    @FindBy(how= How.CSS, using = "#uniform-dose-unit")
    public WebElement doseUnits;

    @FindBy(how= How.CSS, using = "#frequency")
    public WebElement frequency;

    @FindBy(how= How.CSS, using = "#route")
    public WebElement route;

    @FindBy(how= How.CSS, using = "#start-date")
    public WebElement startDate;

    @FindBy(how= How.CSS, using = "#duration")
    public WebElement duration;

    @FindBy(how= How.CSS, using = "#duration-unit")
    public WebElement durationUnits;

    @FindBy(how= How.CSS, using = "#quantity")
    public WebElement totalQuantity;

    @FindBy(how= How.CSS, using = "#total-quantity-unit")
    public WebElement totalQuantityUnits;


    //Additional information section
    @FindBy(how = How.CSS, using = "#SOS")
    public WebElement sos;

    @FindBy(how = How.CSS, using = "#instructions")
    public WebElement instructions;

    @FindBy(how = How.CSS, using = "#additional-instructions")
    public WebElement additionalInstructions;

    //Action buttons
    @FindBy(how = How.CSS, using = ".add-drug-btn")
    public WebElement addButton;

    @FindBy(how = How.CSS, using = ".reset-drug-form")
    public WebElement clearButton;

    @FindBy(how = How.CSS, using = ".stop-drug-btn")
    public WebElement stopDrugButton;

    @FindBy(how = How.CSS, using = ".refill-btn")
    public WebElement refillDrugButton;

    @FindBy(how = How.CSS, using = ".fa-edit")
    public WebElement editDrugButton;

    @FindBy(how = How.CSS, using = ".search-order-set")
    public WebElement searchOrderSet;

    @FindBy(how = How.CSS, using = ".order-section-container input[title='date']")
    public WebElement orderSetStartDate;

    @FindBy(how = How.CSS, using = ".ui-menu-item")
    public WebElement autocomplete;

    @FindBy(how = How.CSS, using = ".search-order-set.ng-valid")
    public WebElement orderSetName;

    @FindBy(how = How.CSS, using = ".Order-section-orderDrug.form.clearfix .field-value:nth-of-type(4) input")
    public WebElement orderStartDate;

    @FindBy(how = How.CSS, using = ".orderSet-orders.clearfix:nth-of-type(1) h2 div button:nth-of-type(1)")
    public WebElement addOrderSet;

    @FindBy(how = How.CSS, using = "button[ng-click=\"revise(drugOrder, drugOrderGroup.drugOrders)\"]")
    public List<WebElement> editDrugOrderbuttons;



    @FindBy(how = How.CSS, using = ".refill-btn")
    public List<WebElement> refillDrugOrderbuttons;

    @FindBy(how = How.CSS, using = ".tab:nth-of-type(1) .table-mimic #ordered-drug-orders")
    public List<WebElement> stopRecentDrugOrder;

    public void createDrugOrder(DrugOrder drugOrder){
        fillDrugName(drugOrder.getDrugName());
        dose.clear();
        dose.sendKeys(drugOrder.getDose());
        new Select(doseUnits).selectByVisibleText(drugOrder.getDoseUnit());
        new Select(frequency).selectByVisibleText(drugOrder.getFrequency());
        new Select(route).selectByVisibleText(drugOrder.getRoute());
        duration.clear();
        duration.sendKeys(drugOrder.getDuration());
        if(null != drugOrder.getStartDate()){
            startDate.clear();
            startDate.sendKeys(drugOrder.getStartDate());
        }
        durationUnits.sendKeys(drugOrder.getDurationUnit());
        addButton.click();
    }

    private void fillDrugName(String drugName) {
        if(drugNameField.isEnabled()) {
            drugNameField.sendKeys(drugName);

            acceptButton.click();
        }
    }

    public void addOrderSet(String orderset, int days) {
        orderSetName.sendKeys(orderset);
        if(days!=0)
        {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, -1);
            orderStartDate.sendKeys(df.format(cal.getTime()));
        }
        waitForElementOnPage(addOrderSet);
        addOrderSet.click();
    }

    public void refillDrugOrder(DrugOrder order,int index){
        this.refillDrugOrderbuttons.get(index).click();
        waitForElementOnPage(By.cssSelector("button[ng-click=\"edit(newTreatment, $index)\"]"));
        driver.findElements(By.cssSelector("button[ng-click=\"edit(newTreatment, $index)\"]")).get(index).click();
        createDrugOrder(order);

    }
    public void stopDrugOrder(String drugName) {

        for (WebElement drug:stopRecentDrugOrder) {
            if(drug.findElement(By.cssSelector(".drug-details")).getText().contains(drugName))
                drug.findElement(By.cssSelector(".stop-drug-btn")).click();
        }

    }

    public String getDisplayControlText(String displayTabName) {

        if (displayTabName.equalsIgnoreCase("recent"))
            return driver.findElement(By.cssSelector(".drug-orders-history .tabs .tab:nth-of-type(1) .table-mimic")).getText().trim().replace("\n", "");
        else if(displayTabName.equalsIgnoreCase("current visit")) {
            DateFormat df = new SimpleDateFormat("dd MMM yy");
            Date date = new Date();
            return driver.findElement(By.xpath(".//label[contains(.,'"+df.format(date)+"')]/../div/div/ul")).getText().trim().replace("\n", "");
        }
        else
            return driver.findElement(By.cssSelector(".drug-orders-history .tabs .tab:nth-of-type(2) .table-mimic")).getText().trim().replace("\n", "");
    }
}

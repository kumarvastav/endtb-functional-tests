package org.bahmni.gauge.common.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class TreatmentPage extends BahmniPage{

    //Drug info fields
    @FindBy(how= How.CSS, using = "#drug-name")
    public WebElement drugName;

    @FindBy(how= How.CSS, using = ".accept-btn")
    public WebElement freeTextAccept;

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

    @FindBy(how = How.CSS, using = "button .fa-save")
    public WebElement save;


    public void createDrugOrder(){
        drugName.sendKeys();
        freeTextAccept.click();
        dose.sendKeys();
        new Select(doseUnits).selectByVisibleText("");
        new Select(frequency).selectByVisibleText("");
        new Select(route).selectByVisibleText("");
        startDate.sendKeys();
        duration.sendKeys();
        addButton.click();
        save.click();
    }
}

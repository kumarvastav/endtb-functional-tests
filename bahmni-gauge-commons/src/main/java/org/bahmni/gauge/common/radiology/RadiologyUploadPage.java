package org.bahmni.gauge.common.radiology;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class RadiologyUploadPage extends BahmniPage{

    @FindBy(how = How.CSS, using = "#newVisit > h5")
    public WebElement new_visit;

    @FindBy(how = How.CSS, using = "select.ng-pristine")
    public WebElement visit_type;

    @FindBy(how = How.NAME, using = "startDate")
    public WebElement start_date;

    @FindBy(how = How.NAME, using = "endDate")
    public WebElement end_date;

    public void uploadImage(int visitNumber, Table table) {
        WebElement root;
        for(TableRow row:table.getTableRows()) {
            uploadFile(visitNumber, row.getCell("image"));
            root = findElement(By.cssSelector(".doc-upload-accordion>li:nth-of-type("+(visitNumber + 1)+")"));
            root.findElements(By.cssSelector(".concept-name.ng-pristine.ng-untouched.ui-autocomplete-input.ng-invalid.ng-invalid-required.ng-valid-selection")).get(0).sendKeys(row.getCell("name"));
            waitForElementOnPage(By.cssSelector(".ui-menu[style*=\"display: block\"] .ui-menu-item>a"));
            driver.findElement(By.cssSelector(".ui-menu[style*=\"display: block\"] .ui-menu-item>a")).click();
        }
    }


    public void save(){
        findElement(By.cssSelector("button.btn.btn-primary:not([disabled])")).click();
    }

    public void createNewVisit(Table table) {
        waitForSpinner();
        waitForElementOnPage(new_visit).click();
        new Select(visit_type).selectByVisibleText(table.getColumnValues("type").get(0));
        start_date.sendKeys(table.getColumnValues("startDate").get(0));
        end_date.sendKeys(table.getColumnValues("endDate").get(0));
    }

    public void removeImage(int imageNumber) {
        waitForElementOnPage(By.cssSelector("#remove-image" + (imageNumber - 1))).click();
    }

    public void expandCurrentVisit() {
        waitForElementOnPage(By.cssSelector(".fa-star")).click();
    }
}

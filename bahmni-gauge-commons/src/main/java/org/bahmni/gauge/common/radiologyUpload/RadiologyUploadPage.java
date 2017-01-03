package org.bahmni.gauge.common.radiologyUpload;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.io.IOException;

/**
 * Created by atmaramn on 17/11/2016.
 */
public class RadiologyUploadPage extends BahmniPage{

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

    private void uploadFile(int visitNumber, String image) {
        String sPath = null;
        try {
            sPath = new java.io.File(".").getCanonicalPath() + "/src/main/resources/upload/" + image;
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.findElements(By.cssSelector("input[type=\"file\"]")).get(visitNumber).sendKeys(sPath);

    }

    public void save(){
        findElement(By.cssSelector("button.btn.btn-primary:not([disabled])")).click();
    }
}

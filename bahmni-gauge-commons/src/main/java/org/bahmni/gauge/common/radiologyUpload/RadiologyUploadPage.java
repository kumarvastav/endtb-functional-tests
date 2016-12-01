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
        WebElement root=findElement(By.cssSelector(".doc-upload-accordion>li:nth-of-type("+visitNumber+")"));
        for(TableRow row:table.getTableRows()) {
            root.findElement(By.cssSelector(".fa-plus")).click();
            try {
                uploadFile(row.getCell("image"));
                root=findElement(By.cssSelector(".doc-upload-accordion>li:nth-of-type("+visitNumber+")"));
               // Thread.sleep(1500);
                root.findElements(By.cssSelector(".concept-name.ng-pristine.ng-untouched.ui-autocomplete-input.ng-invalid.ng-invalid-required.ng-valid-selection")).get(0).sendKeys(row.getCell("name"));
                waitForElementOnPage(By.cssSelector(".ui-menu[style*=\"display: block\"] .ui-menu-item>a"));
                driver.findElement(By.cssSelector(".ui-menu[style*=\"display: block\"] .ui-menu-item>a")).click();
            } catch (AWTException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
            }
        }
    }

    public void save(){
        findElement(By.cssSelector("button.btn.btn-primary:not([disabled])")).click();
    }
}

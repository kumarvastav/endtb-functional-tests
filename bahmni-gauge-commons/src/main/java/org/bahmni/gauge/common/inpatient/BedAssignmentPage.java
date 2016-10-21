package org.bahmni.gauge.common.inpatient;

import org.apache.commons.collections.CollectionUtils;
import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class BedAssignmentPage extends BahmniPage{

    @FindBy(how = How.TAG_NAME, using = "ward")
    List<WebElement> wards;

    public Boolean assignAnEmptyBed() {
        waitForSpinner();
        for (WebElement ward : wards) {
            ward.click();
            waitForSpinner();
            List<WebElement> beds = ward.findElements(By.cssSelector(".bed-assignment .available"));
            if(!CollectionUtils.isEmpty(beds)){
                return assignBed(ward,beds.get(0));
            }
        }
        return Boolean.FALSE;
    }

    private Boolean assignBed(WebElement ward, WebElement bed) {
        bed.click();
        findChild(ward,By.cssSelector(".bed-info .assign")).click();
        return Boolean.TRUE;
    }
}

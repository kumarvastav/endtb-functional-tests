package org.bahmni.gauge.common.inpatient;

import org.apache.commons.collections.CollectionUtils;
import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class BedAssignmentPage extends BahmniPage{

    private final By assignButton = By.cssSelector(".bed-info a[ng-click=\"assignBed(selectedBed)\"]:not(.ng-hide)");

    @FindBy(how = How.TAG_NAME, using = "ward")
    private List<WebElement> wards;

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
        String bedNumber = findChild(bed,By.cssSelector("span:nth-child(1)")).getText();
        findChild(ward, assignButton).click();
        getPatientFromSpecStore().setBedNumber(bedNumber);
        return Boolean.TRUE;
    }
}

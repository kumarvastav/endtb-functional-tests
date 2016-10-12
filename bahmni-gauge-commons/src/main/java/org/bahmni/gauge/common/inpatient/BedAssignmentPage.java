package org.bahmni.gauge.common.inpatient;

import org.apache.commons.collections.CollectionUtils;
import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class BedAssignmentPage extends BahmniPage{

    private final String noEmptyBed = "No Empty bed.";

    @FindBy(how = How.TAG_NAME, using = "ward")
    List<WebElement> wards;

    @FindBy(how = How.CSS, using = ".bed-info .assign")
    WebElement assignButton;

    public void assignAnEmptyBed() throws Exception {
        waitForSpinner();
        for (WebElement ward : wards) {
            ward.click();
            waitForSpinner();
            List<WebElement> beds = ward.findElements(By.cssSelector(".bed-assignment .available"));
            if(!CollectionUtils.isEmpty(beds)){
                assignBed(beds.get(0));
                return ;
            }
        }
        throw new Exception(noEmptyBed);
    }

    private void assignBed(WebElement bed) {
        bed.click();
        if(assignButton.isDisplayed()){
            assignButton.click();
        }
    }
}

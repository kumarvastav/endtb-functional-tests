package org.bahmni.gauge.common.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by nityadas on 06/10/2016.
 */
public class MedicationsPage extends BahmniPage{

    @FindBy(how= How.CSS, using = "#drug-name")
    public WebElement drugNameField;

    @FindBy(how= How.CSS, using = ".accept-btn")
    public WebElement acceptButton;

    public String getDisplayControlText(String displayTabName) {

        if (displayTabName.toLowerCase().equals("recent"))
            return driver.findElement(By.cssSelector(".drug-orders-history .tabs .tab:nth-of-type(1) .table-mimic")).getText().trim().replace("\n", "");
        else
            return driver.findElement(By.cssSelector(".drug-orders-history .tabs .tab:nth-of-type(2) .table-mimic")).getText().trim().replace("\n", "");
        }

}

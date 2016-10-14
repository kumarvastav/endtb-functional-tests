package org.bahmni.gauge.common.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.By;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nityadas on 06/10/2016.
 */
public class MedicationsPage extends BahmniPage{



    public String getDisplayControlText(String displayTabName) {

        if (displayTabName.toLowerCase().equals("recent"))
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

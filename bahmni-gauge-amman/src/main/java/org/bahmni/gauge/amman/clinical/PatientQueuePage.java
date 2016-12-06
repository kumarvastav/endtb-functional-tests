package org.bahmni.gauge.amman.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.PatientListingPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by swarup on 10/24/16.
 */
public class PatientQueuePage extends PatientListingPage{

    @FindBy(how= How.CSS, using = ".table thead strong")
    public List<WebElement> columnNameElements;

    @FindBy(how= How.CSS, using = ".table tbody tr")
    public List<WebElement> rowsList;

    public String getColumnData(String columnName){
        int columnIndex = getColumnIndex(columnName);
        if (rowsList.isEmpty()){Assert.fail("Patient not found in queue");}
        WebElement row = rowsList.get(0);
        String actualData = row.findElements(By.tagName("td")).get(columnIndex).findElement(By.tagName("span")).getText();
        return actualData;
    }
    public void selectPatientFromQueue(String patientName){
        int columnIndex = getColumnIndex("Name");
        if (rowsList.isEmpty()){Assert.fail("Patient not found in queue");}
        for (WebElement row: rowsList){
            String data = row.findElements(By.tagName("span")).get(columnIndex).getText();
            if (data.contains(patientName)){
                row.findElement(By.tagName("a")).click();
                return;
            }
        }
        Assert.fail("Patient Name " + patientName + " not found in the queue");
    }

    private int getColumnIndex(String coulmnName) {
        int i = 0;
        for (WebElement column:columnNameElements){
            if (column.getText().contains(coulmnName)){return i;}
            i++;
        }
        Assert.fail("Column '"+coulmnName+"' not found");
        return -1;
    }
}

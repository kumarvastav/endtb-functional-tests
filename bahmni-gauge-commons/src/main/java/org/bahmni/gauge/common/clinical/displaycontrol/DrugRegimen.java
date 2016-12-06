package org.bahmni.gauge.common.clinical.displaycontrol;

import org.bahmni.gauge.common.clinical.domain.DrugRegimenRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class DrugRegimen {

    private WebElement webElement;

    public DrugRegimen(WebElement webElement) {
        this.webElement = webElement;
    }

    public String getTitle() {
        WebElement headerElement = webElement.findElement(By.tagName("h2"));
        if (headerElement == null) {
            return null;
        }
        return headerElement.getText();
    }

    public List<DrugRegimenRow> getDrugRegimenRows() throws ParseException {
        List<DrugRegimenRow> regimenRows = new ArrayList<>();

        List<WebElement> drugRegimenRows = webElement.findElements(By.className("regimen-row"));

        for (WebElement element : drugRegimenRows) {
            transformWebElementDrugRegimenRow(element, regimenRows);
        }

        return regimenRows;
    }

    public String getNoRecordsFoundText() {
        WebElement errorMessageElement = webElement
                .findElement(By.xpath("//p[@translate='DISPLAY_CONTROL_ERROR_MESSAGE_KEY']"));
        return errorMessageElement == null ? null : errorMessageElement.getText();
    }

    private void transformWebElementDrugRegimenRow(WebElement regimenElement, List<DrugRegimenRow> regimenRows) throws ParseException {

        Map<String, String> keyValues = new HashMap<>();

        WebElement regimenMonth = regimenElement.findElement(By.className("current-month"));
        WebElement regimenDate = regimenElement.findElement(By.className("regimen-date"));
        List<WebElement> regimenDrugs = regimenElement.findElements(By.className("regimen-drug"));

        for (WebElement element : regimenDrugs) {
            String key = element.getAttribute("id");
            if (element == null || key == null) {
                return;
            }
            WebElement spanElement = element.findElement(By.tagName("span"));
            keyValues.put(key, spanElement.getText());
        }

        DateFormat format = new SimpleDateFormat("dd MMM yy", Locale.ENGLISH);
        Date date = format.parse(regimenDate.getText());

        regimenRows.add(new DrugRegimenRow(Double.parseDouble(regimenMonth.getText()), date, keyValues));
    }

}

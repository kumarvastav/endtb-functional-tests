package org.bahmni.gauge.common.clinical;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.domain.Diagnosis;
import org.bahmni.gauge.util.StringUtil;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by atmaramn on 01/11/2016.
 */
public class DiagnosisPage extends BahmniPage {
    By bDiagnosis=By.cssSelector("[ng-model=\"diagnosis.codedAnswer.name\"]");
    By bOrder=By.cssSelector("[model=\"diagnosis.order\"] button");
    By bAcceptButton=By.cssSelector(".accept-btn");
    By bCertainty=By.cssSelector("[model=\"diagnosis.certainty\"] button");
    By bStatus=By.cssSelector("[model=\"diagnosis.diagnosisStatus\"] button");

    @FindBy(how = How.CSS, using = ".save-consultation")
    public WebElement save;

    public void enterDiagnoses(List<Diagnosis> diagnoses) {
        int index=0;
        for(Diagnosis diagnosis : diagnoses){
            WebElement row=driver.findElements(By.cssSelector(".new-diagnosis .table-body .row")).get(index);
            row.findElement(bDiagnosis).sendKeys(diagnosis.getDiagnosis());
            if(diagnosis.getType().toLowerCase().equals("coded")) {
                findElement(By.cssSelector(".ui-menu-item .ui-corner-all")).click();
                row = driver.findElements(By.cssSelector(".new-diagnosis .table-body .row")).get(index);
            }
            else
            {
                row.findElement(bAcceptButton).click();
            }
            if(diagnosis.getOrder().toLowerCase().equals("primary")){
                row.findElements(bOrder).get(0).click();
            }else {
                row.findElements(bOrder).get(1).click();
            }
            if(diagnosis.getCertainty().toLowerCase().equals("confirmed")){
                row.findElements(bCertainty).get(0).click();
            }else {
                row.findElements(bCertainty).get(1).click();
            }
            if(diagnosis.getStatus().toLowerCase().equals("inactive")){
                row.findElement(bStatus).click();
            }
            getPatientFromSpecStore().setDiagnoses(diagnoses);

            index++;
        }
    }

    public void verifyCurrentDisplayControl(List<Diagnosis> diagnoses) {
        List<WebElement> pastDiagnosis = driver.findElements(By.xpath("//div[contains(@class,'past-diagnosis')]"));
        if(pastDiagnosis.size() > 0){
            pastDiagnosis.get(0).click();
        }
        for (Diagnosis diagnosis:diagnoses) {
            List<WebElement> rows = driver.findElements(By.cssSelector(".diagnosis-row"));
            boolean bFound = false;
            for (WebElement row : rows) {
                String text = row.getText();
                if (text.contains(diagnosis.getDiagnosis())) {
                    Assert.assertTrue(StringUtil.stringDoesNotExist(diagnosis.getOrder().toUpperCase(), text), text.contains(diagnosis.getOrder().toUpperCase()));
                    Assert.assertTrue(StringUtil.stringDoesNotExist(diagnosis.getCertainty().toUpperCase(), text), text.contains(diagnosis.getCertainty().toUpperCase()));
                    if (diagnosis.getStatus().equalsIgnoreCase("Inactive"))
                        Assert.assertTrue(StringUtil.stringDoesNotExist(diagnosis.getStatus(), text), text.contains(diagnosis.getStatus()));

                    bFound = true;
                }

            }
            Assert.assertTrue("Diagnosis "+diagnosis.getDiagnosis()+" Not found",bFound);
        }

    }

    public void editDiagnoses(List<Diagnosis> diagnoses) {
        List<WebElement> rows=driver.findElements(By.cssSelector(".diagnosis-row"));

        for (Diagnosis diagnosis:diagnoses) {
            for (WebElement row:rows) {

            if(row.getText().contains(diagnosis.getDiagnosis())){
                    row.findElement(By.cssSelector(".toggle.fr")).click();

                    if(diagnosis.getOrder().equalsIgnoreCase("primary")){
                        if(!row.findElements(bOrder).get(0).getAttribute("class").contains("active"))
                            row.findElements(bOrder).get(0).click();
                    }else {
                        if(!row.findElements(bOrder).get(1).getAttribute("class").contains("active"))
                            row.findElements(bOrder).get(1).click();
                    }
                    if(diagnosis.getCertainty().equalsIgnoreCase("confirmed")){
                        if(!row.findElements(bCertainty).get(0).getAttribute("class").contains("active"))
                            row.findElements(bCertainty).get(0).click();
                    }else {
                        if(!row.findElements(bCertainty).get(1).getAttribute("class").contains("active"))
                            row.findElements(bCertainty).get(1).click();
                    }
                    if(diagnosis.getStatus().equalsIgnoreCase("inactive")){
                        if(!row.findElement(bStatus).getAttribute("class").contains("active"))
                            row.findElement(bStatus).click();
                    }
                }

            }
        }

        for (Diagnosis updateDiagnosis:diagnoses) {
            int index = 0;
            for (Diagnosis diagnosis:getPatientFromSpecStore().getDiagnoses()) {
                if(updateDiagnosis.getDiagnosis().equals(diagnosis.getDiagnosis()))
                    getPatientFromSpecStore().getDiagnoses().set(index,updateDiagnosis);
                index++;
            }
        }

    }

    public void deleteDiagnoses(List<Diagnosis> diagnoses) {
        for(Diagnosis diagnosis:diagnoses){
            WebElement row=findElement(By.xpath(".//*[@ng-if=\"diagnosis.freeTextAnswer\" and contains(text(),\""+diagnosis.getDiagnosis()+"\")]/ancestor::div[contains(@class,\"diagnosis-row\")]"));
            row.findElement(By.cssSelector(".remove-diagnosis")).click();
            acceptAlert(driver);
        }
        waitForSpinner();
        for (Diagnosis deleteDiagnosis:diagnoses) {
            for (Diagnosis diagnosis:getPatientFromSpecStore().getDiagnoses()) {
                if(deleteDiagnosis.getDiagnosis().equals(diagnosis.getDiagnosis())) {
                    getPatientFromSpecStore().getDiagnoses().remove(diagnosis);
                    break;
                }
            }
        }
    }


    public void removeDiagnosis(Table data) {
        List<TableRow> rows = data.getTableRows();
        int rowSize=driver.findElements(By.xpath("(.//*[contains(@class,'diagnosis-name')])/span[1]")).size();
        List<String> columnNames = data.getColumnNames();
        String value;
        int rowCount=1;
        for (TableRow row : rows) {
            value = row.getCell(columnNames.get(0));
            for (rowCount = 1; rowCount <=rowSize; rowCount++) {
                WebElement element = driver.findElement(By.xpath(("((.//*[contains(@class,'diagnosis-name')])/span[1])[" + rowCount + "]")));
                if (value.equals(element.getText())){
                    driver.findElement(By.xpath(("(.//*[contains(@id,'deleteDiagnosis')])[" + rowCount + "]"))).click();
                    acceptAlert(driver);
                }
                waitForSpinner();
            }
        }

        save.click();
    }

}

package org.bahmni.gauge.common.clinical;

import junit.framework.Assert;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.domain.Diagnosis;
import org.bahmni.gauge.data.StoreHelper;
import org.bahmni.gauge.util.StringUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
            StoreHelper.store(Diagnosis.class,diagnosis);
            index++;
        }
    }

    public void verifyCurrentDisplayControl(List<Diagnosis> diagnoses) {
        int index=0;
        for (Diagnosis diagnosis:diagnoses){
            WebElement row=driver.findElements(By.cssSelector(".diagnosis-row")).get(index++);
            String text=row.getText();
            Assert.assertTrue(StringUtil.stringDoesNotExist(diagnosis.getDiagnosis(),text),text.contains(diagnosis.getDiagnosis()));
            Assert.assertTrue(StringUtil.stringDoesNotExist(diagnosis.getOrder().toUpperCase(),text),text.contains(diagnosis.getOrder().toUpperCase()));
            Assert.assertTrue(StringUtil.stringDoesNotExist(diagnosis.getCertainty().toUpperCase(),text),text.contains(diagnosis.getCertainty().toUpperCase()));
        }
    }
}

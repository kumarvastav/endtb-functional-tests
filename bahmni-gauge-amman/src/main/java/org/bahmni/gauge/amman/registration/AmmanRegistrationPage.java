package org.bahmni.gauge.amman.registration;

import org.bahmni.gauge.amman.registration.domain.PatientAttribute;
import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmmanRegistrationPage extends BahmniPage {

    @FindBy(how = How.CSS, using = ".submit-btn")
    public WebElement save;

    public void fillAttributes(List<PatientAttribute> patientAttributes) {
        for (PatientAttribute patientAttribute : patientAttributes) {
            if (patientAttribute.getAttibuteType().equals("dropdown")) {
                WebElement element = driver.findElement(By.cssSelector(patientAttribute.getIdentifier()));
                new Select(element).selectByVisibleText(patientAttribute.getValue());
            } else {
                WebElement element = driver.findElement(By.id(patientAttribute.getIdentifier()));
                element.sendKeys(patientAttribute.getValue());
            }
        }
    }

    public void clickSave() {
        save.click();
    }
}

package org.bahmni.gauge.amman.registration;

import org.bahmni.gauge.amman.registration.domain.Fields;
import org.bahmni.gauge.amman.registration.domain.PatientAttribute;
import org.bahmni.gauge.common.BahmniPage;
import org.junit.Assert;
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
            WebElement element = driver.findElement(By.cssSelector(patientAttribute.getIdentifier()));
            if (patientAttribute.getAttributeType().equals("dropdown")) {
                new Select(element).selectByVisibleText(patientAttribute.getValue());
            } else if (patientAttribute.getAttributeType().equals("checkbox") && patientAttribute.getValue().equals("True")) {
                element.click();
            } else {
                element.
                element.sendKeys(patientAttribute.getValue());
            }
        }
    }

    public void verifyLegalRepValues() {
        compareFields(Fields.caretakerNameEnglish, Fields.legalRepFullNameEnglish);
        compareFields(Fields.caretakerNameArabic, Fields.legalRepFullNameArabic);
        compareFields(Fields.caretakerGender, Fields.legalRepGender);
        compareFields(Fields.caretakerDob, Fields.legalRepDob);
        compareFields(Fields.caretakerNationality, Fields.legalRepNationality);
    }

    private void compareFields(Fields expected, Fields actual) {
        PatientAttribute patientAttribute = expected.getPatientAttribute();
        String expectedValue = patientAttribute.getValue();

        String identifier = patientAttribute.getIdentifier();
        WebElement element = driver.findElement(By.cssSelector(identifier));
        String actualValue = element.getAttribute("value");
        if (patientAttribute.getAttributeType().equals("dropdown")) {
            actualValue = new Select(element).getFirstSelectedOption().getText();
        }
        System.out.println("expectedValue: " + expectedValue);
        System.out.println("actualValue: " + actualValue);
        Assert.assertTrue(actualValue.equals(expectedValue));
    }

    public void clickSave() {
        save.click();
    }
}

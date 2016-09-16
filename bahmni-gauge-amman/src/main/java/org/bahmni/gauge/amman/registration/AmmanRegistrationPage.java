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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        String expectedValue = expected.getPatientAttribute().getValue();

        PatientAttribute patientAttribute = actual.getPatientAttribute();
        String identifier = patientAttribute.getIdentifier();
        WebElement element = driver.findElement(By.cssSelector(identifier));
        String actualValue = element.getAttribute("value");
        if (patientAttribute.getAttributeType().equals("dropdown")) {
            actualValue = new Select(element).getFirstSelectedOption().getText();
        }
        if (patientAttribute.getAttributeType().equals("date")) {
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-mm-dd");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-mm-yyyy");
            try {
                Date expectedDate = simpleDateFormat1.parse(expectedValue);
                Date actualDate = simpleDateFormat2.parse(actualValue);
                Assert.assertTrue(actualDate.equals(expectedDate));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            Assert.assertTrue(actualValue.equals(expectedValue));
        }
    }

    public void clickSave() {
        save.click();
    }
}

package org.bahmni.gauge.amman.registration;

import org.bahmni.gauge.amman.registration.domain.AmmanPatient;
import org.bahmni.gauge.common.registration.RegistrationFirstPage;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by swarup on 7/26/16.
 */
public class AmmanRegistrationPage extends RegistrationFirstPage{

    public void createPatient(AmmanPatient ammanPatient) {
        txtRegistrationNumber.sendKeys(ammanPatient.getIdNumber());
        txtPatientName.sendKeys(ammanPatient.getFirstName());
        familyName.sendKeys(ammanPatient.getLastName());
        new Select(gender).selectByVisibleText(ammanPatient.getGender());
        ageYears.sendKeys(ammanPatient.getAge());
        clickSave();

    }
}

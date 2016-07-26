package org.bahmni.gauge.amman.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.amman.registration.AmmanRegistrationPage;
import org.bahmni.gauge.amman.registration.domain.AmmanPatient;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.registration.RegistrationFirstPage;

import java.util.Date;
import java.util.Random;

/**
 * Created by swarup on 7/26/16.
 */
public class RegistrationSpec {
    @BeforeClassSteps
    public void waitForAppReady(){ new BahmniPage().waitForSpinner(DriverFactory.getDriver());}

    @Step("Create Amman Patient")
    public void createAmmanPatient(){
        AmmanRegistrationPage registrationPage = (AmmanRegistrationPage) PageFactory.getRegistrationFirstPage();
        AmmanPatient ammanPatient = new AmmanPatient("ID1231".concat(String.valueOf(new Random().nextInt(100))),"first name","last name","Male", 20);
        registrationPage.storePatientInSpecStore(ammanPatient);
        registrationPage.createPatient(ammanPatient);
    }
}

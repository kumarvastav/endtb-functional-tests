package org.bahmni.gauge.amman.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.amman.registration.AmmanRegistrationPage;
import org.bahmni.gauge.amman.registration.domain.AmmanPatient;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;

import java.util.Random;

public class RegistrationSpec {
    @BeforeClassSteps
    public void waitForAppReady() {
        new BahmniPage().waitForSpinner(DriverFactory.getDriver());
    }

    @Step("Create Amman Patient")
    public void createAmmanPatient() {
        AmmanRegistrationPage registrationPage = (AmmanRegistrationPage) PageFactory.getRegistrationFirstPage();
        AmmanPatient ammanPatient = new AmmanPatient();
        registrationPage.storePatientInSpecStore(ammanPatient);
        registrationPage.createPatient(ammanPatient);
    }
}

package org.bahmni.gauge.amman.registration.domain;

import org.bahmni.gauge.common.registration.domain.Patient;
import java.util.Random;

public class AmmanPatient extends Patient {
    public AmmanPatient(){
        this.setPrefix("ID");
        this.setIdNumber(String.valueOf(new Random().nextInt(100)));
        this.setFirstName("first name");
        this.setLastName("last name");
        this.setGender("Male");
        this.setAge("20");
    }
}

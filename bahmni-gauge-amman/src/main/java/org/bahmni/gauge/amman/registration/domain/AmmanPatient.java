package org.bahmni.gauge.amman.registration.domain;

import org.bahmni.gauge.common.registration.domain.Patient;

import java.util.Date;

/**
 * Created by swarup on 7/26/16.
 */
public class AmmanPatient extends Patient{
    public AmmanPatient(String idNumber, String firstName, String lastName, String gender, int age) {
        super("", idNumber, firstName, lastName, gender, new Date(), age, "");
    }
}

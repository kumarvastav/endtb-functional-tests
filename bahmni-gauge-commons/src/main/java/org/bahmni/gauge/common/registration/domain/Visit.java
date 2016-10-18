package org.bahmni.gauge.common.registration.domain;

import org.bahmni.gauge.common.EntityMetaData;
import org.bahmni.gauge.common.Entity;

/**
 * Created by atmaramn on 17/10/2016.
 */
@EntityMetaData(mrs_name = "visit")
public class Visit extends Entity{
    Patient patient;
    String location;
    String type;

    public Patient getPatient() {
        return patient;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }
}

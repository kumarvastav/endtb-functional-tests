package org.bahmni.gauge.common.registration.domain;

import org.bahmni.gauge.data.ModelMetaData;
import org.bahmni.gauge.data.Model;

/**
 * Created by atmaramn on 17/10/2016.
 */
@ModelMetaData(mrs_name = "visit")
public class Visit extends Model {
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

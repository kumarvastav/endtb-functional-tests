package org.bahmni.gauge.amman.registration.domain;

import org.bahmni.gauge.common.registration.domain.Patient;

import java.util.ArrayList;
import java.util.List;

public class AmmanPatient extends Patient {

    private List<PatientAttribute> patientAttributes;

    public List<PatientAttribute> getPatientAttributes() {
        return patientAttributes;
    }

    public void setPatientAttributes(List<PatientAttribute> patientAttributes) {
        this.patientAttributes = patientAttributes;
    }

    public void addAttribute(PatientAttribute patientAttribute) {
        if (this.patientAttributes == null) {
            this.patientAttributes = new ArrayList<PatientAttribute>();
        }
        this.patientAttributes.add(patientAttribute);
    }
}

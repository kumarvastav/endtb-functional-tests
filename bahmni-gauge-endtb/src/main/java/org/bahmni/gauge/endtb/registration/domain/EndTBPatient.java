package org.bahmni.gauge.endtb.registration.domain;

import org.bahmni.gauge.common.registration.domain.Patient;

public class EndTBPatient extends Patient {

    private String nationalIdentificationNumber;

    public String getNationalIdentificationNumber() {
        return nationalIdentificationNumber;
    }

    public void setNationalIdentificationNumber(String nationalIdentificationNumber) {
        this.nationalIdentificationNumber = nationalIdentificationNumber;
    }

}

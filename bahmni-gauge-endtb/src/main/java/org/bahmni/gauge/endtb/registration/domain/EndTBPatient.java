package org.bahmni.gauge.endtb.registration.domain;

import org.bahmni.gauge.common.registration.domain.Patient;

import java.util.Date;

public class EndTBPatient extends Patient {

	private String nationalIdentificationNumber;

	public EndTBPatient(String idNumber, String firstName, String lastName, String gender, Date dateOfBirth, int age, String nationalIdentificationNumber) {
		super("",idNumber, firstName, lastName, gender, dateOfBirth, age, nationalIdentificationNumber );
		this.nationalIdentificationNumber = nationalIdentificationNumber;
	}

	public String getNationalIdentificationNumber() {
		return nationalIdentificationNumber;
	}

}

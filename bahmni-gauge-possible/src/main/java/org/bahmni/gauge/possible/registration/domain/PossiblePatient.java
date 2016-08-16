package org.bahmni.gauge.possible.registration.domain;

import org.bahmni.gauge.common.registration.domain.Patient;

import java.util.Date;

public class PossiblePatient extends Patient {

	private String ward;
	private String municipality;
	private String district;
	private String country;
	private String caste;

	public PossiblePatient(String idNumber, String firstName, String lastName, String gender, Date dateOfBirth, int age,
						   String ward, String municipality, String district, String country, String caste) {
		super("",idNumber, firstName, lastName, gender, dateOfBirth, age, "");
		this.ward = ward;
		this.municipality = municipality;
		this.district = district;
		this.country = country;
		this.caste = caste;
	}

	public String getWard() {return ward;}
	public String getMunicipality() {
		return municipality;
	}
	public String getDistrict() {
		return district;
	}
	public String getCountry() {
		return country;
	}
	public String getCaste() {
		return caste;
	}


}

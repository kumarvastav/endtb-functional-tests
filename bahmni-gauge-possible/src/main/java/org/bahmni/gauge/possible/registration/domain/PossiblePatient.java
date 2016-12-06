package org.bahmni.gauge.possible.registration.domain;

import org.bahmni.gauge.common.registration.domain.Patient;

public class PossiblePatient extends Patient {

	private String ward;
	private String municipality;
	private String caste;

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}
}

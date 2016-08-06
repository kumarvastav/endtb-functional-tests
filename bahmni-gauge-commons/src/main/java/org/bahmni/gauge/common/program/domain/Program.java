package org.bahmni.gauge.common.program.domain;

public class Program {

	private String name;

	private String dateOfRegistration;

	private String uuid;

	private String patientUuid;

	private String treatmentStatus;

	public Program(String name, String dateOfRegistration) {
		this.name = name;
		this.dateOfRegistration = dateOfRegistration;
	}

	public String getName() {
		return name;
	}

	public String getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setTreatmentStatus(String treatmentStatus) {
		this.treatmentStatus = treatmentStatus;
	}

	public void setUuid(String uuid){ this.uuid = uuid; }

	public void setPatientUuid(String uuid){ this.patientUuid = uuid; }

	public String getUuid(){ return uuid; }

	public String getTreatmentStatus() {
		return treatmentStatus;
	}
}

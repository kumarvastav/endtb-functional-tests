package org.bahmni.gauge.common.program.domain;

import org.bahmni.gauge.common.registration.domain.Patient;

public class PatientProgram {
	private String patientProgramUuid;
	private Patient patient;
	private Program program;

	public String getPatientProgramUuid() {
		return patientProgramUuid;
	}

	public void setPatientProgramUuid(String patientProgramUuid) {
		this.patientProgramUuid = patientProgramUuid;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}
}

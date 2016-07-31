package org.bahmni.gauge.endtb.program.domain;

import org.bahmni.gauge.common.program.domain.Program;

public class EndTBProgram extends Program {

	private String registrationNumber;
	private String registrationFacility;

	public EndTBProgram(String name, String dateOfRegistration, String registrationNumber, String registrationFacility) {
		super(name, dateOfRegistration);
		this.registrationNumber = registrationNumber;
		this.registrationFacility = registrationFacility;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public String getRegistrationFacility() {
		return registrationFacility;
	}
}

package org.bahmni.gauge.common.program.domain;

public class Program {

	private String name;

	private String dateOfRegistration;

	private String uuid;

	private String patientUuid;

	private String treatmentStatus;

	private String treatmentDate;

	private String patientStatus;

	private String programStatus;
	private String programStopDate;

	public Program(){

	}
	public Program(String name, String dateOfRegistration) {
		this.name = name;
		this.dateOfRegistration = dateOfRegistration;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}

	public String getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration=dateOfRegistration;
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

	public String getTreatmentDate(){
		return this.treatmentDate;

	}

	public  void setTreatmentDate(String treatmentDate){
		this.treatmentDate=treatmentDate;
	}

	public String getPatientStatus(){
		return this.patientStatus;

	}

	public  void setPatientStatus(String patientStatus){
		this.patientStatus=patientStatus;
	}

	public String getProgramStatus(){
		return this.programStatus;

	}

	public  void setProgramStatus(String programStatus){
		this.programStatus=programStatus;
	}

	public String getPatientUuid() {
		return patientUuid;
	}


	public void setProgramStopDate(String programStopDate) {
		this.programStopDate = programStopDate;
	}

	public String getProgramStopDate() {
		return programStopDate;
	}
}

package org.bahmni.gauge.common.clinical.domain;

import org.bahmni.gauge.rest.BahmniRestClient;

public class DrugOrder {

    private String patientUuid;
    private String programUuid;
    private String drugName;
    private String uniformDose;
    private String uniformDoseUnit;
    private String frequency;
    private String route;
    private String startDate;
    private String duration;
    private String durationUnit;
    private String quantity;
    private String quantityUnit;
    private String sos;
    private String instructions;
    private String additionalInstructions;
    private String drugUuid;


    public DrugOrder(String drugName, String uniformDose, String uniformDoseUnit, String frequency, String route, String startDate, String duration, String durationUnit, String quantity, String quantityUnit, String sos, String instructions, String additionalInstructions) {
        this.drugName = drugName;
        this.uniformDose = uniformDose;
        this.uniformDoseUnit = uniformDoseUnit;
        this.frequency = frequency;
        this.route = route;
        this.startDate = startDate;
        this.duration = duration;
        this.durationUnit = durationUnit;
        this.quantity = quantity;
        this.quantityUnit = quantityUnit;
        this.sos = sos;
        this.instructions = instructions;
        this.additionalInstructions = additionalInstructions;
    }

    public DrugOrder(String drugName, String uniformDose, String uniformDoseUnit, String frequency, String route, String startDate, String additionalInstructions) {
        this(drugName, uniformDose, uniformDoseUnit, frequency, route, startDate, "", "Day(s)", "0", uniformDoseUnit, "false", "As directed", additionalInstructions);
    }


    public String getDrugName() {
        return drugName;
    }

    public String getUniformDose() {
        return uniformDose;
    }

    public String getUniformDoseUnit() {
        return uniformDoseUnit;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getRoute() {
        return route;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getDuration() {
        return duration;
    }

    public String getDurationUnit() {
        return durationUnit;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getQuantityUnit() {
        return quantityUnit;
    }

    public String getSos() {
        return sos;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getAdditionalInstructions() {
        return additionalInstructions;
    }

    public String getPatientUuid() {
        return patientUuid;
    }

    public String getProgramUuid() {
        return programUuid;
    }

    public void setPatientUuid(String patientUuid) {
        this.patientUuid = patientUuid;
    }

    public void setProgramUuid(String programUuid) {
        this.programUuid = programUuid;
    }

    public void setDrugUuid(String drugName) {
        this.drugUuid = BahmniRestClient.get().getUuidOfDrug(drugName);
    }

    public String getDrugUuid() {
        return drugUuid;
    }
}

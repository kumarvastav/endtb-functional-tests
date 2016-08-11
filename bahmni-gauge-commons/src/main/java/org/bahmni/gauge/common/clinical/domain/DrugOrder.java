package org.bahmni.gauge.common.clinical.domain;

import org.bahmni.gauge.rest.BahmniRestClient;

import java.util.Objects;

public class DrugOrder {

    private String patientUuid;
    private String programUuid;
    private String drugName;
    private String uniformDose;
    private String uniformDoseUnit;
    private String frequency;
    private String route;
    private String startDate;
    private String duration = "";
    private String durationUnit = "Day(s)";
    private String quantity = "0";
    private String quantityUnit = "";
    private String sos = "false";
    private String instructions = "As directed";
    private String additionalInstructions;
    private String drugUuid;


    public DrugOrder(String drugName, String frequency, String route, String startDate) {
        this.drugName = drugName;
        this.frequency = frequency;
        this.route = route;
        this.startDate = startDate;
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
        if (Objects.equals(quantityUnit, ""))
            return uniformDoseUnit;
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

    public void setUniformDoseInfo(String uniformDose, String uniformDoseUnit) {
        this.uniformDose = uniformDose;
        this.uniformDoseUnit = uniformDoseUnit;
    }

    public void setAdditionalInformation(String sos, String instructions, String additionalInstructions) {
        this.sos = sos;
        this.instructions = instructions;
        this.additionalInstructions = additionalInstructions;
    }

    public void setDurationInfo(String duration, String durationUnit) {
        this.duration = duration;
        this.durationUnit = durationUnit;
    }

    public void setQuantityInfo(String quantity, String quantityUnit) {
        this.quantity = quantity;
        this.quantityUnit = quantityUnit;
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

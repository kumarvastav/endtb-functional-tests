package org.bahmni.gauge.common.clinical.domain;

import org.bahmni.gauge.rest.BahmniRestClient;

import java.util.Objects;

public class DrugOrder {

    private String patientUuid;
    private String programUuid;
    private String drugName;
    private String dose;
    private String doseUnit;
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

    public DrugOrder(){}

    public String getPatientUuid() {
        return patientUuid;
    }

    public void setPatientUuid(String patientUuid) {
        this.patientUuid = patientUuid;
    }

    public String getProgramUuid() {
        return programUuid;
    }

    public void setProgramUuid(String programUuid) {
        this.programUuid = programUuid;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getDoseUnit() {
        return doseUnit;
    }

    public void setDoseUnit(String doseUnit) {
        this.doseUnit = doseUnit;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getQuantityUnit() {
        if (Objects.equals(quantityUnit, ""))
            return doseUnit;
        return quantityUnit;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit;
    }

    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getAdditionalInstructions() {
        return additionalInstructions;
    }

    public void setAdditionalInstructions(String additionalInstructions) {
        this.additionalInstructions = additionalInstructions;
    }

    public String getDrugUuid() {
        return drugUuid;
    }

    public void setDrugUuid(String drugName) {
        this.drugUuid = BahmniRestClient.get().getUuidOfDrug(drugName);
    }
}

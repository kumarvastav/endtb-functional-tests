package org.bahmni.gauge.common.admin.domain;

public class OrderSetMember {
    private String orderType;
    private String orderTypeUuid;
    private String conceptName;
    private String conceptUuid;

    private String drugName;
    private String drugUuid;
    private String dose;
    private String doseUnit;
    private String frequency;
    private String instruction;
    private String duration;
    private String durationUnit;
    private String route;
    private String additionalInstructions;

    public String getOrderTypeUuid() {
        return orderTypeUuid;
    }

    public void setOrderTypeUuid(String orderTypeUuid) {
        this.orderTypeUuid = orderTypeUuid;
    }

    public String getDrugName() {
        return drugName;
    }

    public String getDrugUuid() {
        return drugUuid;
    }

    public void setDrugUuid(String drugUuid) {
        this.drugUuid = drugUuid;
    }

    public String getConceptUuid() {
        return conceptUuid;
    }

    public void setConceptUuid(String conceptUuid) {
        this.conceptUuid = conceptUuid;
    }

    public String getDose() {
        return dose;
    }

    public String getDoseUnit() {
        return doseUnit;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getInstruction() {
        return instruction;
    }

    public String getDuration() {
        return duration;
    }

    public String getDurationUnit() {
        return durationUnit;
    }

    public String getRoute() {
        return route;
    }

    public String getAdditionalInstructions() {
        return additionalInstructions;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public void setDoseUnit(String doseUnit) {
        this.doseUnit = doseUnit;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setDurationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setAdditionalInstructions(String additionalInstructions) {
        this.additionalInstructions = additionalInstructions;
    }

    public String getOrderType() {
        return orderType;
    }

    public String getConceptName() {
        return conceptName;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setConceptName(String conceptName) {
        this.conceptName = conceptName;
    }

}

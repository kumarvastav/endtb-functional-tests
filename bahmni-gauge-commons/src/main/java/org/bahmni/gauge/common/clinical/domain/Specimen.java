package org.bahmni.gauge.common.clinical.domain;

public class Specimen {
    private String dateOfSampleCollection;

    private String identifier;

    private String typeOfSample;

    public String getDateOfSampleCollection() {
        return dateOfSampleCollection;
    }

    public void setDateOfSampleCollection(String dateOfSampleCollection) {
        this.dateOfSampleCollection = dateOfSampleCollection;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getTypeOfSample() {
        return typeOfSample;
    }

    public void setTypeOfSample(String typeOfSample) {
        this.typeOfSample = typeOfSample;
    }
}

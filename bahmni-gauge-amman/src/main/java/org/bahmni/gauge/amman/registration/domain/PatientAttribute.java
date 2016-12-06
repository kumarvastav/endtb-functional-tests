package org.bahmni.gauge.amman.registration.domain;

public class PatientAttribute {
    private String attributeName;

    private String attibuteType;
    private String identifier;
    private String value;

    public PatientAttribute(String attributeName, String attributeType, String identifier) {
        this.attributeName = attributeName;
        this.attibuteType = attributeType;
        this.identifier = identifier;
    }

    public String getAttributeType() {
        return attibuteType;
    }

    public void setAttibuteType(String attibuteType) {
        this.attibuteType = attibuteType;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

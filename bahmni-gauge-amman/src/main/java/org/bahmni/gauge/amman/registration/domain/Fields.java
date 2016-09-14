package org.bahmni.gauge.amman.registration.domain;

public enum Fields {

    firstName("firstName", "text", "givenName"),
    lastName("lastName", "text", "familyName"),
    gender("gender", "dropdown", "#gender"),
    age("age", "text", "ageYears"),
    country("country", "text", "address3"),
    nationality1("nationality1", "dropdown", "#nationality1"),
    givenNameArabic("givenNameArabic", "text", "givenNameLocal"),
    familyNameArabic("familyNameArabic", "text", "familyNameLocal"),
    governorate("governorate", "text", "stateProvince"),
    phoneNumber1("phoneNumber1", "text", "phoneNumber1"),
    campCountry("campCountry", "text", "campCountry"),
    campGovernorate("campGovernorate", "text", "campGovernorate"),
    campName("campName", "text", "nameoftheCamp"),
    spokenLanguages("spokenLanguages", "text", "spokenLanguages"),
    id1Document("id1Document","text","id1Document"),
    id1DocNumber("id1DocNumber", "text", "id1DocNumber"),
    id1FullNameEnglish("id1FullNameEnglish", "text","id1FullNameEnglish"),
    isCareTakerRequiredCheckBox("isCareTakerRequiredCheckBox", "boolean", "isCareTakerRequired"),
    caretakerNameEnglish("caretakerNameEnglish", "text", "caretakerNameEnglish"),
    caretakerNameArabic("caretakerNameArabic", "text", "caretakerNameArabic"),
    caretakerGender("caretakerGender", "dropdown", "#caretakerGender"),
    caretakerDob("caretakerDob", "date", "caretakerDob"),
    caretakerDocumentType("caretakerDocumentType", "dropdown", "#id3Document"),
    caretakerNameInDocument("caretakerNameInDocument", "text", "id3FullNameEnglish"),
    caretakerPhoneNumber1("caretakerPhoneNumber1", "text", "caretakerPhoneNumber1"),
    legalRepFullNameEnglish("legalRepFullNameEnglish", "text", "legalRepFullNameEnglish"),
    legalRepFullNameArabic("legalRepFullNameArabic", "text", "legalRepFullNameArabic"),
    legalRepRelationWithPatient("legalRepRelationWithPatient", "text", "legalRepRelationWithPatient"),
    legalRepGender("legalRepGender", "dropdown", "#legalRepGender"),
    legalRepDob("legalRepDob", "date", "legalRepDob"),
    legalRepNationality("legalRepNationality", "dropdown", "#legalRepNationality"),
    legalRepalsoCaretaker("legalRepalsoCaretaker", "dropdown", "#legalRepalsoCaretaker");

    private PatientAttribute patientAttribute;

    Fields(String attributeName, String attributeType, String identifier) {
        this.patientAttribute = new PatientAttribute();
        patientAttribute.setAttributeName(attributeName);
        patientAttribute.setAttibuteType(attributeType);
        patientAttribute.setIdentifier(identifier);
    }

    public static PatientAttribute getPatientAttribute(String attributeName) {
        for (Fields field : Fields.values()) {
            if (attributeName.equals(field.getPatientAttribute().getAttributeName()))
                return field.patientAttribute;
        }
        return null;
    }

    public PatientAttribute getPatientAttribute() {
        return patientAttribute;
    }

    public void setPatientAttribute(PatientAttribute patientAttribute) {
        this.patientAttribute = patientAttribute;
    }
}
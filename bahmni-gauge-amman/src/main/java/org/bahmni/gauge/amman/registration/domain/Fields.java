package org.bahmni.gauge.amman.registration.domain;

import java.util.Arrays;
import java.util.List;

public enum Fields {

    firstName("firstName", "text", "#givenName"),
    lastName("lastName", "text", "#familyName"),
    gender("gender", "dropdown", "#gender"),
    age("age", "text", "#ageYears"),
    country("country", "text", "#address3"),
    nationality1("nationality1", "dropdown", "#nationality1"),
    givenNameArabic("givenNameArabic", "text", "#givenNameLocal"),
    familyNameArabic("familyNameArabic", "text", "#familyNameLocal"),
    governorate("governorate", "text", "#stateProvince"),
    phoneNumber1("phoneNumber1", "text", "#phoneNumber1"),
    campCountry("campCountry", "text", "#campCountry"),
    campGovernorate("campGovernorate", "text", "#campGovernorate"),
    campName("campName", "text", "#nameoftheCamp"),
    spokenLanguages("spokenLanguages", "text", "#spokenLanguages"),
    statusofOfficialIDdocuments("statusofOfficialIDdocuments", "dropdown", "#statusofOfficialIDdocuments"),
    id1DocumentType("id1DocumentType","dropdown","#id1Document"),
    id1DocNumber("id1DocNumber", "text", "#id1DocNumber"),
    id1FullNameEnglish("id1FullNameEnglish", "text","#id1FullNameEnglish"),
    isCareTakerRequiredCheckBox("isCareTakerRequiredCheckBox", "checkbox", "#isCareTakerRequired"),
    caretakerNameEnglish("caretakerNameEnglish", "text", "#caretakerNameEnglish"),
    caretakerNameArabic("caretakerNameArabic", "text", "#caretakerNameArabic"),
    caretakerGender("caretakerGender", "dropdown", "#caretakerGender"),
    caretakerDob("caretakerDob", "date", "#caretakerDob"),
    caretakerDocumentType("caretakerDocumentType", "dropdown", "#id3Document"),
    caretakerNameInDocument("caretakerNameInDocument", "text", "#id3FullNameEnglish"),
    caretakerPhoneNumber1("caretakerPhoneNumber1", "text", "#caretakerPhoneNumber1"),
    caretakerNationality("caretakerNationality", "dropdown", "#caretakerNationality"),
    legalRepFullNameEnglish("legalRepFullNameEnglish", "text", "#legalRepFullNameEnglish"),
    legalRepFullNameArabic("legalRepFullNameArabic", "text", "#legalRepFullNameArabic"),
    legalRepRelationWithPatient("legalRepRelationWithPatient", "text", "#legalRepRelationWithPatient"),
    legalRepGender("legalRepGender", "dropdown", "#legalRepGender"),
    legalRepDob("legalRepDob", "date", "#legalRepDob"),
    legalRepNationality("legalRepNationality", "dropdown", "#legalRepNationality"),
    legalRepalsoCaretaker("legalRepalsoCaretaker", "dropdown", "#legalRepalsoCaretaker"),
    expectedDateofArrival("expectedDateofArrival","date","#expectedDateofArrival");

    private PatientAttribute patientAttribute;

    Fields(String attributeName, String attributeType, String identifier) {
        this.patientAttribute = new PatientAttribute(attributeName, attributeType, identifier);
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

    public static List<Fields> getLegalRepFields() {
        return Arrays.asList(legalRepFullNameEnglish, legalRepFullNameArabic,
                legalRepRelationWithPatient, legalRepGender, legalRepDob,
                legalRepNationality, legalRepalsoCaretaker);
    }
}
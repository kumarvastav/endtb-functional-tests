package org.bahmni.gauge.amman.registration.domain;

import org.bahmni.gauge.common.registration.domain.Patient;

public class AmmanPatient extends Patient {
    public AmmanPatient(){
        this.setFirstName("first");
        this.setLastName("last");
        this.setGender("Male");
        this.setAge("20");
    }

    //Address information
    public String country;
    public String governorate;
    
    //patient contact
    public String phoneNumber1;

    //CampAddress
    public String campCountry;
    public String campGovernorate;
    public String campName;
    
    //Other Information
    public String spokenLanguages;
    
    //ID1 document
    public String id1Document;
    public String id1DocNumber;
    public String id1FullNameEnglish;
    public String isCareTakerRequiredCheckBox;
    
    //Caretaker Details
    public String caretakerNameEnglish;
    public String caretakerNameArabic;
    public String caretakerGender;
    public String caretakerDob;
    public String caretakerDocumentType;
    public String caretakerNameInDocument;

    //Legal rep
    public String legalRepFullNameEnglish;
    public String legalRepRelationWithPatient;
    public String legalRepDob;
    public String legalRepalsoCaretaker;

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    public String getGovernorate() {
        return governorate;
    }

    public void setGovernorate(String governorate) {
        this.governorate = governorate;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getCampCountry() {
        return campCountry;
    }

    public void setCampCountry(String campCountry) {
        this.campCountry = campCountry;
    }

    public String getCampGovernorate() {
        return campGovernorate;
    }

    public void setCampGovernorate(String campGovernorate) {
        this.campGovernorate = campGovernorate;
    }

    public String getCampName() {
        return campName;
    }

    public void setCampName(String campName) {
        this.campName = campName;
    }

    public String getSpokenLanguages() {
        return spokenLanguages;
    }

    public void setSpokenLanguages(String spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public String getId1Document() {
        return id1Document;
    }

    public void setId1Document(String id1Document) {
        this.id1Document = id1Document;
    }

    public String getId1DocNumber() {
        return id1DocNumber;
    }

    public void setId1DocNumber(String id1DocNumber) {
        this.id1DocNumber = id1DocNumber;
    }

    public String getId1FullNameEnglish() {
        return id1FullNameEnglish;
    }

    public void setId1FullNameEnglish(String id1FullNameEnglish) {
        this.id1FullNameEnglish = id1FullNameEnglish;
    }

    public String getIsCareTakerRequiredCheckBox() {
        return isCareTakerRequiredCheckBox;
    }

    public void setIsCareTakerRequiredCheckBox(String isCareTakerRequiredCheckBox) {
        this.isCareTakerRequiredCheckBox = isCareTakerRequiredCheckBox;
    }

    public String getCaretakerNameEnglish() {
        return caretakerNameEnglish;
    }

    public void setCaretakerNameEnglish(String caretakerNameEnglish) {
        this.caretakerNameEnglish = caretakerNameEnglish;
    }

    public String getCaretakerNameArabic() {
        return caretakerNameArabic;
    }

    public void setCaretakerNameArabic(String caretakerNameArabic) {
        this.caretakerNameArabic = caretakerNameArabic;
    }

    public String getCaretakerGender() {
        return caretakerGender;
    }

    public void setCaretakerGender(String caretakerGender) {
        this.caretakerGender = caretakerGender;
    }

    public String getCaretakerDob() {
        return caretakerDob;
    }

    public void setCaretakerDob(String caretakerDob) {
        this.caretakerDob = caretakerDob;
    }

    public String getCaretakerDocumentType() {
        return caretakerDocumentType;
    }

    public void setCaretakerDocumentType(String caretakerDocumentType) {
        this.caretakerDocumentType = caretakerDocumentType;
    }

    public String getCaretakerNameInDocument() {
        return caretakerNameInDocument;
    }

    public void setCaretakerNameInDocument(String caretakerNameInDocument) {
        this.caretakerNameInDocument = caretakerNameInDocument;
    }

    public String getLegalRepFullNameEnglish() {
        return legalRepFullNameEnglish;
    }

    public void setLegalRepFullNameEnglish(String legalRepFullNameEnglish) {
        this.legalRepFullNameEnglish = legalRepFullNameEnglish;
    }

    public String getLegalRepRelationWithPatient() {
        return legalRepRelationWithPatient;
    }

    public void setLegalRepRelationWithPatient(String legalRepRelationWithPatient) {
        this.legalRepRelationWithPatient = legalRepRelationWithPatient;
    }

    public String getLegalRepDob() {
        return legalRepDob;
    }

    public void setLegalRepDob(String legalRepDob) {
        this.legalRepDob = legalRepDob;
    }

    public String getLegalRepalsoCaretaker() {
        return legalRepalsoCaretaker;
    }

    public void setLegalRepalsoCaretaker(String legalRepalsoCaretaker) {
        this.legalRepalsoCaretaker = legalRepalsoCaretaker;
    }
}

package org.bahmni.gauge.amman.registration.domain;

import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.rest.BahmniRestClient;

import java.util.ArrayList;
import java.util.List;

public class AmmanPatient extends Patient {
    private String activeVisitUuid;
    private String visitType;
    private String visitTypeUuid;

    private List<PatientAttribute> patientAttributes;

    public List<PatientAttribute> getPatientAttributes() {
        return patientAttributes;
    }

    public void setPatientAttributes(List<PatientAttribute> patientAttributes) {
        this.patientAttributes = patientAttributes;
    }

    public void addAttribute(PatientAttribute patientAttribute) {
        if (this.patientAttributes == null) {
            this.patientAttributes = new ArrayList<PatientAttribute>();
        }
        this.patientAttributes.add(patientAttribute);
    }

    public String getPatientAttributeDataFor(String attribute){
        for (PatientAttribute patientAttribute:patientAttributes){
            if (patientAttribute.getAttributeName().equals(attribute)){
                return patientAttribute.getValue();
            }
        }
        return null;
    }

    public String getActiveVisitUuid() {
        return activeVisitUuid;
    }

    public void setActiveVisitUuid(String activeVisitUuid) {
        this.activeVisitUuid = activeVisitUuid;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getVisitTypeUuid() {
        if (visitType != null) {
            visitTypeUuid = BahmniRestClient.get().getUuidwithDisplayOnPartialUrl(this.visitType, "visittype");
        }
        return visitTypeUuid;
    }
}

package org.bahmni.gauge.common.clinical.domain;

import org.bahmni.gauge.data.Model;
import org.bahmni.gauge.rest.BahmniRestClient;

/**
 * Created by atmaramn on 02/11/2016.
 */
public class Diagnosis extends Model{
    private String diagnosis;
    private String order;
    private String certainty;
    private String status;
    private String type;
    private String encounterDate;

    @Override
    public String getUuid() {
        if(diagnosis!=null && uuid==null){
            uuid= BahmniRestClient.get().getUuidOfDiagnosis(this.diagnosis);
        }
        return uuid;
    }

    public String getEncounterDate() {

        return encounterDate;
    }

    public void setEncounterDate(String encounterDate) {
        this.encounterDate = encounterDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getOrder() {
        return order;
    }

    public String getCertainty() {
        return certainty;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setCertainty(String certainty) {
        this.certainty = certainty;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setType(String type) {
        this.type = type;
    }
}

package org.bahmni.gauge.possible.clinical.domain;

import org.bahmni.gauge.common.clinical.domain.ObservationForm;

/**
 * Created by dharmens on 7/18/16.
 */
public class PatientVitals extends ObservationForm {

    private String systolic;
    private String diastolic;
    private String posture;
    private String temperature;
    private String heartRate;
    private String respiratoryRate;
    private String oxygenSaturation;
    private String weight;

    public PatientVitals(String systolic, String diastolic, String posture, String temperature, String heartRate
                        ,String respiratoryRate, String oxygenSaturation, String weight){
        setSystolic(systolic);
        setDiastolic(diastolic);
        setPosture(posture);
        setTemperature(temperature);
        setHeartRate(heartRate);
        setRespiratoryRate(respiratoryRate);
        setOxygenSaturation(oxygenSaturation);
        setWeight(weight);
    }

    public void setSystolic(String systolic){this.systolic = systolic; }
    public String getSystolic(){return this.systolic; }

    public void setDiastolic(String diastolic){this.diastolic = diastolic; }
    public String getDiastolic(){return this.diastolic; }

    public void setPosture(String posture){this.posture = posture; }
    public String getPosture(){return this.posture; }

    public void setTemperature(String temperature){this.temperature = temperature; }
    public String getTemperature(){return this.temperature; }

    public void setHeartRate(String heartRate){this.heartRate = heartRate; }
    public String getHeartRate(){return this.heartRate; }

    public void setRespiratoryRate(String respiratoryRate){this.respiratoryRate = respiratoryRate; }
    public String getRespiratoryRate(){return this.respiratoryRate; }

    public void setOxygenSaturation(String oxygenSaturation){this.oxygenSaturation = oxygenSaturation; }
    public String getOxygenSaturation(){return this.oxygenSaturation; }

    public void setWeight(String weight){this.weight = weight; }
    public String getWeight(){return this.weight; }

}

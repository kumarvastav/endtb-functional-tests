package org.bahmni.gauge.common.clinical.domain;

import java.util.Date;
import java.util.Map;

public class DrugRegimenRow {
    private double month;
    private Date regimenDate;
    private Map<String, String> drugOGram;

    public DrugRegimenRow(double month, Date regimenDate, Map<String, String> drugOGram) {
        this.month = month;
        this.regimenDate = regimenDate;
        this.drugOGram = drugOGram;
    }

    public double getMonth() {
        return month;
    }

    public Date getRegimenDate() {
        return regimenDate;
    }

    public Map<String, String> getDrugOGram() {
        return drugOGram;
    }
}

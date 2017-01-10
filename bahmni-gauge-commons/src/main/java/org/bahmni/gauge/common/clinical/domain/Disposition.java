package org.bahmni.gauge.common.clinical.domain;

public class Disposition {
    private String type;
    private String date;
    private String notes;

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public String getNotes() {
        return notes;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}

package org.bahmni.gauge.common.clinical.domain;

/**
 * Created by atmaramn on 25/10/2016.
 */
public class Disposition {
    String type;
    String date;
    String notes;

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

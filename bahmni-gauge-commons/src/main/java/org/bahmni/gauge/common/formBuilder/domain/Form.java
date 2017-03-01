package org.bahmni.gauge.common.formBuilder.domain;

import org.bahmni.gauge.data.Model;
import org.bahmni.gauge.data.ModelMetaData;

@ModelMetaData(mrs_name = "form")
public class Form extends Model{
    private String formID;
    private String name;

    public String getFormID() {
        return formID;
    }

    public void setFormID(String formID) {
        this.formID = formID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

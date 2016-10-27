package org.bahmni.gauge.common;

/**
 * Created by atmaramn on 17/10/2016.
 */
public class Model {
    public String uuid;
    public String display;

    public String getUuid() {
        return uuid;
    }

    public String getDisplay() {
        return display;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getMRSName(){
        ModelMetaData e=  this.getClass().getAnnotation(ModelMetaData.class);
        return e.mrs_name();
    }
}

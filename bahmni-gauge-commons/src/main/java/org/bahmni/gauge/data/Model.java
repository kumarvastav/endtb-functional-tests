package org.bahmni.gauge.data;

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
    public String getTemplateName(){
        ModelMetaData e=  this.getClass().getAnnotation(ModelMetaData.class);
        return e.mrs_name().replace('/','_');
    }
}

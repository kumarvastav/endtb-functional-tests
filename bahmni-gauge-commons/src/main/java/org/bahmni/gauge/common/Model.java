package org.bahmni.gauge.common;

/**
 * Created by atmaramn on 17/10/2016.
 */
public class Model {
    public String getMRSName(){
        ModelMetaData e=  this.getClass().getAnnotation(ModelMetaData.class);
        return e.mrs_name();
    }
}

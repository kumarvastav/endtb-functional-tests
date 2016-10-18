package org.bahmni.gauge.common;

/**
 * Created by atmaramn on 17/10/2016.
 */
public class Entity {
    public String getMRSName(){
        EntityMetaData e=  this.getClass().getAnnotation(EntityMetaData.class);
        return e.mrs_name();
    }
}

package org.bahmni.gauge.common.clinical.domain;

import org.bahmni.gauge.data.Model;
import org.bahmni.gauge.data.ModelMetaData;
import org.bahmni.gauge.rest.BahmniRestClient;

/**
 * Created by nityadas on 09/11/2016.
 */
@ModelMetaData(mrs_name = "bahmnicore/bahmniencounter")
public class Order extends Model{

    private String type;
    private String category;
    private String name;
    private String note;
    private String image;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String getUuid() {
        if(name !=null && uuid==null){
            uuid= BahmniRestClient.get().getUuidwithDisplayOnOrdersUrl(this.name);
        }
        return uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
}

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
    private String orderType;
    private String orderName;

    @Override
    public String getUuid() {
        if(orderName!=null && uuid==null){
            uuid= BahmniRestClient.get().getUuidwithDisplayOnOrdersUrl(this.orderName);
        }
        return uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}

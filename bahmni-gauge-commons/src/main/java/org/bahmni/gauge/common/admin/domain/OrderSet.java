package org.bahmni.gauge.common.admin.domain;

import org.bahmni.gauge.data.Model;
import org.bahmni.gauge.data.ModelMetaData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by atmaramn on 05/10/2016.
 */

@ModelMetaData(mrs_name = "bahmniorderset")
public class OrderSet extends Model {
    private String name;
    private String description;
    private String operator;
//    private String uuid;
//
//    public String getUuid() {
//        return uuid;
//    }
//
//    public void setUuid(String uuid) {
//        this.uuid = uuid;
//    }

    private List<OrderSetMember> orderSetMembers=new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getOperator() {
        return operator;
    }

    public List<OrderSetMember> getOrderSetMembers() {
        return orderSetMembers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setOrderSetMembers(List<OrderSetMember> orderSetMembers) {
        this.orderSetMembers = orderSetMembers;
    }
}

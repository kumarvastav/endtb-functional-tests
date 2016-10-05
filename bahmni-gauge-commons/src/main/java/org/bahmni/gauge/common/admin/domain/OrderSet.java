package org.bahmni.gauge.common.admin.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by atmaramn on 05/10/2016.
 */
public class OrderSet {
    private String name;
    private String description;
    private String operator;

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

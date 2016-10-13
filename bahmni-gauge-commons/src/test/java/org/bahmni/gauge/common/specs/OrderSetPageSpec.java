package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.admin.OrderSetDashboardPage;
import org.bahmni.gauge.common.admin.OrderSetPage;
import org.bahmni.gauge.common.admin.domain.OrderSet;
import org.bahmni.gauge.common.admin.domain.OrderSetMember;
import org.bahmni.gauge.util.TableTransformer;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by atmaramn on 05/10/2016.
 */
public class OrderSetPageSpec extends BahmniPage {
    OrderSetPage orderSetPage;
    private final WebDriver driver;

    public OrderSetPageSpec(){
        this.driver = DriverFactory.getDriver();
    }


    @Step("Create orderset and enter following orderset details <table>")
    public void fillOrderSetDetais(Table table){
        orderSetPage= PageFactory.get(OrderSetPage.class);
        orderSetPage.enterDetails(orderSetPage.transformTableToOrderSet(table));
    }

    @Step("Enter following orderset members <table>")
    public void fillOrderSetMembers(Table table){
        int i=0;
        for(OrderSetMember orderSetMember : orderSetPage.transformTableToOrderSetMembers(table))
        {
            orderSetPage.enterMember(i,orderSetMember);

            getOrderSetInSpecStore().getOrderSetMembers().add(orderSetMember);

            i++;

        }
    }

    @Step("Save the orderset")
    public void saveOrderSet(){
        orderSetPage.clickSave();
        waitForSpinner(this.driver);
    }

    @Step("Click on back button on orderset page")
    public void back()
    {
        orderSetPage.back();
        waitForSpinner(this.driver);
    }
    public OrderSet createOrderSet(String namePrefix, String description, String operator){
        ArrayList<String> headers=new ArrayList<>();
        headers.add("name");
        headers.add("description");
        headers.add("operator");
        Table table=new Table(headers);
        ArrayList<String> row=new ArrayList<>();
        row.add(namePrefix);
        row.add(description);
        row.add(operator);

        table.addRow(row);

        TableTransformer<OrderSet> osTT=new TableTransformer<>(OrderSet.class);
        OrderSet orderSet=osTT.transformTableToEntity(table);
        return orderSet;

    }
    @Step("Create orderset <namePrefix>, description <description>, operator <operator> with following members using api <table>")
    public void createOrderSetUsingApi(String namePrefix, String description, String operator, Table orderSetMembers){

        orderSetPage= PageFactory.get(OrderSetPage.class);
        OrderSet orderSet=createOrderSet(namePrefix,description,operator);

        for(OrderSetMember orderSetMember : orderSetPage.transformTableToOrderSetMembers(orderSetMembers))
        {
            orderSet.getOrderSetMembers().add(orderSetMember);
        }

        orderSetPage.createOrderSetUsingApi(orderSet);

    }

    @Step("Edit previous orderset as <namePrefix>, description <description>, operator <operator> with following details <table>")
    public void editOrderSet(String namePrefix, String description, String operator, Table orderSetMembers){
        orderSetPage= PageFactory.get(OrderSetPage.class);
        OrderSet orderSet=getOrderSetInSpecStore();
        TableTransformer<OrderSet> tableTransformer=new TableTransformer<>(OrderSet.class);

        tableTransformer.updateEntityProperty(orderSet,"name",namePrefix);
        tableTransformer.updateEntityProperty(orderSet,"description",description);
        tableTransformer.updateEntityProperty(orderSet,"operator",operator);

        orderSet.getOrderSetMembers().clear();


        for(OrderSetMember orderSetMember : orderSetPage.transformTableToOrderSetMembers(orderSetMembers))
        {
            orderSet.getOrderSetMembers().add(orderSetMember);
        }

        orderSetPage.editOrderSet(orderSet);

    }

    @Step("Verify previous orderset")
    public void verifyOrderSet(){
        orderSetPage= PageFactory.get(OrderSetPage.class);
        OrderSet orderSet=getOrderSetInSpecStore();
        orderSetPage.verifyOrderSet(orderSet);

    }
}

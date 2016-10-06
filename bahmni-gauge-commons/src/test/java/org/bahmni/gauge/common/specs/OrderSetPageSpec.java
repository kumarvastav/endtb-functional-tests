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
import org.openqa.selenium.WebDriver;

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

    @Step("Create orderset <namePrefix>, description <description>, operator <operator> with following members using api <table>")
    public void createOrderSetUsingApi(String namePrefix, String description, String operator, Table orderSetMembers){
        orderSetPage= PageFactory.get(OrderSetPage.class);
        OrderSet orderSet=new OrderSet();
        orderSet.setName(namePrefix + (new Random().nextInt()));
        orderSet.setDescription(description);
        orderSet.setOperator(operator);
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
        orderSet.setName(namePrefix + (new Random().nextInt()));
        orderSet.setDescription(description);
        orderSet.setOperator(operator);
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

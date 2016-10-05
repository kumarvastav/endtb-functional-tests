package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.admin.OrderSetPage;
import org.bahmni.gauge.common.admin.domain.OrderSetMember;

/**
 * Created by atmaramn on 05/10/2016.
 */
public class OrderSetPageSpec extends BahmniPage {
    OrderSetPage orderSetPage;

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
            i++;
        }
    }

    @Step("Save the orderset")
    public void saveOrderSet(){
        orderSetPage.clickSave();
    }

    @Step("Click on back button on orderset page")
    public void back()
    {
        orderSetPage.back();
    }
}

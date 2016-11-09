package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.BahmniPage;

/**
 * Created by atmaramn on 09/11/2016.
 */
public class OrdersPageSpec extends BahmniPage {
    @Step("Select following <orderType> orders under section <orderSection> <table>")
    public void selectOrders(String orderType, String orderSection, Table table){

    }

    @Step("Unselect following <orderType> orders under section <orderSection> <table>")
    public void unselectOrders(String orderType, String orderSection, Table table){

    }


    @Step("Enter notes to following <orderType> orders <table>")
    public void selectOrders(String orderType, Table table){

    }


    @Step("Verify order details on orders page")
    public void verifyOrders(){

    }

    @Step("Verify notes are not editable for <orderType> orders")
    public void verifyNotesNotEditable(String orderType){

    }
}

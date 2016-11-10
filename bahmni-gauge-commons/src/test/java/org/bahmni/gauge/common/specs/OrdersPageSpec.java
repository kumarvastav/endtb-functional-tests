package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.OrdersPage;
import org.bahmni.gauge.common.clinical.domain.Order;
import org.bahmni.gauge.util.TableTransformer;

import java.util.List;

/**
 * Created by atmaramn on 09/11/2016.
 */
public class OrdersPageSpec extends BahmniPage {
    @Step("Select following orders <table>")
    public void selectOrders(Table table){
        OrdersPage ordersPage= PageFactory.get(OrdersPage.class);
        List<Order> orders=TableTransformer.asEntityList(table,Order.class);
        ordersPage.selectorders(orders);
    }

    @Step("Unselect following orders <table>")
    public void unselectOrders(Table table){
        OrdersPage ordersPage= PageFactory.get(OrdersPage.class);
        List<Order> orders=TableTransformer.asEntityList(table,Order.class);
        ordersPage.selectorders(orders);
    }


    @Step("Enter notes to following <orderType> orders <table>")
    public void selectOrders(String orderType, Table table){
        OrdersPage ordersPage= PageFactory.get(OrdersPage.class);
        List<Order> orders=TableTransformer.asEntityList(table,Order.class);
        for(TableRow row:table.getTableRows()){
            ordersPage.enterNotes(row.getCell("order"),row.getCell("note"));
        }
    }


    @Step("Verify order details on orders page")
    public void verifyOrders(){
        OrdersPage ordersPage= PageFactory.get(OrdersPage.class);
        List<Order> orders=getPatientFromSpecStore().getOrders();
        ordersPage.verifyOrders(orders);

    }

    @Step("Verify notes are not editable for <orderType> orders")
    public void verifyNotesNotEditable(String orderType){
        OrdersPage ordersPage= PageFactory.get(OrdersPage.class);
        ordersPage.verifyNotesNonEditable(orderType);

    }
}

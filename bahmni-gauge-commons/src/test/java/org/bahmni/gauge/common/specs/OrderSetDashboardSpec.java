package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.admin.OrderSetDashboardPage;

/**
 * Created by atmaramn on 05/10/2016.
 */
public class OrderSetDashboardSpec extends BahmniPage{


    @Step("Click on create new button on orderset dashboard")
    public void clickCreateNew(){
        OrderSetDashboardPage orderSetDashboardPage= PageFactory.get(OrderSetDashboardPage.class);
        orderSetDashboardPage.clickCreateNewButton();
    }

    @Step("Verify orderset created")
    public void verifyOrdersetCreated(){
        OrderSetDashboardPage orderSetDashboardPage= PageFactory.get(OrderSetDashboardPage.class);
        orderSetDashboardPage.ordersetExists(getOrderSetInSpecStore());
    }
}

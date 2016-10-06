package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.admin.AdminPage;
import org.bahmni.gauge.common.admin.OrderSetDashboardPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Created by atmaramn on 05/10/2016.
 */
public class OrderSetDashboardSpec extends BahmniPage{
    private final WebDriver driver;
    private OrderSetDashboardPage orderSetDashboardPage;

    public OrderSetDashboardSpec(){
        this.driver = DriverFactory.getDriver();
    }


    @Step("Click on create new button on orderset dashboard")
    public void clickCreateNew(){
        orderSetDashboardPage= PageFactory.get(OrderSetDashboardPage.class);
        orderSetDashboardPage.clickCreateNewButton();
        waitForSpinner(this.driver);
    }

    @Step("Verify orderset created")
    public void verifyOrdersetCreated(){
        orderSetDashboardPage= PageFactory.get(OrderSetDashboardPage.class);
        Assert.assertTrue("Order Set not created",orderSetDashboardPage.ordersetExists(getOrderSetInSpecStore()));
    }

    @Step("Click on previous orderset")
    public void clickPreviousOrderSet(){
        OrderSetDashboardPage orderSetDashboardPage= PageFactory.get(OrderSetDashboardPage.class);
        orderSetDashboardPage.clickOrderSet(getOrderSetInSpecStore());
        waitForSpinner(this.driver);
    }

    @Step("delete previous orderset")
    public void deleteOrderSet(){
        OrderSetDashboardPage orderSetDashboardPage= PageFactory.get(OrderSetDashboardPage.class);
        orderSetDashboardPage.deleteOrderSet(getOrderSetInSpecStore());
        waitForSpinner(this.driver);

    }

    @Step("verify previous orderset deleted")
    public void verifyOrderSetDeleted(){
        orderSetDashboardPage= PageFactory.get(OrderSetDashboardPage.class);
        Assert.assertFalse("Order Set not deleted",orderSetDashboardPage.ordersetExists(getOrderSetInSpecStore()));
    }

}

package org.bahmni.gauge.common.admin;

import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.admin.domain.OrderSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class OrderSetDashboardPage extends BahmniPage {
    @FindBy(how = How.CSS, using = ".orderSet-Create")
    public WebElement createNew;

    @FindBy(how = How.CSS, using = "tr.ng-scope")
    public List<WebElement> orderSetRows;


    public void clickCreateNewButton()
    {
        createNew.click();
    }

    public boolean ordersetExists(OrderSet orderSet) {
        waitForElementOnPage(By.cssSelector("tr.ng-scope"));
        for(WebElement element:orderSetRows){
            if(element.getText().contains(orderSet.getName()))
                return true;
        }
        return false;

    }

    public void clickOrderSet(OrderSet orderSet) {
        waitForElementOnPage(By.cssSelector("tr.ng-scope"));
        for(WebElement element:orderSetRows){
            if(element.getText().contains(orderSet.getName()))
                element.findElement(By.cssSelector("a")).click();
        }
    }

    public void deleteOrderSet(OrderSet orderSet){
        waitForElementOnPage(By.cssSelector("tr.ng-scope"));
        for(WebElement element:orderSetRows){
            if(element.getText().contains(orderSet.getName()))
                element.findElement(By.cssSelector("input")).click();
        }
    }
}

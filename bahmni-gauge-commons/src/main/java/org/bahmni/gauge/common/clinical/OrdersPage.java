package org.bahmni.gauge.common.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.domain.Order;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * Created by atmaramn on 09/11/2016.
 */
public class OrdersPage extends BahmniPage {
    @FindBy(how = How.CSS,using = ".order-title:not(.mylegend)")
    public List<WebElement> orderSections;

    public void selectorders(List<Order> orders) {
        for(Order order:orders){
            for(WebElement ordersection:orderSections){
                if(ordersection.getText().toLowerCase().contains(order.getType().toLowerCase())){
                    try {
                        ordersection.findElement(By.cssSelector(".fa-caret-right")).click();
                    } catch (NoSuchElementException ex){

                    } catch (ElementNotVisibleException ex){

                    }
                    scrollToTop();
                    driver.findElement(By.xpath(".//a[@ng-click=\"showLeftCategoryTests(sample)\" and contains(text(),\""+order.getOrderType()+"\")]")).click();
                    for(WebElement element:driver.findElements(By.cssSelector(".grid-row-element.button.orderBtn"))){
                        if (element.getText().toLowerCase().contains(order.getOrderName().toLowerCase())){
                            element.click();
                        }
                    }
                }
            }
        }
    }

    public void enterNotes(String order, String note) {
        for(WebElement element:driver.findElements(By.cssSelector(".selected-orders .grid-row-element"))){
            if(element.getText().toLowerCase().contains(order.toLowerCase())){
                element.findElement(By.cssSelector(".fa-file-text-o")).click();
                waitForElementOnPage(By.cssSelector("[ng-model=\"orderNoteText\"]"));
                driver.findElement(By.cssSelector("[ng-model=\"orderNoteText\"]")).sendKeys(note);
                findButtonByText("OK").click();
            }
        }
    }

    public void verifyOrders(List<Order> orders) {
        for(Order order:orders){
            for(WebElement ordersection:orderSections){
                if(ordersection.getText().toLowerCase().contains(order.getType().toLowerCase())){
                    try {
                        ordersection.findElement(By.cssSelector(".fa-caret-right")).click();
                    } catch (NoSuchElementException ex){

                    } catch (ElementNotVisibleException ex){

                    }
                    scrollToTop();
                    boolean found=false;
                    for(WebElement element:driver.findElements(By.cssSelector(".selected-orders .grid-row-element"))){
                        if(element.getText().toLowerCase().contains(order.getOrderName().toLowerCase())){
                            found=true;
                            break;
                        }
                    }
                    Assert.assertTrue("Order "+order.getOrderName()+ " Not found",found);
                }
            }
        }
    }

    public void verifyNotesNonEditable(String orderType) {
        for(WebElement ordersection:orderSections){
            if(ordersection.getText().toLowerCase().contains(orderType.toLowerCase())){
                try {
                    ordersection.findElement(By.cssSelector(".fa-caret-right")).click();
                } catch (NoSuchElementException ex){

                } catch (ElementNotVisibleException ex){

                }
                for(WebElement element:driver.findElements(By.cssSelector(".selected-orders .grid-row-element"))){
                    scrollToBottom();
                    element.findElement(By.cssSelector(".fa-file-text-o")).click();
                    waitForElementOnPage(By.cssSelector("[ng-model=\"orderNoteText\"]"));
                    Assert.assertFalse("Notes are editable",driver.findElement(By.cssSelector("[ng-model=\"orderNoteText\"]")).isEnabled());

                    WebElement popup=driver.findElement(By.cssSelector(".ngdialog-content"));


                    Actions builder = new Actions(driver);
                    builder.moveToElement(driver.findElement(By.cssSelector(".ngdialog-overlay")),popup.getLocation().getX()-30, popup.getLocation().getY()-30).click().build().perform();
                    waitForElement(driver,ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ngdialog-overlay")));
                }

            }
        }

    }
}

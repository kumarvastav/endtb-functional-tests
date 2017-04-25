package org.bahmni.gauge.common.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.domain.Order;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class OrdersPage extends BahmniPage {
    @FindBy(how = How.CSS,using = ".order-title:not(.mylegend)")
    public List<WebElement> orderSections;

    By orderTitles = By.cssSelector("h2.order-title");
    By removeSelector = By.cssSelector(".fa.fa-remove");
    By undoSelector = By.cssSelector(".fa.fa-undo");
    By selectedItemsSelector = By.cssSelector(".selected-items li");


    public void deleteOrders(List<Order> orders) {

        for (Order deletedOrder:orders) {
            List<WebElement> selectedOrders  = driver.findElements(selectedItemsSelector);

            for (WebElement selectedOrder:selectedOrders) {
                if (selectedOrder.getText().equalsIgnoreCase(deletedOrder.getName())) {
                    selectedOrder.findElement(removeSelector).click();

                        int index = 0;
                        for (Order order:getPatientFromSpecStore().getOrders()) {
                            if(deletedOrder.getName().equals(order.getName())) {
                                getPatientFromSpecStore().getOrders().remove(index);
                                break;
                            }
                            index++;
                        }
                }
            }
        }
    }

    public void undoDelete(List<Order> orders) {

        for (Order updatedOrder:orders) {

            List<WebElement> deletedOrders = driver.findElements(selectedItemsSelector);

            for (WebElement deletedOrder : deletedOrders) {
                if (deletedOrder.getText().equalsIgnoreCase(updatedOrder.getName())) {
                    deletedOrder.findElement(undoSelector).click();
                    getPatientFromSpecStore().getOrders().add(updatedOrder);
                }
            }
        }
    }

    public void clickOrder(String orderName){

        List<WebElement> orderTypeElements=driver.findElements(orderTitles);
        for(WebElement orderType:orderTypeElements){
            if(orderType.getText().equalsIgnoreCase(orderName)){
                orderType.click();
            }
        }
    }

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
                    driver.findElement(By.xpath(".//a[@ng-click=\"showLeftCategoryTests(sample)\" and contains(text(),\""+order.getCategory()+"\")]")).click();
                    for(WebElement element:driver.findElements(By.cssSelector(".grid-row-element.button.orderBtn"))){
                        if (element.getText().toLowerCase().contains(order.getName().toLowerCase())){
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
                waitForElementOnPage(By.cssSelector("[ng-model=\"$parent.orderNoteText\"]"));
                driver.findElement(By.cssSelector("[ng-model=\"$parent.orderNoteText\"]")).sendKeys(note);
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
                        if(element.getText().toLowerCase().contains(order.getName().toLowerCase())){
                            found=true;
                            break;
                        }
                    }
                    Assert.assertTrue("Order "+order.getCategory()+ " Not found",found);
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
                    waitForElementOnPage(By.cssSelector("[ng-model=\"$parent.orderNoteText\"]"));
                    Assert.assertFalse("Notes are editable",driver.findElement(By.cssSelector("[ng-model=\"$parent.orderNoteText\"]")).isEnabled());

                    WebElement popup=driver.findElement(By.cssSelector(".ngdialog-content"));


                    Actions builder = new Actions(driver);
                    //builder.sendKeys(Keys.ESCAPE).perform();
                    driver.findElement(By.cssSelector(".ngdialog-overlay")).click();
                    //builder.moveToElement(driver.findElement(By.cssSelector(".ngdialog-overlay")),popup.getLocation().getX()-30, popup.getLocation().getY()-30).click().build().perform();
                    waitForElement(driver,ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ngdialog-overlay")));
                }

            }
        }

    }

    public void addOrdersAPI(List<Order> orders) {
        getPatientFromSpecStore().setOrders(orders);
        BahmniRestClient.get().createOrders(getPatientFromSpecStore());
    }
}

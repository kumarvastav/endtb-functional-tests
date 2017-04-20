package org.bahmni.gauge.common.orders;

import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.domain.Order;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class OrdersFulfillmentPage extends BahmniPage {
    @FindBy(how = How.CSS, using = ".order-fullfilment-contianer")
    public List<WebElement> sections;

    @FindBy(how = How.CSS, using = ".confirm")
    public  WebElement save;

    private String sSectionXpath="//span[contains(text(),\"%s\")]/ancestor::div[contains(@class,\"order-fullfilment-contianer\")]";

    public void verifyOrders(List<Order> orders) {
        for(Order order:orders){
            try{
                findElement(By.xpath(String.format(sSectionXpath,order.getName())));
            } catch (NoSuchElementException ex){
                Assert.fail("Order "+order.getName()+" Not found");
            }
        }
    }

    public void fulfill(List<Order> orders) {
        for(Order order:orders) {
            WebElement root = findElement(By.xpath(String.format(sSectionXpath,order.getName())));
            root.findElement(By.cssSelector(".fa-caret-right")).click();
            waitForSpinner();
            uploadFile(root,order.getImage());
            root.findElement(By.cssSelector("[ng-model=\"observation.value\"]")).sendKeys(order.getNote());
        }
        waitForSpinner();
        save.click();
    }

    public void verifyOrdersDetails(List<Order> orders) {
        for(Order order:orders){
            try{
                WebElement element=findElement(By.xpath(String.format(sSectionXpath,order.getName()))).findElement(By.tagName("textarea"));
                Assert.assertTrue("Note " + order.getNote() + " not found",element.getAttribute("value").contains(order.getNote()));

            } catch (NoSuchElementException ex){
                Assert.fail("Order "+order.getName()+" Not found");
            }
        }
    }
}

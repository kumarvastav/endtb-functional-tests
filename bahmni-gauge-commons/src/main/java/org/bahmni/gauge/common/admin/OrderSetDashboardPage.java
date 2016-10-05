package org.bahmni.gauge.common.admin;

import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.admin.domain.OrderSet;
import org.bahmni.gauge.common.clinical.domain.ObservationForm;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by atmaramn on 05/10/2016.
 */
public class OrderSetDashboardPage extends BahmniPage {
    @FindBy(how = How.CSS, using = ".orderSet-Create")
    public WebElement createNew;

    public void clickCreateNewButton()
    {
        waitForSpinner();
        createNew.click();
    }

    public void ordersetExists(OrderSet orderSet) {
        waitForElementOnPage(By.xpath(".//a[text()='" + orderSet.getName() + "']"));
        WebElement orderSetButton = null;
        try {
            orderSetButton = findElement(By.xpath(".//a[text()='" + orderSet.getName() + "']"));
        } catch (NoSuchElementException ex) {
            Assert.fail("Orderset not created");
        }
        Assert.assertNotNull("Orderset not created",orderSetButton);

    }
}

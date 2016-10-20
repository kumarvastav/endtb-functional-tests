package org.bahmni.gauge.common.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DispositionPage extends BahmniPage {
    @FindBy(how = How.CSS, using = "#dispositionAction")
    public WebElement optionWebElement;

    public void captureDataForDisposition(String dispositionType) {
        Select dispositionOptions = new Select(optionWebElement);
        WebElement option = find(dispositionOptions.getOptions(), dispositionType);
        option.click();
    }

    public void verifyOptionCount(int optCount){
        Select dispositionOptions = new Select(optionWebElement);
        Assert.assertEquals("Expected Count : "+optCount+"\nActual Count : "+dispositionOptions.getOptions().size(),optCount+1,dispositionOptions.getOptions().size());


    }
    public void verifyOptions(String option) {
        Select dispositionOptions = new Select(optionWebElement);
        Assert.assertTrue(find(dispositionOptions.getOptions(), option).isDisplayed());

    }
}

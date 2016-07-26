package org.bahmni.gauge.amman.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.bahmni.gauge.common.home.HomePage;

/**
 * Created by swarup on 7/26/16.
 */
public class AmmanHomePage extends HomePage{
    @FindBy(how= How.CSS, using = "i.fa-user")
    public WebElement registration;

    @Override
    public void clickRegistrationApp(){
        registration.click();
    }

}

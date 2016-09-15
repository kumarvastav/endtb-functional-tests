package org.bahmni.gauge.possible.specs;

import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.specs.RegistrationFirstPageSpec;
import org.bahmni.gauge.possible.registration.PossibleRegistrationFirstPage;
import org.openqa.selenium.WebDriver;

public class PossibleRegistrationFirstPageSpec extends RegistrationFirstPageSpec {

    private final WebDriver driver;

    public PossibleRegistrationFirstPageSpec() {
        this.driver = DriverFactory.getDriver();
        this.registrationFirstPage = PageFactory.get(PossibleRegistrationFirstPage.class);
    }
}

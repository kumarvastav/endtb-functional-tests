package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.formBuilder.FormBuilderPage;
import org.bahmni.gauge.common.formBuilder.FormDetailPage;
import org.openqa.selenium.WebDriver;

public class FormDetailPageSpec {
    private final WebDriver driver;
    private FormDetailPage formDetailPage;

    public FormDetailPageSpec() {
        this.driver = DriverFactory.getDriver();
    }

    @BeforeClassSteps
    public void waitForAppReady() {
        BahmniPage.waitForSpinner(driver);
    }

    @Step("Click on Edit")
    public void goToEditModal() {
        formDetailPage = PageFactory.get(FormDetailPage.class);
        formDetailPage.clickOnEdit();
    }
}

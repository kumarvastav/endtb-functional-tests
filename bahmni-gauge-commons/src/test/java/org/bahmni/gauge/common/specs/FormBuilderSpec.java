package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.formBuilder.FormBuilderPage;
import org.bahmni.gauge.common.formBuilder.domain.Form;
import org.bahmni.gauge.data.StoreHelper;
import org.openqa.selenium.WebDriver;

public class FormBuilderSpec {
    private final WebDriver driver;
    private FormBuilderPage formBuilderPage;

    public FormBuilderSpec() {
        this.driver = DriverFactory.getDriver();
    }

    @BeforeClassSteps
    public void waitForAppReady() {
        BahmniPage.waitForSpinner(driver);
    }

    @Step("Click create a form")
    public void goToCreateFormDialog() {
        formBuilderPage = PageFactory.getFormBuilderPage();
        formBuilderPage.clickCreateForm();
    }

    @Step("Create a form with name <formName>")
    public void enterFormName(String formName) {
        formBuilderPage = PageFactory.getFormBuilderPage();
        formBuilderPage.enterName(formName);
        String uuid = getUuid();
        Form form = new Form();
        form.setUuid(uuid);
        StoreHelper.store(Form.class, form);
    }

    @Step("Enter version <versionNumber> of <formName> form details")
    public void enterFormDetail(String versionNumber, String formName) {
        formBuilderPage = PageFactory.getFormBuilderPage();
        formBuilderPage.clickOnAction(versionNumber, formName);
    }

    private String getUuid() {
        String[] splitedString = driver.getCurrentUrl().split("/");
        return splitedString[splitedString.length - 1];
    }
}

package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.formBuilder.FormDetailPage;
import org.bahmni.gauge.common.formBuilder.domain.Form;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

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
    public void showConfirmEdit() {
        formDetailPage = PageFactory.get(FormDetailPage.class);
        formDetailPage.clickOnEdit();
    }

    @Step("Confirm edit")
    public void goToEditModal() {
        formDetailPage = PageFactory.get(FormDetailPage.class);
        formDetailPage.clickOnOK();
    }

    @Step("Navigate to form list")
    public void goToFormList() {
        formDetailPage = PageFactory.get(FormDetailPage.class);
        formDetailPage.clickOnFormBuilder();
    }

    @Step("Click on publish")
    public void publishForm() {
        formDetailPage = PageFactory.get(FormDetailPage.class);
        formDetailPage.clickOnPublish();
    }

    @Step("Save <formName> form using <formModleName> by API")
    public void saveFormByAPI(String formName, String formModelName) {
        String uuid = getUuid();
        Form form = new Form();
        form.setName(formName);
        Map<String, Object> formAttributes = new HashMap<>();
        formAttributes.put("name", form.getName());
        formAttributes.put("uuid", uuid);
        BahmniRestClient.get().saveFormUsingAPI(("form_" + formModelName + "_save.ftl"), formAttributes);
    }

    private String getUuid() {
        String[] splitedString = driver.getCurrentUrl().split("/");
        return splitedString[splitedString.length - 1];
    }
}

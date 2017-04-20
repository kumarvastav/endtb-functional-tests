package org.bahmni.gauge.common.clinical;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.domain.ObservationForm;
import org.bahmni.gauge.common.formBuilder.domain.Form;
import org.bahmni.gauge.data.StoreHelper;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObservationsPage extends BahmniPage {

    @FindBy(how = How.CSS, using = ".icon-bahmni-expand")
    public WebElement expandAllButton;

    @FindBy(how = How.CSS, using = ".icon-bahmni-collapse")
    public WebElement collapseAllButton;

    @FindBy(how = How.CSS, using = "#template-control-panel-button")
    public WebElement addFormButton;

    @FindBy(how = How.ID, using = "templateSearch")
    public WebElement searchInput;

    @FindBy(how = How.CSS, using = "button[id*=\"chief_complaint_data_addmore_observation\"]")
    public WebElement addmore;

    @FindBy(how = How.CSS, using = "#dashboard-link")
    public WebElement dashboard;

    @FindBy(how = How.CSS, using = ".leaf-observation-node")  //.dashboard-content
    public List<WebElement> observation_nodes;

    @FindBy(how = How.CSS, using = ".template-control-panel")
    public WebElement templatePanel;

    @FindBy(how = How.CSS, using = ".save-consultation")
    public WebElement save;

    @FindBy(how = How.XPATH, using = "//span[text()='Adverse Effects']/../../div//input")
    public WebElement adverseEffects;

    @FindBy(how = How.ID, using = "template-control-panel-button")
    public WebElement addNewObsForm;

    @FindBy(how = How.CSS, using = "div[ng-if=\"isFormTemplate(conceptSet)\"]")
    public WebElement formTemplate;

    @FindBy(how = How.CSS, using = ".show-btn")
    public WebElement ok;

    @FindBy(how = How.CSS, using = ".multi-select-lab-tests")
    public WebElement leftPane;

    public void selectTemplate(String templateName) {
        clickTemplateButton();
        List<WebElement> allForms = templatePanel.findElements(By.tagName("button"));

        for (WebElement allForm : allForms) {
            String text = allForm.getText(); //For debugging
            if (text.contains(templateName)) {
                allForm.click();
                break;
            }
        }
    }

    public WebElement expandObservationTemplate(String templateId) {
        List <WebElement> templateList = driver.findElements(By.cssSelector("section.concept-set-panel-left  li .concept-set-name"));
        for (WebElement templateName : templateList) {
            if (templateName.getText().contains(templateId))
                templateName.click();
        }
        waitForSpinner();
        return driver.findElement(getSectionWithChildHavingId());
    }

    protected void clickTemplateButton() {
        addFormButton.click();
    }

    @Deprecated
    public void fillTemplateData(Table table) {

        WebElement observ_label;
        WebElement answer;
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();

        for (int i = 0; i <= observation_nodes.size() - 1 && i <= columnNames.size() - 1; i++) {
            observ_label = observation_nodes.get(i).findElement(By.tagName("label"));
            if (observ_label.getText().contains(columnNames.get(i))) {
                answer = observation_nodes.get(i).findElement(By.cssSelector(".field-value"));
                if (answer.getText().length() != 0) {
                    if (answer.findElement(By.tagName("button")).isEnabled()) {
                        Point point = answer.findElement(By.tagName("button")).getLocation();
                        answer.findElement(By.tagName("button")).getLocation().move(point.getX(), point.getY());
                        answer.findElement(By.tagName("button")).click();
                    }
                } else {
                    if (answer.findElement(By.tagName("input")).isEnabled()) {
                        Point point = answer.findElement(By.tagName("input")).getLocation();
                        answer.findElement(By.tagName("input")).getLocation().move(point.getX(), point.getY());
                        answer.findElement(By.tagName("input")).sendKeys(rows.get(0).getCell(columnNames.get(i)));
                    }
                }
            }
        }
    }

    private By getSectionWithChildHavingId() {
        return By.cssSelector(".concept-set-group.section-grid");
    }

    public void enterObservations(String template, Table data) {
        ObservationForm observationForm = new ObservationForm(expandObservationTemplate(template));
        observationForm.fillUp(data);
        storeObservationFormInSpecStore(observationForm);
    }

    public void navigateToDashboard() {
        dashboard.click();
    }

    public void selectSuggestion() {
        List<WebElement> elements = this.driver.findElements(By.cssSelector(".suggestion-item"));
        for (WebElement element : elements) {
            element.click();
            break;
        }
    }

    public void addMoreObservation() {
        addmore.click();

    }

    public void addChiefComplaints(String template, Table data) {
        new ObservationForm(expandObservationTemplate(template));
        List<TableRow> rows = data.getTableRows();
        List<String> columnNames = data.getColumnNames();
        int rowCount = 1;
        String value;
        for (TableRow row : rows) {
            value = row.getCell(columnNames.get(0));
            addmore.click();
            WebElement chiefComplaints = driver.findElement(By.xpath(("(.//*[contains(@id,'observation_')])[" + rowCount + "]")));
            chiefComplaints.sendKeys(value);
            driver.findElement(By.xpath("(.//*[contains(@id,'observation_')])[" + rowCount + "]/../div/button")).click();
            rowCount++;


        }
        save.click();
    }


    public void removeChiefComplaints(String template, Table data) {
        new ObservationForm(expandObservationTemplate(template));
        List<TableRow> rows = data.getTableRows();
        List<String> columnNames = data.getColumnNames();
        int rowSize=rows.size();
        String value;
        int rowCount;
        for (TableRow row : rows) {
            value = row.getCell(columnNames.get(0));
            for (rowCount = 1; rowCount <= rowSize; rowCount++) {
                WebElement element = driver.findElement(By.xpath(("(.//*[contains(@id,'observation_')])[" + rowCount + "]")));
                if (value.equals(element.getAttribute("value")) && (rowCount!=1)) {
                    driver.findElement(By.xpath(("(.//*[contains(@id,'removeClonedObs')])[" + rowCount + "]"))).click();
                }
            }
        }
        save.click();
    }

    public void uploadConsultationImageAndAddComment(String template, Table table) throws AWTException, IOException, InterruptedException {
        new ObservationForm(expandObservationTemplate(template));
        List<TableRow> rows = table.getTableRows();
        int rowCount = 1;
        for (TableRow row : rows) {
            String imageName = row.getCell("Image");
            waitForSpinnerOnDisplayControl();
            uploadFile((rowCount - 1), imageName);
            waitForSpinner();
            driver.findElement(By.xpath("(//textarea[contains(@class,'consultation-img-comments')])[" + rowCount + "]")).sendKeys(row.getCell("Comment"));
            rowCount++;
        }
        save.click();
        waitForSpinner();
    }

    public void removeImage(Integer imageNumber)
    {
        driver.findElement(By.xpath("(//button[contains(@class,'row-remover')])[" + imageNumber + "]")).click();
        save.click();
        waitForSpinner();
    }

    public void removeAdverseEffect(String template, Table data) {
        new ObservationForm(expandObservationTemplate(template));
        List<TableRow> row = data.getTableRows();
        String[] values = row.get(0).getCell("Adverse Effects").split(":");
        for (String value : values) {
            WebElement adverseEffect = driver.findElement(By.xpath("//span[text()='" + value + "']/../a"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", adverseEffect);
            Actions actions = new Actions(driver);
            actions.moveToElement(adverseEffect).click().perform();
        }
    }

    public void clickOnAddNewObsForm() {
        addNewObsForm.click();
    }

    public void clickOnSelectedObsForm(String selectedObsForm) {
        String parsedFormName = parseFormName(selectedObsForm);
        driver.findElement(By.id(parsedFormName)).click();
    }

    public void searchObsForm(String formName) {
        searchInput.sendKeys(formName);
    }

    public void enterValueToFirstInput(String value) {

        List<WebElement> allInput = formTemplate.findElements(By.cssSelector("input"));
        allInput.get(0).sendKeys(value);
    }

    public void clearValueToFirstInput() {
        List<WebElement> allInput = formTemplate.findElements(By.cssSelector("input"));

        String inputValue = allInput.get(0).getAttribute("value");
        for(int i = 0; i < inputValue.length(); i++) {
            allInput.get(0).sendKeys("\b");
        }
    }

    public Boolean getDisabledValue(String formName) {
        String parsedFormName = parseFormName(formName);
        return (driver.findElement(By.id(parsedFormName)).getAttribute("disabled").equals("true"));
    }

    public void createAndPublishFormByAPI(String formName, String formModelName, String conceptName) {
        Form form = new Form();
        form.setName(formName);
        Map<String, Object> formAttributes = new HashMap<>();
        formAttributes.put("name", form.getName());
        String formUUID = BahmniRestClient.get().createFormUsingAPI(("form_create.ftl"), formAttributes);
        formAttributes.put("uuid", formUUID);
        form.setUuid(formUUID);
        BahmniRestClient.get().saveFormUsingAPI(("form_" + formModelName + "_with_" + conceptName +"_save.ftl"), formAttributes);
        BahmniRestClient.get().publishFormUsingAPI(formAttributes);
        StoreHelper.store(Form.class, form);
    }

    public void enterObsGroup(String template, Table data) {
        WebElement element = driver.findElement(By.cssSelector(".form-builder-fieldset"));
        enterValue(template, data, element);
     }

    public void enterAll(String template, Table data) {
        WebElement element = expandObservationTemplate(template);
        enterValue(template, data, element);
    }

    private void enterValue(String template, Table data, WebElement element) {
        ObservationForm observationForm = new ObservationForm(expandObservationTemplate(template));
        observationForm.enterUp(data, element);
        storeObservationFormInSpecStore(observationForm);
    }

    public void clickOk() {
        ok.click();
    }

    public void clickAddNote() {
        List<WebElement> addNoteButtonList = driver.findElements(By.cssSelector(".form-builder-comment-toggle"));
        for (WebElement addNoteButton: addNoteButtonList) {
            addNoteButton.click();
        }
    }

    public void clickOnExpand() {
        expandAllButton.click();
    }

    public void clickOnCollapse() {
        collapseAllButton.click();
    }

    public WebElement findLabelByText(String controlName) {
        List<WebElement> allLabels = driver.findElements(By.cssSelector("label"));
        for(WebElement label : allLabels) {
            if (label.getText().equals(controlName)) {
                return label;
            }
        }
        return null;
    }

    public WebElement findStrongByText(String controlName) {
        List<WebElement> allStrong = driver.findElements(By.cssSelector("strong"));
        for(WebElement strong : allStrong) {
            if (strong.getText().equals(controlName)) {
                return strong;
            }
        }
        return null;
    }

    public void clickOnLabel(WebElement labelByText) {
        labelByText.click();
    }

    public void enterAllWithHideLabel(String template, Table data) {
        WebElement element = expandObservationTemplate(template);
        ObservationForm observationForm = new ObservationForm(expandObservationTemplate(template));
        observationForm.enterUpAll(data, element);
        storeObservationFormInSpecStore(observationForm);
    }

    public WebElement getLeftPane() {
        return leftPane;
    }

    private String parseFormName(String formName) {
        return formName.replace(" ", "_");
    }
}

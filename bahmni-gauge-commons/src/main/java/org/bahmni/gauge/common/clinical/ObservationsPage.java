package org.bahmni.gauge.common.clinical;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.domain.ObservationForm;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
import java.util.Objects;

public class ObservationsPage extends BahmniPage {

    @FindBy(how = How.CSS, using = "#template-control-panel-button")
    public WebElement addFormbutton;

    @FindBy(how = How.CSS, using = "button[id*=\"chief_complaint_data_addmore_observation\"]")
    public WebElement addmore;

    @FindBy(how = How.CSS, using = "#dashboard-link")
    public WebElement dashboard;

    @FindBy(how = How.CSS, using = ".leaf-observation-node")  //.dashboard-content
    public List<WebElement> observation_nodes;

    @FindBy(how = How.CSS, using = ".template-control-panel")
    public WebElement templatePanel;

    @FindBy(how = How.CSS, using = ".concept-set-title")
    public List<WebElement> observationTemplates;

    @FindBy(how = How.CSS, using = ".save-consultation")
    public WebElement save;

    @FindBy(how = How.XPATH, using = "//span[text()='Adverse Effects']/../../div//input")
    public WebElement adverseEffects;


    public void selectTemplate(String templateName) {
        clickTemplateButton();
        List<WebElement> allForms = templatePanel.findElements(By.tagName("button"));

        for (int i = 0; i < allForms.size(); i++) {
            String text = allForms.get(i).getText().replace(" ", "_"); //For debugging
            if (text.contains(templateName)) {
                allForms.get(i).click();
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
        addFormbutton.click();
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
            driver.findElement(By.xpath(("(.//*[contains(@id,'observation_')])[" + rowCount + "]"))).sendKeys(value);
            driver.findElement(By.xpath("(.//*[contains(@id,'observation_')])[" + rowCount + "]/../div/button")).click();
            rowCount++;
            addmore.click();

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
}

package org.bahmni.gauge.common.clinical;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.domain.ObservationForm;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;

public class ObservationsPage extends BahmniPage {
	
	@FindBy(how= How.CSS, using = "#template-control-panel-button")
    public WebElement addFormbutton;

    @FindBy(how= How.CSS, using = ".leaf-observation-node")  //.dashboard-content
    public List<WebElement> observation_nodes;
	
	@FindBy(how= How.CSS, using = ".template-control-panel")
    public WebElement templatePanel;

    public void selectTemplate(String templateName) {
        clickTemplateButton();

        List<WebElement> allForms = templatePanel.findElements(By.tagName("button"));
        templateName = templateName.replace(" ","_");
        for(int i=0;i<=allForms.size();i++){
            if(allForms.get(i).getText().toString().contains(templateName))
                allForms.get(i).click();
                break;
        }
    }

    public void clickTemplateButton(){
        addFormbutton.click();
    }

    public void fillTemplateData(Table table, ObservationForm form){

        WebElement observ_label = null;
        WebElement answer;
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();

        for(int i=0;i<=observation_nodes.size()-1 && i<= columnNames.size()-1;i++) {
            observ_label = observation_nodes.get(i).findElement(By.tagName("label"));
            if (observ_label.getText().contains(columnNames.get(i))) {
                answer = observation_nodes.get(i).findElement(By.cssSelector(".field-value"));
                if (answer.getText().length() != 0) {
                    if(answer.findElement(By.tagName("button")).isEnabled()) {    //answer.findElement(By.tagName("button")).isDisplayed()
                        Point point = answer.findElement(By.tagName("button")).getLocation();
                        answer.findElement(By.tagName("button")).getLocation().move(point.getX(),point.getY());
                        answer.findElement(By.tagName("button")).click(); }
                }
                else {
                    if(answer.findElement(By.tagName("input")).isEnabled()) {
                        Point point = answer.findElement(By.tagName("input")).getLocation();
                        answer.findElement(By.tagName("input")).getLocation().move(point.getX(),point.getY());
                        answer.findElement(By.tagName("input")).sendKeys(rows.get(i).getCell(columnNames.get(i)));
                    }
                }

            }
        }
    }
}

package org.bahmni.gauge.amman.clinical;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ObservationsPage extends org.bahmni.gauge.common.clinical.ObservationsPage {

    @FindBy(how= How.CSS, using = ".leaf-observation-node")
    public List<WebElement> observationNodes;

    @Override
    public void selectTemplate(String templateName) {
        clickTemplateButton();
        List<WebElement> allForms = templatePanel.findElements(By.tagName("button"));

        for (WebElement form: allForms){
            if (form.getText().contains(templateName)){
                form.click();
                break;
            }
        }
    }


    public void fillTemplateData(Table table){
        List<TableRow> rows = table.getTableRows();

        for (TableRow row: rows){
            boolean fieldFound = false;
            String fieldName = row.getCell("FIELD");
            String value = row.getCell("VALUE");
            for (WebElement observationNode: observationNodes) {
                String observLabel = observationNode.findElement(By.tagName("label")).getText();
                if (observLabel.contains(fieldName)){
                    fieldFound = true;
                    if (hasTag(observationNode, "input")){
                        observationNode.findElement(By.tagName("input")).sendKeys(value);
                    }
                    else if (hasTag(observationNode, "textarea")){
                        observationNode.findElement(By.tagName("textarea")).sendKeys(value);
                    }
                    else if (hasTag(observationNode, "select")){
                        new Select(observationNode.findElement(By.tagName("select"))).selectByVisibleText(value);
                    }
                    else if (hasTag(observationNode, "button")){
                       for(WebElement button: observationNode.findElements(By.tagName("button"))){
                           if (button.getText().contains(value)){
                               button.click();
                               break;
                           }
                       }
                    }

                }
            }
            if (!fieldFound){
                Assert.fail("Field "+ fieldName + " not found or disabled");}
        }

    }

    private boolean fieldEnabled(WebElement observationNode) {
        if (observationNode.getAttribute("disabled") == null){
            return true;
        }
        return false;
    }

    private boolean hasTag(WebElement answer, String input) {
        boolean val = true;
        try{
            answer.findElement(By.tagName(input));
        } catch (NoSuchElementException e){
            val =  false;
        }
        return  val;
    }
}

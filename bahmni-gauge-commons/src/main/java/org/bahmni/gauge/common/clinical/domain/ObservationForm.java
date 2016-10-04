package org.bahmni.gauge.common.clinical.domain;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.FormElement;
import org.bahmni.gauge.common.TestSpecException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dharmens on 8/1/16.
 */
public class ObservationForm {
    private final List<WebElement> observationNodes;

    public Map<String, String> getData() {
        return data;
    }

    private Map<String,String> data;
    public ObservationForm(WebElement observationForm) {
        observationNodes = observationForm.findElements(By.cssSelector(".leaf-observation-node"));
        data=new HashMap<>();

    }

    public ObservationForm() {
        observationNodes = null;
    }

    public void fillUp(Table table) {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        if (rows.size() != 1) {
            throw new TestSpecException("Only one observation row should be provided in the table");
        }
        TableRow row = rows.get(0);
        for (String header : columnNames) {
            String value = row.getCell(header);
            for (WebElement fieldset : observationNodes) {
                if(hasField(fieldset, header)){
                    getFieldType(fieldset).fillUp(fieldset,value);
                    data.put(header,value);
                }
            }
        }
    }

    private static FormElement getFieldType(WebElement fieldset) {
        for(FormElement type : FormElement.allTypes){
            if(hasChild(fieldset,type.getSelector())){
                return type;
            }
        }
        return FormElement.UNKNOWN;
    }

    private static boolean hasField(WebElement fieldset, String fieldName) {
        return fieldset.findElement(By.tagName("label")).getText().contains(fieldName);
    }

    private static boolean hasChild(WebElement parent, By childSelector) {
        try{
            return null != parent.findElement(childSelector);
        } catch (NoSuchElementException e){
            return false;
        }
    }
}

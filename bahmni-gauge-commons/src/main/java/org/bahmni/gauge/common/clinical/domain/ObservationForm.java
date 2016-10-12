package org.bahmni.gauge.common.clinical.domain;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.FormElement;
import org.bahmni.gauge.common.TestSpecException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import static org.bahmni.gauge.common.BahmniPage.hasChild;

public class ObservationForm {

    private List<WebElement> observationNodes;
    public Map<String, String> getData() {
        return data;
    }
    private Map<String,String> data=new HashMap<>();

    public ObservationForm(WebElement observationForm) {
        observationNodes = observationForm.findElements(By.cssSelector(".leaf-observation-node"));
    }

    public ObservationForm() {
        observationNodes = null;
    }


    public void fillUp(Table table) {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        if (rows.size() != 1) {
            throw new TestSpecException("Only one patient should be provided in the table");
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

}

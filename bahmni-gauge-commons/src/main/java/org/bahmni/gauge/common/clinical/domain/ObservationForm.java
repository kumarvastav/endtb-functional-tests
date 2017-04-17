package org.bahmni.gauge.common.clinical.domain;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.FormElement;
import org.bahmni.gauge.common.TestSpecException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.bahmni.gauge.common.BahmniPage.hasChild;

public class ObservationForm {

    private List<WebElement> observationNodes;
    private Map<String, String> data = new HashMap<>();

    public Map<String, String> getData() {
        return data;
    }


    public ObservationForm(WebElement observationForm) {
        observationNodes = observationForm.findElements(By.cssSelector(".leaf-observation-node"));
    }

    protected ObservationForm() {
        observationNodes = null;
    }


    public void fillUp(Table table) {
        enter(table, observationNodes);
    }

    public void enterUp(Table table, WebElement element) {
        List<WebElement> elementList = element.findElements(By.cssSelector(".form-builder-row"));
        elementList = filterElementList(elementList);
        enter(table, elementList);
    }

    public void enterUpAll(Table table, WebElement element) {
        List<WebElement> elementList = element.findElements(By.cssSelector(".form-builder-row"));
        elementList = filterElementList(elementList);
        enterHideLabel(table, elementList);
    }

    private List<WebElement> filterElementList(List<WebElement> elementList) {
        List<WebElement> listClone = new ArrayList<>(elementList);
        for(WebElement element : listClone) {
            if(element.findElements(By.cssSelector("label")).size() > 1) {
                elementList.remove(element);
            }
        }
        return elementList;
    }

    private void enter(Table table, List<WebElement> elementList) {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        if (rows.size() != 1) {
            throw new TestSpecException("Only one patient should be provided in the table");
        }
        TableRow row = rows.get(0);
        for (String label : columnNames) {
            String value = row.getCell(label);

            for (WebElement fieldset : elementList) {
                if (hasField(fieldset, label)) {
                    if (value.contains(":")) {
                        // This fills the form label which has combination of element type
                        // Issue: fills data for label which has similar partial text
                        String values[] = value.split(":");

                        List<FormElement> elements = getAllFieldType(fieldset);
                        int fieldCount = 0;
                        for (String val : values) {
                            if (val.equals(" ")) { // Skips if the empty value is provided
                                fieldCount++;
                                continue;
                            }
                            elements.get(fieldCount).fillUp(fieldset, val);
                            if (values.length == elements.size())
                                fieldCount++;
                                // This case failed in case of gynecology template, with has two sections of buttons
                            else {
                                break;
                            }
                        }

                    } else {
                        getFieldType(fieldset).fillUp(fieldset, value);
                        data.put(label, value);
                    }
                }
            }
        }
    }


    private static FormElement getFieldType(WebElement fieldset) {
        for (FormElement type : FormElement.allTypes) {
            if (hasChild(fieldset, type.getSelector())) {
                return type;
            }
        }

        return FormElement.UNKNOWN;
    }

    private static List<FormElement> getAllFieldType(WebElement fieldset) {
        return getAllFieldType(fieldset, 1);
    }

    private static List<FormElement> getAllFieldType(WebElement fieldset, int multipleLoopNum) {
        ArrayList<FormElement> types = new ArrayList<>();

        for (int i = 0; i < multipleLoopNum; i ++) {
            for (FormElement type : FormElement.allTypes) {
                if (hasChild(fieldset, type.getSelector())) {
                    types.add(type);
                }
            }
        }

        if (types.size() == 0)
            types.add(FormElement.UNKNOWN);
        return types;
    }

    private static boolean hasField(WebElement fieldset, String fieldName) {
        return fieldset.findElement(By.tagName("label")).getText().contains(fieldName);
    }

    private void enterHideLabel(Table table, List<WebElement> elementList){
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        if (rows.size() != 1) {
            throw new TestSpecException("Only one patient should be provided in the table");
        }
        TableRow row = rows.get(0);

        for (String label : columnNames) {
            String value = row.getCell(label);
            if(elementList.size() >= 1){
                for (WebElement fieldset : elementList) {
                    if(value.contains(":")){
                        String values[] = value.split(":");
                        List<FormElement> elements = getAllFieldType(fieldset, 2);
                        int num = 0;
                        for (String val : values) {
                            if(val.equals(" ")){
                                num++;
                                continue;
                            }

                            elements.get(num).fillUp(fieldset, val);
                            num++;
                        }
                    } else {
                        getFieldType(fieldset).fillUp(fieldset, value);
                    }

                    data.put(label, value);
                    elementList.remove(0);
                    break;
                }
            }
        }
    }
}

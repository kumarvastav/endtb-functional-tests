package org.bahmni.gauge.common.admin;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.TestSpecException;
import org.bahmni.gauge.common.admin.domain.OrderSet;
import org.bahmni.gauge.common.admin.domain.OrderSetMember;
import org.bahmni.gauge.common.program.domain.Program;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by atmaramn on 05/10/2016.
 */
public class OrderSetPage extends BahmniPage {
    @FindBy(how = How.CSS, using = "input[ng-model=\"orderSet.name\"]")
    public WebElement name;

    @FindBy(how = How.CSS, using = "input[ng-model=\"orderSet.description\"]")
    public WebElement description;

    @FindBy(how = How.CSS, using = "select[ng-model=\"orderSet.operator\"]")
    public WebElement operator;

    @FindBy(how = How.CSS, using = "button[type=\"submit\"]")
    public WebElement save;

    @FindBy(how= How.CSS, using = ".back-btn")
    public WebElement back;

    @FindBy(how = How.CSS, using = "input[value=\"Add New Members\"]")
    public WebElement addMemberButton;

    By locOrderType=By.cssSelector("select[ng-model=\"orderSetMember.orderType.uuid\"]");
    By locConcept = By.cssSelector("input[ng-model=\"orderSetMember.concept.display\"]");

    public OrderSet transformTableRowToOrderSet(TableRow row, List<String> columnNames) {
        String name = row.getCell(columnNames.get(0)) + new Random().nextInt();
        OrderSet orderSet = new OrderSet();
        OrderSet returnValue = (OrderSet)transform(row,orderSet,columnNames);
        returnValue.setName(name);
        return returnValue;
    }

    public OrderSetMember transformTableRowToOrderSetMember(TableRow row, List<String> columnNames) {
        String name = row.getCell(columnNames.get(0)) + new Random().nextInt();
        OrderSetMember orderSetMember = new OrderSetMember();
        OrderSetMember returnValue = (OrderSetMember) transform(row,orderSetMember,columnNames);
        return returnValue;
    }

    public OrderSet transformTableToOrderSet(Table table) {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();

        if (rows.size() != 1) {
            throw new TestSpecException("Only one patient should be provided in the table");
        }

        return transformTableRowToOrderSet(rows.get(0),columnNames);

    }



    public void enterDetails(OrderSet orderSet) {
        waitForSpinner();
        name.sendKeys(orderSet.getName());

        description.sendKeys(orderSet.getDescription());

        new Select(operator).selectByVisibleText(orderSet.getOperator());

        storeOrderSetInSpecStore(orderSet);
    }

    public List<OrderSetMember> transformTableToOrderSetMembers(Table table) {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();

        ArrayList members=new ArrayList();
        for(TableRow row:rows){
            OrderSetMember orderSetMember=transformTableRowToOrderSetMember(row,columnNames);
            members.add(orderSetMember);
        }
        return members;
    }

    public void enterMember(int index,OrderSetMember orderSetMember) {
        if(index>1)
            addMemberButton.click();

        List<WebElement> orderSetMembers=driver.findElements(By.cssSelector(".orderSetMember-wrapper .row"));

        WebElement root=orderSetMembers.get(index);

        if(orderSetMember.getOrderType()!=null) {
            //Order Type
            new Select(root.findElement(locOrderType)).selectByVisibleText(orderSetMember.getOrderType());
        }
        if(orderSetMember.getConceptName()!=null) {

            //Concept
            WebElement autoComplete = root.findElement(locConcept);
            autoComplete.sendKeys(orderSetMember.getConceptName());
            autoComplete.sendKeys(Keys.DOWN);
            waitForElementOnPage(By.xpath(".//a[text()=\"" + orderSetMember.getConceptName() + "\"]"));
            findElement(By.xpath(".//a[text()=\"" + orderSetMember.getConceptName() + "\"]")).click();
        }
        doActions(root,orderSetMember);

        getOrderSetInSpecStore().getOrderSetMembers().add(orderSetMember);
    }

    public void doActions(WebElement root,OrderSetMember orderSetMember){
        waitForElementOnPage(By.cssSelector("input[ng-model=\"orderSetMember.orderTemplate.drug.name\""));

        if(orderSetMember.getDrugName()!=null) {

            //Drug
            WebElement autoComplete = root.findElement(By.cssSelector("input[ng-model=\"orderSetMember.orderTemplate.drug.name\""));
            autoComplete.sendKeys(orderSetMember.getDrugName());
            autoComplete.sendKeys(Keys.DOWN);
            waitForElementOnPage(By.xpath(".//a[text()=\"" + orderSetMember.getDrugName() + "\"]"));
            findElement(By.xpath(".//a[text()=\"" + orderSetMember.getDrugName() + "\"]")).click();
        }

        if(orderSetMember.getDose()!=null)

            root.findElement(By.cssSelector("input[ng-model=\"orderSetMember.orderTemplate.dosingInstructions.dose\"]")).sendKeys(orderSetMember.getDose());
        if(orderSetMember.getDoseUnit()!=null)

            new Select(root.findElement(By.cssSelector("select[ng-model=\"orderSetMember.orderTemplate.dosingInstructions.doseUnits\"]"))).selectByVisibleText(orderSetMember.getDoseUnit());

        if(orderSetMember.getFrequency()!=null)

            new Select(root.findElement(By.cssSelector("select[ng-model=\"orderSetMember.orderTemplate.dosingInstructions.frequency\"]"))).selectByVisibleText(orderSetMember.getFrequency());

        if(orderSetMember.getInstruction()!=null)

            new Select(root.findElement(By.cssSelector("select[ng-model=\"orderSetMember.orderTemplate.administrationInstructions\"]"))).selectByVisibleText(orderSetMember.getInstruction());

        if(orderSetMember.getDurationUnit()!=null)

            new Select(root.findElement(By.cssSelector("select[ng-model=\"orderSetMember.orderTemplate.durationUnits\"]"))).selectByVisibleText(orderSetMember.getDurationUnit());

        if(orderSetMember.getRoute()!=null)

            new Select(root.findElement(By.cssSelector("select[ng-model=\"orderSetMember.orderTemplate.dosingInstructions.route\"]"))).selectByVisibleText(orderSetMember.getRoute());
//        if(orderSetMember.getDose()!=null)
//
//            root.findElement(By.cssSelector("input[ng-model=\"orderSetMember.orderTemplate.dosingInstructions.dose\"]")).sendKeys(orderSetMember.getDose());
        if(orderSetMember.getDuration()!=null)

            root.findElement(By.cssSelector("input[ng-model=\"orderSetMember.orderTemplate.duration\"]")).sendKeys(orderSetMember.getDuration());
        if(orderSetMember.getAdditionalInstructions()!=null)

            root.findElement(By.cssSelector("textarea[ng-model=\"orderSetMember.orderTemplate.additionalInstructions\"]")).sendKeys(orderSetMember.getAdditionalInstructions());




    }

    public void clickSave(){
        save.click();
        waitForSpinner();
    }

    public void back() {
        back.click();
    }
}

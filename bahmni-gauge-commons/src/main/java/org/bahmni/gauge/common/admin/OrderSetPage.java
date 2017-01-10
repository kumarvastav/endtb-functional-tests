package org.bahmni.gauge.common.admin;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.admin.domain.OrderSet;
import org.bahmni.gauge.common.admin.domain.OrderSetMember;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.bahmni.gauge.util.TableTransformer;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

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
    By locDrugName = By.cssSelector("input[ng-model=\"orderSetMember.orderTemplate.drug.name\"");
    By locDose = By.cssSelector("input[ng-model=\"orderSetMember.orderTemplate.dosingInstructions.dose\"]");
    By locDoseUnit = By.cssSelector("select[ng-model=\"orderSetMember.orderTemplate.dosingInstructions.doseUnits\"]");
    By locFrequency = By.cssSelector("select[ng-model=\"orderSetMember.orderTemplate.dosingInstructions.frequency\"]");
    By locInstruction = By.cssSelector("select[ng-model=\"orderSetMember.orderTemplate.administrationInstructions\"]");
    By locDuration = By.cssSelector("input[ng-model=\"orderSetMember.orderTemplate.duration\"]");
    By locDurationUnit = By.cssSelector("select[ng-model=\"orderSetMember.orderTemplate.durationUnits\"]");
    By locRoute = By.cssSelector("select[ng-model=\"orderSetMember.orderTemplate.dosingInstructions.route\"]");
    By locAdditionalInstructions = By.cssSelector("textarea[ng-model=\"orderSetMember.orderTemplate.additionalInstructions\"]");

    public OrderSet transformTableRowToOrderSet(TableRow row, List<String> columnNames) {
        String name = row.getCell(columnNames.get(0)) + new Random().nextInt();
        OrderSet orderSet = new OrderSet();

        OrderSet returnValue = (OrderSet)transform(row,orderSet,columnNames);
        returnValue.setName(name);
        return returnValue;
    }

    public OrderSetMember transformTableRowToOrderSetMember(TableRow row, List<String> columnNames) {
        OrderSetMember orderSetMember = new OrderSetMember();
        OrderSetMember returnValue = (OrderSetMember) transform(row,orderSetMember,columnNames);
        return returnValue;
    }

    public OrderSet transformTableToOrderSet(Table table) {
        return TableTransformer.asEntity(table,OrderSet.class);
    }



    public void enterDetails(OrderSet orderSet) {
        name.clear();
        name.sendKeys(orderSet.getName());

        description.clear();
        description.sendKeys(orderSet.getDescription());

        new Select(operator).selectByVisibleText(orderSet.getOperator());

        storeOrderSetInSpecStore(orderSet);
    }

    public List<OrderSetMember> transformTableToOrderSetMembers(Table table) {
        return TableTransformer.asEntityList(table,OrderSetMember.class);
    }

    public void enterMember(int index,OrderSetMember orderSetMember) {
        if(index+1>driver.findElements(By.cssSelector(".orderSetMember-wrapper .row")).size())
            addMemberButton.click();
        waitForElementOnPage(By.cssSelector(".orderSetMember-wrapper .row"));
        List<WebElement> orderSetMembers=driver.findElements(By.cssSelector(".orderSetMember-wrapper .row"));

        WebElement root=orderSetMembers.get(index);

        if(orderSetMember.getOrderType()!=null) {
            //Order Type
            new Select(root.findElement(locOrderType)).selectByVisibleText(orderSetMember.getOrderType());
        }
        if(orderSetMember.getConceptName()!=null) {

            //Concept
            WebElement autoComplete = root.findElement(locConcept);
            autoComplete.clear();
            autoComplete.sendKeys(orderSetMember.getConceptName());
            autoComplete.sendKeys(Keys.DOWN);
            waitForElementOnPage(By.xpath(".//a[text()=\"" + orderSetMember.getConceptName() + "\"]"));
            findElement(By.xpath(".//a[text()=\"" + orderSetMember.getConceptName() + "\"]")).click();
        }
        doActions(root,orderSetMember);

    }

    public void doActions(WebElement root,OrderSetMember orderSetMember){
        waitForElementOnPage(locDrugName);

        if(orderSetMember.getDrugName()!=null) {

            //Drug
            WebElement autoComplete = root.findElement(locDrugName);
            autoComplete.clear();
            autoComplete.sendKeys(orderSetMember.getDrugName());
            autoComplete.sendKeys(Keys.DOWN);
            waitForElementOnPage(By.xpath(".//a[text()=\"" + orderSetMember.getDrugName() + "\"]"));
            findElement(By.xpath(".//a[text()=\"" + orderSetMember.getDrugName() + "\"]")).click();
        }

        if(orderSetMember.getDose()!=null) {
            WebElement element =
                    root.findElement(locDose);
            element.clear();
            element.sendKeys(orderSetMember.getDose());
        }
        if(orderSetMember.getDoseUnit()!=null)

            new Select(root.findElement(locDoseUnit)).selectByVisibleText(orderSetMember.getDoseUnit());

        if(orderSetMember.getFrequency()!=null)

            new Select(root.findElement(locFrequency)).selectByVisibleText(orderSetMember.getFrequency());

        if(orderSetMember.getInstruction()!=null)

            new Select(root.findElement(locInstruction)).selectByVisibleText(orderSetMember.getInstruction());

        if(orderSetMember.getDurationUnit()!=null)

            new Select(root.findElement(locDurationUnit)).selectByVisibleText(orderSetMember.getDurationUnit());

        if(orderSetMember.getRoute()!=null)

            new Select(root.findElement(locRoute)).selectByVisibleText(orderSetMember.getRoute());

        if(orderSetMember.getDuration()!=null) {
            WebElement element =
                    root.findElement(locDuration);
            element.clear();
            element.sendKeys(orderSetMember.getDuration());
        }
        if(orderSetMember.getAdditionalInstructions()!=null) {
            WebElement element =
                    root.findElement(locAdditionalInstructions);
            element.clear();
            element.sendKeys(orderSetMember.getAdditionalInstructions());
        }




    }

    public void clickSave(){
        save.click();
    }

    public void back() {
        back.click();
    }

    public void createOrderSetUsingApi(OrderSet orderSet) {
        //BahmniRestClient.get().createOrderSet(orderSet,"orderset_create.ftl");
        BahmniRestClient.get().createOrderSet(orderSet);
        storeOrderSetInSpecStore(orderSet);
    }

    public void editOrderSet(OrderSet orderSet) {
        enterDetails(orderSet);
        int i=0;
        for(OrderSetMember member: orderSet.getOrderSetMembers()){
            enterMember(i++,member);
        }
    }

    public void verifyOrderSet(OrderSet orderSet) {
        Assert.assertEquals("Name is not matching",orderSet.getName(),name.getAttribute("value"));

        Assert.assertEquals("Description is not matching",orderSet.getDescription(),description.getAttribute("value"));

        Assert.assertEquals("operator is not matching",orderSet.getOperator(),new Select(operator).getFirstSelectedOption().getText());
        int i=0;
        List<WebElement> elements=driver.findElements(By.cssSelector(".orderSetMember-wrapper .row"));
        for(OrderSetMember member:orderSet.getOrderSetMembers()){
            verifyMember(elements.get(i++),member);
        }
    }

    public void verifyMember(WebElement root,OrderSetMember member){
        Assert.assertEquals("Order Type is not matching",member.getOrderType(),new Select(root.findElement(locOrderType)).getFirstSelectedOption().getText());

        Assert.assertEquals("Concepy Name is not matching",member.getConceptName(),root.findElement(locConcept).getAttribute("value"));

        Assert.assertEquals("Drug Name is not matching",member.getDrugName(),root.findElement(locDrugName).getAttribute("value"));

        Assert.assertEquals("Dose is not matching",member.getDose(),root.findElement(locDose).getAttribute("value"));

        Assert.assertEquals("Dose Unit is not matching",member.getDoseUnit(),new Select(root.findElement(locDoseUnit)).getFirstSelectedOption().getText());

        Assert.assertEquals("Frequency is not matching",member.getFrequency(),new Select(root.findElement(locFrequency)).getFirstSelectedOption().getText());

        Assert.assertEquals("Instructions is not matching",member.getInstruction(),new Select(root.findElement(locInstruction)).getFirstSelectedOption().getText());

        Assert.assertEquals("Duration is not matching",member.getDuration(),root.findElement(locDuration).getAttribute("value"));

        Assert.assertEquals("Duration Unit is not matching",member.getDurationUnit(),new Select(root.findElement(locDurationUnit)).getFirstSelectedOption().getText());

        Assert.assertEquals("Route is not matching",member.getRoute(),new Select(root.findElement(locRoute)).getFirstSelectedOption().getText());

        Assert.assertEquals("Additional Instructions is not matching",member.getAdditionalInstructions(),root.findElement(locAdditionalInstructions).getAttribute("value"));

    }
}

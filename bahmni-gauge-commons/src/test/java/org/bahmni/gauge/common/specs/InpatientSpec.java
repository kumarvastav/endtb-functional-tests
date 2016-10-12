package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.DispositionPage;
import org.bahmni.gauge.common.inpatient.BedAssignmentPage;
import org.bahmni.gauge.common.inpatient.InpatientDashboard;
import org.bahmni.gauge.common.inpatient.InpatientHeader;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InpatientSpec {
    private final WebDriver driver;

    public InpatientSpec() {
        this.driver = DriverFactory.getDriver();
    }

    @BeforeClassSteps
    public void waitForAppReady() {
        BahmniPage.waitForSpinner(driver);
    }

    @Step("Select <movement> from Patient Movement and click <Action> button")
    public void movePatient(String movement,String action){
        DispositionPage disposition = PageFactory.get(DispositionPage.class);
        disposition.captureDataForDisposition(movement);
        InpatientDashboard dashboardPage = PageFactory.get(InpatientDashboard.class);
        WebElement actionElement = dashboardPage.findButtonByText(action);
        actionElement.click();
    }

    @Step("Assign an empty bed")
    public void assignBed(){
        BedAssignmentPage bedAssignmentPage = PageFactory.get(BedAssignmentPage.class);
        try {
            bedAssignmentPage.assignAnEmptyBed();
        } catch (Exception e){
            Assert.assertNull(e.getMessage(),e);
        }
    }

    @Step("Navigate to Inpatient Dashboard")
    public void gotoInpatientDashboard(){
        InpatientHeader inpatientHeader = PageFactory.get(InpatientHeader.class);
        inpatientHeader.gotoIpdDashboard();
        waitForAppReady();
    }

    @Step("Ensure inpatient icon exists on Patient Profile display control")
    public void ensureAdmission(){
        InpatientDashboard dashboardPage = PageFactory.get(InpatientDashboard.class);
        Assert.assertTrue("inpatient icon doesn't exist", dashboardPage.isAdmitted());
    }

    @Step("Verify display control <displayControlName> on inpatient dashboard, has the following details <table>")
    public void verifyDisplayControlContent(String displayControlName, Table table) {
        InpatientDashboard dashboardPage = PageFactory.get(InpatientDashboard.class);
        String displayControlText = dashboardPage.getDisplayControlText(displayControlName);
        for (String drugOrder : table.getColumnValues("details")) {
            drugOrder = putTime(drugOrder);
            Assert.assertTrue(stringDoesNotExist(drugOrder),displayControlText.contains(drugOrder));
        }
    }

    private static String stringDoesNotExist(String content){
        return "String `"+content+"` does not exist";
    }

    /*
    *   date format: <NOW[simpleDateFormat]>
    *   example: <NOW[dd-MM-yy]>
    *   result: 31-12-95
    *   putTime("Date Of Obs: <NOW[dd-MM-yy hh:mm a]>") will give "Date Of Obs: 31-12-95 09:30 PM"
    */
    private static String putTime(String content){
        String pattern = "<NOW\\[(.*)\\]>";
        Matcher matcher = Pattern.compile(".*"+pattern+".*").matcher(content);
        String dateFormat = "dd-MM-yy";
        while(matcher.find()){
            dateFormat = matcher.group(1);
        }
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        return content.replaceAll(pattern,formatter.format(new Date()));
    }
}

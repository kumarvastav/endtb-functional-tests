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
import org.bahmni.gauge.data.StoreHelper;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.bahmni.gauge.util.StringUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InpatientSpec extends BaseSpec{
    private final String BED_ASSIGN_FAILURE = "Bed assignment failed.";
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
        if(movement.toLowerCase().contains("admit") || movement.toLowerCase().contains("undo discharge"))
            dashboardPage.getPatientFromSpecStore().setAdmitted(true);
        else if(movement.toLowerCase().contains("discharge")){
            dashboardPage.getPatientFromSpecStore().setAdmitted(false);
        }
    }

    @Step("Select <movement> from Patient Movement and click <Action> button with notes <Notes>")
    public void movePatientWithNotes(String movement,String action,String notes){
        DispositionPage disposition = PageFactory.get(DispositionPage.class);
        disposition.captureDataForDisposition(movement);
        InpatientDashboard dashboardPage = PageFactory.get(InpatientDashboard.class);
        dashboardPage.findElement(By.cssSelector("[ng-model=\"observation.value\"]")).sendKeys(notes);
        WebElement actionElement = dashboardPage.findButtonByText(action);
        actionElement.click();
        if(movement.toLowerCase().contains("admit") || movement.toLowerCase().contains("undo discharge"))
            dashboardPage.getPatientFromSpecStore().setAdmitted(true);
        else if(movement.toLowerCase().contains("discharge")){
            dashboardPage.getPatientFromSpecStore().setAdmitted(false);
            StoreHelper.getAppGlobal().setBedCount(StoreHelper.getAppGlobal().getBedCount() - 1);
        }
    }

    @Step("Assign an empty bed")
    public void assignBed(){
        BedAssignmentPage bedAssignmentPage = PageFactory.get(BedAssignmentPage.class);
        Boolean assignmentStatus = bedAssignmentPage.assignAnEmptyBed();
        Assert.assertTrue(BED_ASSIGN_FAILURE,assignmentStatus);
        StoreHelper.getAppGlobal().setBedCount(StoreHelper.getAppGlobal().getBedCount() - 1);
    }

    @Step("Navigate to Inpatient Dashboard")
    public void gotoInpatientDashboard(){
        InpatientHeader inpatientHeader = PageFactory.get(InpatientHeader.class);
        inpatientHeader.gotoIpdDashboard();
        waitForAppReady();
    }

    @Step("Navigate to inpatient search page")
    public void gotoInpatientSearchPage(){
        InpatientHeader inpatientHeader = PageFactory.get(InpatientHeader.class);
        inpatientHeader.gotoIpdSearchPage();
        waitForAppReady();
    }

    @Step("Ensure inpatient icon exists on Patient Profile display control")
    public void ensureAdmitted(){
        InpatientDashboard dashboardPage = PageFactory.get(InpatientDashboard.class);
        Assert.assertTrue("inpatient icon doesn't exist", dashboardPage.isAdmitted());
    }

    @Step("Verify display control <displayControlId> on inpatient dashboard, has the following details <table>")
    public void verifyDisplayControlContent(String displayControlId, Table table) {
        InpatientDashboard dashboardPage = PageFactory.get(InpatientDashboard.class);
        String displayControlText = dashboardPage.getDisplayControlText(displayControlId);
        for (String drugOrder : table.getColumnValues("details")) {
            drugOrder = StringUtil.transformPatternToData(drugOrder);
            Assert.assertTrue(StringUtil.stringDoesNotExist(drugOrder, displayControlText),displayControlText.contains(drugOrder));
        }
    }

    @Step("Verify display control with Caption <displayControlCaption> on inpatient dashboard, has the following details <table>")
    public void verifyDisplayControlContentWithCaption(String displayControlCaption, Table table) {
        InpatientDashboard dashboardPage = PageFactory.get(InpatientDashboard.class);
        String displayControlText = dashboardPage.getDisplayControlTextWitCaption(displayControlCaption);
        for (String drugOrder : table.getColumnValues("details")) {
            drugOrder = StringUtil.transformPatternToData(drugOrder);
            Assert.assertTrue(stringDoesNotExist(drugOrder),displayControlText.contains(drugOrder));
        }
    }

    @Step("Ensure inpatient icon does not exist on Patient Profile display control")
    public void ensureNotAdmitted(){
        InpatientDashboard dashboardPage = PageFactory.get(InpatientDashboard.class);
        Assert.assertFalse("inpatient icon exists", dashboardPage.isAdmitted());
    }

    @Step("Verify only <option> option is displayed in Patient Movement")
    public void verifyOptions(String option){
        DispositionPage disposition = PageFactory.get(DispositionPage.class);
        disposition.verifyOptionCount(1);
        disposition.verifyOptions(option);
    }

    @Step("Click on <buttonText> button")
    public void clickButton(String buttonText){
        DispositionPage disposition = PageFactory.get(DispositionPage.class);
        if(disposition.findButtonByText(buttonText).isDisplayed())
            disposition.findButtonByText(buttonText).click();
        waitForAppReady();
    }

    @Step("Admit the patient through api")
    public void admitPatient(){
        DispositionPage disposition = PageFactory.get(DispositionPage.class);
        BahmniRestClient.get().postBahmniEncounter(disposition.getPatientFromSpecStore(),"admit_patient.ftl");
        disposition.getPatientFromSpecStore().setAdmitted(true);
    }

    @Step("Discharge the patient through api")
    public void dischargePatient(){
        DispositionPage disposition = PageFactory.get(DispositionPage.class);
        BahmniRestClient.get().dischargePatient(disposition.getPatientFromSpecStore().getUuid());
    }

    @Step("Click on <linkText> link")
    public void clickLinkText(String linkText){
        DispositionPage disposition = PageFactory.get(DispositionPage.class);
        if(disposition.findElementByText("a",linkText).isDisplayed()) {
            disposition.findElementByText("a", linkText).click();
            disposition.switchToLatestTab();
        }
    }

}

package org.bahmni.gauge.common.program;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.TestSpecException;
import org.bahmni.gauge.common.program.domain.PatientProgram;
import org.bahmni.gauge.common.program.domain.Program;
import org.bahmni.gauge.util.TableTransformer;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static org.openqa.selenium.By.*;

public class ProgramManagementPage extends BahmniPage {

    @FindBy(how = How.CSS, using = "select.ng-pristine")
    public WebElement program;

    @FindBy(how = How.CSS, using = ".fa-plus-square")
    public WebElement btnPlus;

    @FindBy(how = How.CSS, using = "input.ng-valid-max")
    public WebElement start_date;

    @FindBy(how = How.XPATH, using = "//input[@value='Enroll' and @type='submit']")
    public WebElement btnEnroll;

    @FindBy(how = How.CSS, using = ".active-program-tiles")
    public List<WebElement> allActivePrograms;

    @FindBy(how = How.CSS, using = ".inactive-program-tiles")
    public List<WebElement> allInactivePrograms;

    @FindBy(how = How.CSS, using = ".inactive-program-tiles")
    public List<WebElement> inactive_progs;

    @FindBy(how = How.CSS, using = "[ng-model='patientProgram.outcomeData']")
    public WebElement treatment_status;

    @FindBy(how = How.CSS, using = "#dashboard-link")
    public List<WebElement> treatment_dashboard;

    @FindBy(how = How.CSS, using = ".active-program-container")
    public WebElement activeProgramContainer;

    @FindBy(how = How.CSS, using = ".inactive-program-container")
    public WebElement inactiveProgramContainer;

    @FindBy(how = How.CSS, using = "[id='Facility Name']")
    public WebElement facility_name;

    @FindBy(how = How.CSS, using = "[id='Sample attribute3']")
    public WebElement facility_id;

    @FindBy(how = How.CSS, using = "#Doctor")
    public WebElement doctor;

    @FindBy(how = How.CSS, using = "#Id_Number")
    public WebElement registration_id;

    public ProgramManagementPage enrollPatientToProgram(Program treatment) {
        doActions(treatment);
        btnEnroll.click();
        return this;
    }

    protected void doActions(Program treatment) {
        btnPlus.click();
        new Select(program).selectByVisibleText(treatment.getName());
        start_date.sendKeys(treatment.getDateOfRegistration());
    }

    public void modifyProgramEnrollment(Program treatment) {

        WebElement programToModify = findProgram(treatment.getName());
        programToModify.findElement(cssSelector("[value='Edit']")).click();
        doModifyEnrollmentDetails(programToModify, treatment);
        programToModify.findElement(cssSelector("[value='Save']")).click();
    }

    protected void doModifyEnrollmentDetails(WebElement programToModify, Program treatment) {

        if (treatment.getTreatmentStatus() != null) {
            WebElement outcome = programToModify.findElement(cssSelector("[ng-model='patientProgram.outcomeData']"));
            new Select(outcome).selectByVisibleText(treatment.getTreatmentStatus());
        }

        //TODO: Write modification for DateOfRegistration
    }

    public WebElement findProgram(String programName) {
        for (WebElement allActiveProgram : allActivePrograms) {
            if (allActiveProgram.getText().contains(programName)) {
                return allActiveProgram;
            }
        }
        throw new TestSpecException("The program with name [" + programName + "] doesn't exist");
    }
    public WebElement findInactiveProgram(String programName) {
        for (WebElement allInactiveProgram : allInactivePrograms) {
            if (allInactiveProgram.getText().contains(programName)) {
                return allInactiveProgram;
            }
        }
        throw new TestSpecException("The program with name [" + programName + "] doesn't exist");
    }
    public void clickTreatmentDashboard(PatientProgram patientProgram) {
        clickTreatmentDashboard(patientProgram.getProgram().getName());
    }

    public void clickTreatmentDashboard(Program program) {
        clickTreatmentDashboard(program.getName());
    }

    public void clickTreatmentDashboard(String program){
        WebElement programWidget = findProgram(program);
        waitForElementOnPage(programWidget);
        programWidget.findElement(id("dashboard-link")).click();
    }

    public boolean isPatientEnrolledToProgram(Program treatment) {
        waitForElementOnPage(cssSelector(".programName"));
        WebElement programName = activeProgramContainer.findElement(cssSelector(".programName"));
        if(isProgramAvailable(treatment, programName)){
            return isStartDateProper(treatment) && isTreatmentDateProper(treatment) && isPatientStageProper(treatment) && isProgramStateProper(treatment);

        }
        return false;

    }
    private boolean isStartDateProper(Program treatment){
        if (treatment.getDateOfRegistration()!=null){
            WebElement actualStartDate=activeProgramContainer.findElement(cssSelector(".ProgramEnrollInfo>.form-field .field-value span"));//xpath(".//*[contains(text(),'Start Date')]//parent::*/parent::*/descendant::*[@class='field-value']/span"));
            Date actualDate= null;
            try {
                actualDate = (new SimpleDateFormat("dd MMM yy")).parse(actualStartDate.getText());
                actualDate.setTime(0);
                Date expectedDate=(new SimpleDateFormat("dd/MM/yyyy HH:mm:ssZ")).parse(treatment.getDateOfRegistration()+(new SimpleDateFormat(" HH:mm:ssZ").format(new Date())));
                expectedDate.setTime(0);
                Assert.assertEquals("Date dont match",actualDate,expectedDate);
                if(actualDate.equals(expectedDate))
                    return true;
                else
                    return false;

            } catch (ParseException e) {
                e.printStackTrace();
                return false;
            }

        }
        return false;
    }
    private boolean isTreatmentDateProper(Program treatment){
        if (treatment.getTreatmentDate()!=null){
            WebElement actualTreatmentDate=activeProgramContainer.findElement(xpath(".//*[contains(text(),'Treatment Date')]/parent::*/parent::*/descendant::*[@class='field-value']/span"));
            Date actualDate= null;
            try {
                actualDate = (new SimpleDateFormat("dd MMM yy")).parse(actualTreatmentDate.getText());
                actualDate.setTime(0);
                Date expectedDate=(new SimpleDateFormat("dd/MM/yyyy")).parse(treatment.getTreatmentDate()+(new SimpleDateFormat(" HH:mm:ssZ").format(new Date())));
                expectedDate.setTime(0);
                Assert.assertEquals("Date dont match",actualDate,expectedDate);
                if(actualDate.equals(expectedDate))
                    return true;
                else
                    return false;

            } catch (ParseException e) {
                e.printStackTrace();
                return false;
            }

        }
        return true;
    }

    private boolean isPatientStageProper(Program treatment){
        if (treatment.getPatientStatus()!=null){
            WebElement actualPatientStage=activeProgramContainer.findElement(xpath(".//*[contains(text(),'Patient Stage')]/parent::*/parent::*/descendant::*[@class='field-value']/span"));
            return actualPatientStage.getText().trim().equals(treatment.getPatientStatus());

        }
        return true;
    }

    private boolean isProgramStateProper(Program treatment){
        if (treatment.getTreatmentStatus()!=null){
            WebElement actualPatientStage=activeProgramContainer.findElement(cssSelector(".program-state-container span"));
            return actualPatientStage.getText().trim().equals(treatment.getPatientStatus());

        }
        return true;
    }

    private boolean isProgramAvailable(Program enrolledProgram, WebElement programName) {
        return programName != null && programName.getText().equals(enrolledProgram.getName());
    }
    @Deprecated
    public Program transformTableToProgram(Table table) {
        return TableTransformer.asEntity(table,Program.class);
    }



    public void editProgramAttributes(Program treatment, String registration, String facility) {
        WebElement programToModify = findProgram(treatment.getName());
        programToModify.findElement(cssSelector("[value='Edit']")).click();
        editProgram(registration, facility);
        programToModify.findElement(cssSelector("[value='Save']")).click();
    }

    public void endProgram(Program treatment) {
        WebElement programToModify = findProgram(treatment.getName());
        programToModify.findElement(cssSelector("[value='Edit']")).click();
        WebElement outcome = programToModify.findElement(cssSelector("[ng-model='patientProgram.outcomeData']"));
        new Select(outcome).selectByVisibleText(treatment.getTreatmentStatus());
        programToModify.findElement(cssSelector("[value='Save']")).click();
        treatment.setProgramStopDate(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));

    }

    public ProgramManagementPage editProgram(String registration, String facility) {
        facility_name.sendKeys(facility);
        registration_id.sendKeys(registration);
        return this;
    }
    @Deprecated
    public Program transformTableRowToProgram(TableRow row, List<String> columnNames) throws Exception {
        String registration = row.getCell(columnNames.get(1)) + new Random().nextInt();
        Program program = new Program(row.getCell(columnNames.get(0)), registration);
        return (Program)transform(row,program,columnNames);
    }

    public void deleteProgram(WebElement program) {
        program.findElement(cssSelector("[id=\"delete_btn\"]")).click();
        program.findElement(cssSelector("[ng-model=\"patientProgram.voidReason\"]")).sendKeys("Deleting the program");
        program.findElement(cssSelector("[value=\"Delete\"]")).click();
        WebElement deletePopup = waitForElementOnPage(".delete-program-popup");
        WebElement deleteButton = deletePopup.findElement(cssSelector("[id=\"delete\"]"));
        deleteButton.click();
    }

    public ProgramManagementPage editProgram(Program targetProgram,Program programData){
        WebElement weProgram=findProgram(targetProgram.getName());
        weProgram.findElement(cssSelector("input[value='Edit']")).click();
        if(programData.getDateOfRegistration()!=null) {
            weProgram.findElement(cssSelector("[ng-model=\"patientProgram.dateEnrolled\"]")).sendKeys(programData.getDateOfRegistration());
            targetProgram.setDateOfRegistration(programData.getDateOfRegistration());}

        if(programData.getTreatmentDate()!=null) {
            weProgram.findElement(id("Date")).sendKeys(programData.getTreatmentDate());
            targetProgram.setTreatmentDate(programData.getTreatmentDate());}
        if(programData.getPatientStatus()!=null) {
            (new Select(weProgram.findElement(cssSelector("select[id='Stage']")))).selectByVisibleText(programData.getPatientStatus());
            targetProgram.setPatientStatus(programData.getPatientStatus());
        }
        if(programData.getProgramStatus()!=null)
        {
            (new Select(weProgram.findElement(cssSelector("select[ng-model='programEdited.selectedState']")))).selectByVisibleText(programData.getProgramStatus());
            targetProgram.setProgramStatus(programData.getProgramStatus());
        }
        weProgram.findElement(cssSelector("input[value='Save']")).click();

        return this;

    }

    public void verifyProgramStopped(Program program) {
        WebElement weProgram=findInactiveProgram(program.getName());
        WebElement weProgramOutcome= weProgram.findElement(xpath(".//label[contains(text(),'Program Outcome:')]/parent::*/following-sibling::*/span"));
        WebElement weStartDate= weProgram.findElement(xpath(".//label[contains(text(),'Start Date:')]/parent::*/following-sibling::*/span"));
        WebElement weStopDate= weProgram.findElement(xpath(".//label[contains(text(),'Stop Date:')]/parent::*/following-sibling::*/span"));

        Assert.assertNotNull("Program not found in Inactive programs",weProgram);
        Assert.assertEquals(weProgramOutcome.getText(),program.getTreatmentStatus());
        try {
            Assert.assertEquals(new SimpleDateFormat("dd MMM yy").parse(weStartDate.getText()),new SimpleDateFormat("dd/MM/yyyy").parse(program.getDateOfRegistration()));
            Assert.assertEquals(new SimpleDateFormat("dd MMM yy").parse(weStopDate.getText()),new SimpleDateFormat("dd/MM/yyyy").parse(program.getProgramStopDate()));
        } catch (ParseException e) {
            Assert.fail("Date formats are not correct");
            e.printStackTrace();
        }
        Assert.assertFalse("Edit link visible", hasChild(weProgram,cssSelector("[value=\"Edit\"]")));
    }
}

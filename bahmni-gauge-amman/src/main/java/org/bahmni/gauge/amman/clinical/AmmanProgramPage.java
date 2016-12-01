package org.bahmni.gauge.amman.clinical;

import org.bahmni.gauge.common.program.ProgramManagementPage;
import org.bahmni.gauge.common.program.domain.Program;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

/**
 * Created by swarup on 10/27/16.
 */
public class AmmanProgramPage extends ProgramManagementPage {
    @FindBy(how= How.CSS, using = "select[ng-model='$parent.workflowStateSelected']")
    public WebElement programState;


    public void enrollToProgram(Program program) {
        super.doActions(program);
        new Select(programState).selectByVisibleText(program.getProgramStatus());
        btnEnroll.click();
    }

    public void editProgram(String programName, Program updatedProgram) {
        WebElement weProgram = findProgram(programName);
        weProgram.findElement(cssSelector("input[value='Edit']")).click();
        if (updatedProgram.getDateOfRegistration() != null) {
            weProgram.findElement(cssSelector("[ng-model=\"patientProgram.dateEnrolled\"]")).sendKeys(updatedProgram.getDateOfRegistration());
        }
        if (updatedProgram.getTreatmentDate() != null) {
            weProgram.findElement(id("Date")).sendKeys(updatedProgram.getTreatmentDate());
        }
        if (updatedProgram.getPatientStatus() != null) {
            (new Select(weProgram.findElement(cssSelector("select[id='Stage']")))).selectByVisibleText(updatedProgram.getPatientStatus());
        }
        if (updatedProgram.getProgramStatus() != null) {
            (new Select(weProgram.findElement(cssSelector("select[ng-model='patientProgram.selectedState']")))).selectByVisibleText(updatedProgram.getProgramStatus());
        }

        weProgram.findElement(cssSelector("input[value='Save']")).click();
    }
}

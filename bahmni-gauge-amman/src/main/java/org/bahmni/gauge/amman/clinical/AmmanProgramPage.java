package org.bahmni.gauge.amman.clinical;

import org.bahmni.gauge.common.program.ProgramManagementPage;
import org.bahmni.gauge.common.program.domain.Program;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

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
}

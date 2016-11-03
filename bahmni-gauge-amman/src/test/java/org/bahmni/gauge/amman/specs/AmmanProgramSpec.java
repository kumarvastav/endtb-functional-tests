package org.bahmni.gauge.amman.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.amman.clinical.AmmanProgramPage;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.program.ProgramManagementPage;
import org.bahmni.gauge.common.program.domain.Program;
import org.bahmni.gauge.util.TableTransformer;

/**
 * Created by swarup on 10/27/16.
 */
public class AmmanProgramSpec {
    @BeforeClassSteps
    public void waitForAppReady() {
        BahmniPage.waitForSpinner(DriverFactory.getDriver());
    }

    @Step("Register the patient to following program <programDetails>")
    public void enrollPatientToProgram(Table programDetails) {
        AmmanProgramPage ammanProgramPage = PageFactory.get(AmmanProgramPage.class);
        Program treatment = TableTransformer.asEntity(programDetails,Program.class);
        ammanProgramPage.enrollToProgram(treatment);
        waitForAppReady();
    }


}

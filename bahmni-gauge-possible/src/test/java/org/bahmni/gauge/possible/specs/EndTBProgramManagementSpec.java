package org.bahmni.gauge.possible.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;

public class EndTBProgramManagementSpec {

	@BeforeClassSteps
	public void waitForAppReady(){ new BahmniPage().waitForSpinner(DriverFactory.getDriver());}

}

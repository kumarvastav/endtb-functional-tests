package org.bahmni.gauge.possible.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;

public class EndTBProgramManagementSpec {

	@BeforeClassSteps
	public void waitForAppReady(){ new BahmniPage().waitForSpinner(DriverFactory.getDriver());}

}

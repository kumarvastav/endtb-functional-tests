package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.DispositionPage;

public class DispositionPageSpec extends BahmniPage {
    private DispositionPage dispositionPage;

    public DispositionPageSpec() {
        dispositionPage = (DispositionPage) PageFactory.getPage(DispositionPage.class);
    }

    @BeforeClassSteps
    public void waitForAppReady(){ new BahmniPage().waitForSpinner(DriverFactory.getDriver());}

    @Step("Select <Disposition Type> disposition")
    public void captureDataForDisposition(String dispositionType){
        dispositionPage.captureDataForDisposition(dispositionType);
    }
}

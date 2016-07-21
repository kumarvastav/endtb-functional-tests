package org.bahmni.gauge.endtb.specs;

import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.ObservationsPage;
import org.bahmni.gauge.endtb.clinical.BaselinePage;

public class ObservationSpec extends BaselinePage {

    @Step("Select the template <template> from on the observation page")
    public void clickOnTreatmentEnrollment(String template) {
        ObservationsPage observationsPage = PageFactory.getObservationsPage();
        observationsPage.selectTemplate(template);
    }

}

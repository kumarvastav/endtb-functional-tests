package org.bahmni.gauge.common.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.displaycontrol.DispositionDisplayControl;
import org.bahmni.gauge.common.clinical.domain.Disposition;
import org.bahmni.gauge.data.StoreHelper;
import org.openqa.selenium.By;

public class VisitPage extends BahmniPage {
    public void selectDisplayControl(String name) {
        if(name.toLowerCase().contains("disposition")){
            new DispositionDisplayControl(findElement(By.id("disposition"))).validate(StoreHelper.getLatest(Disposition.class));
        }

    }
}

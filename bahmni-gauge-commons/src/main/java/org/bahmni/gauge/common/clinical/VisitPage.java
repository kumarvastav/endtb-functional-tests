package org.bahmni.gauge.common.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.displaycontrol.DispositionDisplayControl;
import org.bahmni.gauge.common.clinical.displaycontrol.ProgramsDisplayControl;
import org.bahmni.gauge.common.clinical.domain.Disposition;
import org.bahmni.gauge.data.StoreHelper;
import org.openqa.selenium.By;

/**
 * Created by atmaramn on 25/10/2016.
 */
public class VisitPage extends BahmniPage {
    public void selectDisplayControl(String name) {
        if(name.toLowerCase().contains("disposition")){
            new DispositionDisplayControl(findElement(By.id("disposition"))).validate(StoreHelper.getEntityInSpectStore(Disposition.class));
        }

    }
}

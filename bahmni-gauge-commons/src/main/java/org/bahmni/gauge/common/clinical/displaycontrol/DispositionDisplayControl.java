package org.bahmni.gauge.common.clinical.displaycontrol;

import org.bahmni.gauge.common.clinical.domain.Disposition;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

/**
 * Created by atmaramn on 25/10/2016.
 */
public class DispositionDisplayControl {
    private WebElement webElement;

    public DispositionDisplayControl(WebElement disposition) {
        this.webElement=disposition;
    }

    public void validate(Disposition disposition) {
        Assert.assertTrue("Disposition Type dont match",webElement.getText().toLowerCase().contains(disposition.getType().toLowerCase()));

        Assert.assertTrue("Disposition Date dont match",webElement.getText().toLowerCase().contains(disposition.getDate().substring(0,9).toLowerCase()));

        Assert.assertTrue("Disposition Notes dont match",webElement.getText().toLowerCase().contains(disposition.getNotes().toLowerCase()));
    }
}

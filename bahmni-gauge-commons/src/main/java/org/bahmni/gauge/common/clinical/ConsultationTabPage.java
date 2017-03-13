package org.bahmni.gauge.common.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.domain.Disposition;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConsultationTabPage extends BahmniPage {
    @FindBy(how = How.CSS, using = ".consultation-content .disposition-state")
    public WebElement dispositionDisplayControl;

    public void verifyDisposition(Disposition disposition) {
        Assert.assertThat("Disposition data dont match", dispositionDisplayControl.getText().toLowerCase(), CoreMatchers.containsString((disposition.getType() + " on " + disposition.getDate()).toLowerCase()));

        findElement(By.cssSelector(".toggle.fr.has-notes")).click();
        Assert.assertTrue("Disposition notes dont match", findElement(By.cssSelector(".consultation-content .disposition .notes")).getText().contains(disposition.getNotes()));
    }

    public String getDisplayControlTextWithCaption(String displayControlCaption) {
        WebElement displayControl = findElement(By.xpath(".//*[contains(text(),\"" + displayControlCaption + "\")]/../../../../../table/tbody"));
        waitForSpinner();
        return displayControl.getText().replace("\n", "");

    }
}

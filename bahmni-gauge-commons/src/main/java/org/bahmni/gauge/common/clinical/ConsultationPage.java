package org.bahmni.gauge.common.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ConsultationPage extends BahmniPage {
	
	@FindBy(how= How.CSS, using = ".btn--success")
    public WebElement clinical;
	
	@FindBy(how= How.CSS, using = ".consultation-tabs .tab-item a")
    public List<WebElement> tabs;
	
	@FindBy(how= How.CSS, using = ".patient-info")
    public WebElement patient_profile;
	
	@FindBy(how= How.CSS, using = ".save-consultation")
    public WebElement save;

    public void saveConsultation(){
        save.click();
    }

    public void clickPatientProfile(){
        patient_profile.click();
    }

    public void clickOnTab(String tab) {
        for (WebElement eachTab: tabs){
            if (eachTab.getText().contains(tab)){
                eachTab.click();
                return;
            }
        }
    }
}

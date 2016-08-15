package org.bahmni.gauge.common.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.domain.DrugOrder;
import org.bahmni.gauge.common.clinical.domain.ObservationForm;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DashboardPage extends BahmniPage {

	public static final String URL = BASE_URL.concat("/bahmni/clinical/#/default/patient/%s/dashboard?enrollment=%s");

	@FindBy(how = How.CSS, using = ".btn--success")
	public WebElement clinical;

	@FindBy(how = How.CSS, using = ".dashboard")
	public List<WebElement> dashboards;

	@FindBy(how = How.CSS, using = ".patient-dashboard")
	public WebElement dashboardSections;

	@FindBy(how = How.CSS, using = ".bacteriology-dashboard")
	public WebElement bacteriology_results;

	public void selectDashboard(String name) {
		for (WebElement dashboard : dashboards) {
			WebElement dashboardLink = dashboard.findElement(By.tagName("a"));
			if (dashboardLink != null && dashboardLink.getText().equals(name)) {
				dashboardLink.click();
			}
		}
	}

	public void clickEnterData(){
		clinical.click();
	}

	public WebElement findElementById(String id) {
		return dashboardSections.findElement(By.id(id));
	}

	public void validateObservationDisplayControl(ObservationForm observationForm, String displayControl){
		for (WebElement dashboard : dashboards) {
			if(dashboard.getText().contains(displayControl))
				Assert.assertTrue(dashboard.getText().contains(observationForm.toString()));
		}
	}

	public void validateDrugOrderDisplayControl(DrugOrder drugOrder, String displayControl){
		for (WebElement dashboard : dashboards) {
			if(dashboard.getText().contains(displayControl))
				Assert.assertTrue(dashboard.getText().contains(drugOrder.toString()));
		}
	}

}

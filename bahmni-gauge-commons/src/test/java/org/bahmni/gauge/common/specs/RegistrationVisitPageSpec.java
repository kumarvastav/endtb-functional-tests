package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.DashboardPage;
import org.bahmni.gauge.common.clinical.VisitPage;
import org.bahmni.gauge.common.registration.RegistrationVisitDetailsPage;
import org.bahmni.gauge.common.registration.domain.Location;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.common.registration.domain.Visit;
import org.bahmni.gauge.data.StoreHelper;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.bahmni.gauge.util.StringUtil;
import org.bahmni.gauge.util.TableTransformer;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegistrationVisitPageSpec {
    private final WebDriver driver;

    public RegistrationVisitPageSpec() {
        this.driver = DriverFactory.getDriver();
    }

    @BeforeClassSteps
    public void waitForAppReady() {
        BahmniPage.waitForSpinner(driver);
    }

    @Step("Close visit")
    public void closeVisit() {
        RegistrationVisitDetailsPage registrationVisitPage = PageFactory.getRegistrationVisitPage();
        registrationVisitPage.closeVisit(driver);
    }

    @Step("Try close visit")
    public void tryCloseVisit() {
        RegistrationVisitDetailsPage registrationVisitPage = PageFactory.getRegistrationVisitPage();
        registrationVisitPage.tryCloseVisit();
    }

    @Step("Navigate to latest visit page")
    public void navigateToVisit() {
        RegistrationVisitDetailsPage registrationVisitPage = PageFactory.getRegistrationVisitPage();
        registrationVisitPage.openLastVisit();
    }

    @Step("Verify display control <displayControl> on visit page, has the following details <table>")
    public void verifyDisplayControlOnVisitPage(String displayControl, Table table) {
        RegistrationVisitDetailsPage registrationVisitPage = PageFactory.getRegistrationVisitPage();
        String displayControlText = registrationVisitPage.getDisplayControlText(displayControl);
        for (String drugOrder : table.getColumnValues("details")) {
            drugOrder = StringUtil.transformPatternToData(drugOrder);
            Assert.assertTrue("String "+drugOrder+" does not exist. Actual String :"+displayControlText,displayControlText.contains(drugOrder));
        }
    }
    @Step("Verify details on visit page <Disposition> display control")
    public void selectDisplayControl(String name) {
        VisitPage visitPage = PageFactory.get(VisitPage.class);
        visitPage.selectDisplayControl(name);
    }
    @Step("Verify Error popup with message <message> is displayed")
    public void verifyErrorOnPageWithMessage(String message){
        RegistrationVisitDetailsPage registrationVisitPage = PageFactory.getRegistrationVisitPage();
        registrationVisitPage.waitForElementOnPage(By.cssSelector(".error-message-container"));
        Assert.assertEquals("Error popup message dont match",message,registrationVisitPage.findElement(By.cssSelector("#view-content .msg")).getText());
    }

    @Step("Open visit for previous patient using api <table>")
    public void openVisitThroughApi(Table table){
        RegistrationVisitDetailsPage registrationVisitPage = PageFactory.getRegistrationVisitPage();
        Visit visit= TableTransformer.asEntity(table,Visit.class);
        visit.setPatient(StoreHelper.getLatest(Patient.class));
        Location location=new Location();
        location.setDisplay(visit.getLocation());
        visit.setLocation(BahmniRestClient.get().getModelByName(location).getUuid());
//        switch (visit.getLocation().toLowerCase())
//        {
//            case "opd-1":
//                visit.setLocation("c1e42932-3f10-11e4-adec-0800271c1b75");
//                break;
//            case "registration desk":
//                visit.setLocation("c1e42932-3f10-11e4-adec-0800271c1b75");
//                break;
//            default:
//                visit.setLocation("c58e12ed-3f12-11e4-adec-0800271c1b75");
//                break;
//        }

        switch (visit.getType().toLowerCase())
        {
            case "opd":
                visit.setType("c22a5000-3f10-11e4-adec-0800271c1b75");
                break;
            case "ipd":
                visit.setType("c228eab1-3f10-11e4-adec-0800271c1b75");
                break;
            default:
                visit.setType("c22a5000-3f10-11e4-adec-0800271c1b75");
                break;
        }
        BahmniRestClient.get().create(visit);
        registrationVisitPage.storeVisitInSpecStore(visit);
    }

}

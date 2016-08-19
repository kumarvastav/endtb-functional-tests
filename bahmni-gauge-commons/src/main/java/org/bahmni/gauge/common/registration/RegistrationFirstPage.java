package org.bahmni.gauge.common.registration;

import com.thoughtworks.gauge.TableRow;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegistrationFirstPage extends BahmniPage {

	public static final String URL = BASE_URL.concat("/registration/#/patient/new");

	@FindBy(how = How.CSS, using = "#givenName")
	public WebElement txtPatientName;

	@FindBy(how = How.CSS, using = "#registrationNumber")
	public WebElement txtRegistrationNumber;

	@FindBy(how = How.CSS, using = "#familyName")
	public WebElement familyName;

	@FindBy(how = How.CSS, using = "#gender")
	public WebElement gender;

	@FindBy(how = How.CSS, using = "#address4")
	public WebElement purusava;

	@FindBy(how = How.CSS, using = "#ageYears")
	public WebElement ageYears;

	@FindBy(how = How.CSS, using = "#cityVillage")
	public WebElement village;

	@FindBy(how = How.CSS, using = ".submit-btn")
	public WebElement save;

	@FindBy(how = How.CSS, using = ".right.confirm")
	public WebElement enterVisitDetails;

	@FindBy(how = How.CSS, using = "#address1")
	public WebElement addressLine;

	@FindBy(how = How.CSS, using = "strong > span")
	public WebElement new_patient;

	@FindBy(how = How.CSS, using = ".buttonClass")
	public List<WebElement> btnVisit;

	@FindBy(how = How.CSS, using = ".fa-search")
	public WebElement searchLink;

	@FindBy(how = How.CSS, using = "#hasOldIdentifier")
	public WebElement enterID_checkbox;

	@FindBy(how = How.CSS, using = "#registrationNumber")
	public WebElement enterID;

	@FindBy(how = How.CSS, using = ".fa-home")
	public WebElement homepage;

	@FindBy(how= How.CSS, using = ".btn-user-info")
	public WebElement user_info;

	@FindBy(how= How.CSS, using = "i.fa-power-off")
	public WebElement logout;


	public void clickSave() {
		save.click();
	}

	public void registerPatient(Patient patient){
		if(enterID_checkbox.isDisplayed()) {
			enterID_checkbox.click();
			txtRegistrationNumber.sendKeys(patient.getIdNumber());
		}
		txtPatientName.sendKeys(patient.getFirstName());
		familyName.sendKeys(patient.getLastName());
		new Select(gender).selectByVisibleText(patient.getGender());
		ageYears.sendKeys(patient.getAge());
		doActions(patient);
		clickSave();
	}

	protected void doActions(Patient patient) {
		village.sendKeys(patient.getVillage());
	}

	public void navigateToSearchPage() {
		searchLink.click();
	}

	public void verifyPatientWithIdentifierAndName() {
//		Patient patient = getPatientFromSpecStore();
		//TODO: Find a way to identify the identifier in edit mode with correct selector
		//TODO: write a correct assertion
//		Assert.assertTrue(familyName.getText().equals(lastName) && txtPatientName.getText().equals(firstName));
	}

	public void selectEnterPatientID(){
		enterID_checkbox.click();
	}

	public Patient transformTableRowToPatient(TableRow row, List<String> headers) throws Exception {
		Patient patient = new Patient();
		return transform(row,patient,headers);
	}

	public Patient transform(TableRow row,Patient patient,List<String> headers) throws Exception {
		for (String header : headers) {
			String value = row.getCell(header);
			try {
				if(propertyExists(patient,header)){
					BeanUtils.setProperty(patient, header, value);
				} else {
					throw new Exception("Property :"+header+" not found in "+patient.getClass());
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception(e.getMessage());
			}
		}
		return patient;
	}

	private static boolean propertyExists (Object object, String property) {
		return PropertyUtils.isReadable(object, property) && PropertyUtils.isWriteable(object, property);
	}

	public void startVisit(String visit) {
		//TODO: add startVisit
	}

	public void logout(){
		user_info.click();
		logout.click();
	}

	public void enterVisitDetailsPage() {
		enterVisitDetails.click();
	}
}

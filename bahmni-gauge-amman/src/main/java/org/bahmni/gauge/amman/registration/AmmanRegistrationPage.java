package org.bahmni.gauge.amman.registration;

import org.bahmni.gauge.amman.registration.domain.AmmanPatient;
import org.bahmni.gauge.common.registration.RegistrationFirstPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmmanRegistrationPage extends RegistrationFirstPage{

    //AddressInformation
    @FindBy(how = How.CSS, using = "#address3")
    public WebElement country;

    @FindBy(how = How.CSS, using = "#stateProvince")
    public WebElement governorate;

    //Patient Contanct
    @FindBy(how = How.CSS, using = "#phoneNumber1")
    public WebElement phoneNumber1;

    //CampAddress
    @FindBy(how = How.CSS, using = "#campCountry")
    public WebElement campCountry;

    @FindBy(how = How.CSS, using = "#campGovernorate")
    public WebElement campGovernorate;

    @FindBy(how = How.CSS, using = "#nameoftheCamp")
    public WebElement campName;


    //OtherInformation
    @FindBy(how = How.CSS, using = "#spokenLanguages")
    public WebElement spokenLanguages;

    //Patient ID Document
    @FindBy(how = How.CSS, using = "#id1Document")
    public WebElement id1Document;

    @FindBy(how = How.CSS, using = "#id1DocNumber")
    public WebElement id1DocNumber;

    @FindBy(how = How.CSS, using = "#id1FullNameEnglish")
    public WebElement id1FullNameEnglish;

    @FindBy(how = How.CSS, using = "#isCareTakerRequired")
    public WebElement isCareTakerRequiredCheckBox;

    //Caretaker details
    @FindBy(how = How.CSS, using = "#caretakerNameEnglish")
    public WebElement caretakerNameEnglish;

    @FindBy(how = How.CSS, using = "#caretakerNameArabic")
    public WebElement caretakerNameArabic;

    @FindBy(how = How.CSS, using = "#caretakerGender")
    public WebElement caretakerGender;

    @FindBy(how = How.CSS, using = "#caretakerDob")
    public WebElement caretakerDob;

    //Caretaker ID Documents
    @FindBy(how = How.CSS, using = "#id3Document")
    public WebElement caretakerDocumentType;

    @FindBy(how = How.CSS, using = "#id3FullNameEnglish")
    public WebElement caretakerNameInDocument;

    //Caretaker Contact details
    @FindBy(how = How.CSS, using = "#caretakerPhoneNumber1")
    public WebElement caretakerPhoneNumber1;

    //Legal Representative
    @FindBy(how = How.CSS, using = "#legalRepFullNameEnglish")
    public WebElement legalRepFullNameEnglish;

    @FindBy(how = How.CSS, using = "#legalRepRelationWithPatient")
    public WebElement legalRepRelationWithPatient;

    @FindBy(how = How.CSS, using = "#legalRepDob")
    public WebElement legalRepDob;

    @FindBy(how = How.CSS, using = "#legalRepalsoCaretaker")
    public WebElement legalRepalsoCaretaker;

    @FindBy(how = How.CSS, using = ".box-container.form legend")
    public List<WebElement> allForms;

    public void createPatient(AmmanPatient ammanPatient) {
        expandAllSections();
        txtPatientName.sendKeys(ammanPatient.getFirstName());
        familyName.sendKeys(ammanPatient.getLastName());
        new Select(gender).selectByVisibleText(ammanPatient.getGender());
        ageYears.sendKeys(String.valueOf(ammanPatient.getAge()));
        governorate.sendKeys(ammanPatient.getGovernorate());
        country.sendKeys(ammanPatient.getCountry());
        phoneNumber1.sendKeys(ammanPatient.getPhoneNumber1());
        spokenLanguages.sendKeys(ammanPatient.getSpokenLanguages());
        enterVisitDetailsPage();
    }

    public void checkCareTakerRequired(){
        isCareTakerRequiredCheckBox.click();
    }

    public boolean isCareTakenSectionVisible(){
        return caretakerNameEnglish.isDisplayed();
    }

    public boolean isLegalRepresentativeSectionVisible(){ return legalRepFullNameEnglish.isDisplayed(); }

    private void expandAllSections() {
        for (WebElement form: allForms){
            if (!form.getAttribute("class").contains("active")){
                form.findElement(By.tagName("a")).click();
            }
        }

    }
}

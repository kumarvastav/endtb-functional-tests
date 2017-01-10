package org.bahmni.gauge.common.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.domain.Specimen;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class BacteriologyPage extends BahmniPage{
	
	@FindBy(how= How.CSS, using = "#sample-date")
    public WebElement sample_date;
	
	@FindBy(how= How.CSS, using = ".grid-row-element")
    public List<WebElement> sample_buttons;
	
	@FindBy(how= How.CSS, using = "#sample-id")
    public WebElement sample_id;
	
	@FindBy(how= How.CSS, using = ".fa-caret-right.ng-scope")
    public WebElement results;
	
	@FindBy(how= How.CSS, using = "#observation_4")
    public WebElement date_AFB;
	
	@FindBy(how= How.CSS, using = "#observation_5")
    public WebElement smear_ID;
	
	@FindBy(how= How.CSS, using = ".savedSpecimens-container")
    public List<WebElement> saved_specimen;
	
	@FindBy(how= How.CSS, using = ".savedSpecimens-container .fa-pencil")
    public WebElement edit;
	
	@FindBy(how= How.CSS, using = ".savedSpecimens-container .fa-remove")
    public WebElement delete;

    public void expandResults() throws InterruptedException {
    	results.click();
    }
    
    public void clickButton(String name) throws InterruptedException { 	
    	for(int i=0; i<= sample_buttons.size()-1; i++){
    		if(sample_buttons.get(i).getText().toString().contains(name))
    			sample_buttons.get(i).click();
    	}
    }
    
    public void enterSampleDate(String date) throws InterruptedException {
    	sample_date.sendKeys(date);
    }
    
    public void enterSampleID(String sample) throws InterruptedException {
    	sample_id.sendKeys(sample);
    }
    
    public boolean isSampleExists(String Sample, String SampleID){
    	for(int i=0;i<=saved_specimen.size()-1;i++){
    		if(saved_specimen.get(i).getText().contains(Sample) && saved_specimen.get(i).getText().contains(SampleID)){
    			return true;
    		}
    	}
    	return false;
    }
    
    public WebElement lookForBacteriologyResult(String date, String type, String sample) {
    	for(int i=0;i<=saved_specimen.size();i++){
    		if(saved_specimen.get(i).getText().contains(date) && saved_specimen.get(i).getText().contains(sample))
    			return saved_specimen.get(i);
    	}
    	return null;
    }

	public void addSamples(List<Specimen> specimens) {
		int index=0;
		for(Specimen specimen:specimens){
			enterDetails(index++,specimen);
		}

	}
	public void enterDetails(int index,Specimen specimen){

		if(index!=0){
			scrollToTop();
			driver.findElements(By.cssSelector(".add-more-concept-set")).get(0).click();
		}
		WebElement form=driver.findElements(By.cssSelector(".form")).get(index);

		form.findElement(By.cssSelector("#sample-date")).sendKeys(specimen.getDateOfSampleCollection());

		waitForSpinner();

		form.findElement(By.cssSelector(".grid-row-element[title=\""+specimen.getTypeOfSample()+"\"]")).click();

		WebElement sampleId=form.findElement(By.cssSelector("#sample-id"));
		sampleId.clear();
		sampleId.sendKeys(specimen.getIdentifier());

		WebElement note=form.findElement(By.cssSelector("[ng-model=\"observation.value\"]"));
		note.clear();
		note.sendKeys(specimen.getNote());

		//expand All sections
		try{
		form.findElement(By.cssSelector(".fa-caret-right")).click();

		for(WebElement element:form.findElements(By.cssSelector(".fa-caret-right"))){
			element.click();
		}} catch (NoSuchElementException ex){

		}

		form.findElement(By.cssSelector(".grid-row-element[title=\""+specimen.getSmearResult()+"\"]")).click();

		WebElement labId=form.findElements(By.cssSelector("[ng-model=\"observation.value\"]")).get(1);
		labId.clear();
		labId.sendKeys(specimen.getLabIdNumber());

		form.findElement(By.cssSelector(".grid-row-element[title=\""+specimen.getOtherSymptom()+"\"]")).click();

		form.findElement(By.cssSelector("[ng-model=\"selectedDate\"]")).sendKeys(specimen.getaFBDate());

		form.findElement(By.cssSelector("[ng-model=\"selectedTime\"]")).sendKeys(specimen.getaFBTime());

		form.findElements(By.cssSelector("[ng-model=\"observation.value\"]")).get(2).sendKeys(specimen.getXpertTestDate());

		WebElement xpertTestId=form.findElements(By.cssSelector("[ng-model=\"observation.value\"]")).get(3);
		xpertTestId.clear();
		xpertTestId.sendKeys(specimen.getXpertTestId());

		form.findElement(By.cssSelector(".grid-row-element[title=\""+specimen.getXpertResult()+"\"]")).click();


	}
	public void editSample(int rowNumber, Specimen specimen) {
		driver.findElements(By.cssSelector(".fa-pencil")).get(rowNumber-1).click();

		enterDetails(1,specimen);

	}

	public void deleteSample(int rowNumber) {
		driver.findElements(By.cssSelector(".bacteriology-container i.fa-remove")).get(rowNumber-1).click();

		Alert alert=driver.switchTo().alert();
		alert.accept();

	}
}

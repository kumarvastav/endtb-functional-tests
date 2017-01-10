package org.bahmni.gauge.common.clinical.displaycontrol;

import org.bahmni.gauge.common.program.domain.Program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by atmaramn on 23/09/2016.
 */
public class ProgramsDisplayControl {
    private WebElement webElement;
    private By locTreatmentDate = By.cssSelector(".program-attributes .program-attribute:nth-of-type(2) .program-attribute-value");
    private By locPatientStage = By.cssSelector(".program-attributes .program-attribute:nth-of-type(5) .program-attribute-value");
    private By locProgramState = By.cssSelector(".program-table table tbody tr:nth-of-type(1) td:nth-of-type(1)");
    private By locStartDate = By.cssSelector(".program-dates.fr");
    private By locProgramName = By.cssSelector(".program-name.fl");
    public ProgramsDisplayControl(WebElement webElement) {
        this.webElement = webElement;
    }

    public boolean validateActiveProgram(Program program) {
        return isStartDateProper(program) && isPatientStageProper(program) && isProgramStateProper(program) && isTreatmentDateProper(program) && isProgramDisplayed(program.getName()) && isStartDateDisplayed(program.getDateOfRegistration());

    }

    private boolean isTreatmentDateProper(Program treatment) {
        if (treatment.getTreatmentDate() != null) {
            WebElement actualTreatmentDate = webElement.findElement(locTreatmentDate);
            Date actualDate;
            try {
                actualDate = (new SimpleDateFormat("dd MMM yy")).parse(actualTreatmentDate.getText());
                Date expectedDate = (new SimpleDateFormat("dd/MM/yyyy")).parse(treatment.getTreatmentDate());
                return actualDate.equals(expectedDate);

            } catch (ParseException e) {
                e.printStackTrace();
                return false;
            }

        }
        return true;
    }

    private boolean isProgramStateProper(Program treatment) {
        if (treatment.getProgramStatus()!=null){
            WebElement actualProgramStage=webElement.findElement(locProgramState);
            return actualProgramStage.getText().equals(treatment.getProgramStatus());

        }
        return true;
    }

    private boolean isStartDateProper(Program treatment) {
        if (treatment.getDateOfRegistration() != null) {
            WebElement actualStartDate = webElement.findElement(locStartDate);
            try {
                Date actualDate = (new SimpleDateFormat("dd MMM yy")).parse(actualStartDate.getText().substring(13));
                Date expectedDate = (new SimpleDateFormat("dd/MM/yyyy")).parse(treatment.getDateOfRegistration());
                return actualDate.equals(expectedDate);

            } catch (ParseException e) {
                e.printStackTrace();
                return false;
            }

        }
        return true;

    }
    private boolean isPatientStageProper(Program treatment){
        if (treatment.getPatientStatus()!=null){
            WebElement actualPatientStage=webElement.findElement(locPatientStage);
            return actualPatientStage.getText().equals(treatment.getPatientStatus());

        }
        return true;

    }

    private boolean isProgramDisplayed(String name) {
        WebElement actualProgramName = webElement.findElement(locProgramName);
        return name.equals(actualProgramName.getText());
    }

    private boolean isStartDateDisplayed(String doReg) {
        if (doReg != null) {
            WebElement actualStartDate = webElement.findElement(locStartDate);
            String text =actualStartDate.getText().substring(13);
            System.out.println(text);

            Date actualDate;
            try {
                actualDate = (new SimpleDateFormat("dd MMM yy")).parse(text);
                Date expectedDate = (new SimpleDateFormat("dd/MM/yyyy")).parse(doReg);
                return actualDate.equals(expectedDate);

            } catch (ParseException e) {
                e.printStackTrace();
                return false;
            }

        }
        return true;

    }
}

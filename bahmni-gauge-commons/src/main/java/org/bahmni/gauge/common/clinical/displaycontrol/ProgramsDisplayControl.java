package org.bahmni.gauge.common.clinical.displaycontrol;

import org.bahmni.gauge.common.program.domain.Program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.openqa.selenium.By.cssSelector;

/**
 * Created by atmaramn on 23/09/2016.
 */
public class ProgramsDisplayControl {
    WebElement webElement;
    By locTreatmentDate = By.cssSelector(".program-attributes .program-attribute:nth-of-type(2) .program-attribute-value");
    By locPatientStage = By.cssSelector(".program-attributes .program-attribute:nth-of-type(5) .program-attribute-value");
    By locProgramState = By.cssSelector(".program-table table tbody tr:nth-of-type(1) td:nth-of-type(1)");
    By locTreatmentStartDate = By.cssSelector(".program-table table tbody tr:nth-of-type(1) td:nth-of-type(2)");
    By locStartDate = By.cssSelector(".program-dates.fr");

    public ProgramsDisplayControl(WebElement webElement) {
        this.webElement = webElement;
    }

    public boolean validateActiveProgram(Program program) {
        return isStartDateProper(program) && isPatientStageProper(program) && isProgramStateProper(program) && isTreatmentDateProper(program);

    }

    private boolean isTreatmentDateProper(Program treatment) {
        if (treatment.getTreatmentDate() != null) {
            WebElement actualTreatmentDate = webElement.findElement(locTreatmentDate);
            Date actualDate = null;
            try {
                actualDate = (new SimpleDateFormat("dd MMM yy")).parse(actualTreatmentDate.getText());
                Date expectedDate = (new SimpleDateFormat("dd/MM/yyyy")).parse(treatment.getTreatmentDate());
                if (actualDate.equals(expectedDate))
                    return true;
                else
                    return false;

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

    public boolean isStartDateProper(Program treatment) {
        if (treatment.getDateOfRegistration() != null) {
            WebElement actualStartDate = webElement.findElement(locStartDate);
            try {
                Date actualDate = (new SimpleDateFormat("dd MMM yy")).parse(actualStartDate.getText().substring(13));
                Date expectedDate = (new SimpleDateFormat("dd/MM/yyyy")).parse(treatment.getDateOfRegistration());
                if (actualDate.equals(expectedDate))
                    return true;
                else
                    return false;

            } catch (ParseException e) {
                e.printStackTrace();
                return false;
            }

        }
        return true;

    }
    public boolean isPatientStageProper(Program treatment){
        if (treatment.getPatientStatus()!=null){
            WebElement actualPatientStage=webElement.findElement(locPatientStage);
            return actualPatientStage.getText().equals(treatment.getPatientStatus());

        }
        return true;

    }
}

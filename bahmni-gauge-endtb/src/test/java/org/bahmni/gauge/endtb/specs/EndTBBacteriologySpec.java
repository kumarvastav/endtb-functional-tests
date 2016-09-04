package org.bahmni.gauge.endtb.specs;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.BacteriologyPage;
import org.bahmni.gauge.common.clinical.domain.Specimen;
import org.bahmni.gauge.common.login.LoginPage;
import org.bahmni.gauge.common.program.domain.PatientProgram;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.endtb.clinical.domain.EndTBSpecimen;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.bahmni.gauge.util.TableTransformer;

import java.util.Map;

public class EndTBBacteriologySpec {

    @Step("Create a bacteriology specimen smear result <table>")
    public void createBacteriologySmearResult(Table table){
        LoginPage page = PageFactory.getLoginPage();

        EndTBSpecimen specimen = new TableTransformer<>(EndTBSpecimen.class).transformToTable(table);
        specimen.setTypeOfVisitUuid(getConceptAnswerUuidForConceptName("Bacteriology, Type of Visit", specimen.getTypeOfVisit()));
        specimen.setLaboratoryNameUuid(getConceptAnswerUuidForConceptName("Bacteriology, Laboratory Name", specimen.getLaboratoryName()));
        specimen.setSmearResultUuid(getConceptAnswerUuidForConceptName("Bacteriology, Smear result", specimen.getSmearResult()));

        Patient patient = page.getPatientFromSpecStore();
        PatientProgram patientProgram = page.getPatientProgramFromSpecStore();

        BahmniRestClient.get().createBacteriologySpecimen("bacteriology_smear_create.ftl",specimen,patient,patientProgram);
    }

    private String getConceptAnswerUuidForConceptName(String conceptName, String answerName){
        Map<String,String> answers = BahmniRestClient.get().getConceptAnswersForConceptName(conceptName);

        if(!answers.containsKey(answerName)){
            throw new IllegalArgumentException("The answer ["+ answerName+"] is invalid for the concept ["+conceptName+"]");
        }

        return answers.get(answerName);
    }

}

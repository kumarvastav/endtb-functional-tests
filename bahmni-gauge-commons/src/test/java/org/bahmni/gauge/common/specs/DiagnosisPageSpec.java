package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.DiagnosisPage;
import org.bahmni.gauge.common.clinical.domain.Diagnosis;
import org.bahmni.gauge.data.StoreHelper;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.bahmni.gauge.util.TableTransformer;

import java.util.List;

/**
 * Created by atmaramn on 01/11/2016.
 */
public class DiagnosisPageSpec extends BahmniPage {

    @BeforeClassSteps
    public void waitForAppReady(){ BahmniPage.waitForSpinner(DriverFactory.getDriver());}

    @Step("Add following diagnosis <table>")
    public void addCodedDiagnosis(Table table){
        List<Diagnosis> diagnoses=TableTransformer.asEntityList(table, Diagnosis.class);
        DiagnosisPage diagnosisPage= PageFactory.get(DiagnosisPage.class);

        diagnosisPage.enterDiagnoses(diagnoses);

    }
    @Step("Verify diagnoses on current display control on diagnosis page")
    public void verifyDiagnosesOnCurrentDiagnosis(){
        DiagnosisPage diagnosisPage= PageFactory.get(DiagnosisPage.class);

        diagnosisPage.verifyCurrentDisplayControl(getPatientFromSpecStore().getDiagnoses());
    }

    @Step("Edit the following diagnosis <table>")
    public void editDiagnosis(Table table){
        List<Diagnosis> diagnoses=TableTransformer.asEntityList(table, Diagnosis.class);
        DiagnosisPage diagnosisPage= PageFactory.get(DiagnosisPage.class);

        diagnosisPage.editDiagnoses(diagnoses);

    }

    @Step("Delete the following diagnoses <table>")
    public void deleteDiagnoses(Table table){
        List<Diagnosis> diagnoses=TableTransformer.asEntityList(table, Diagnosis.class);
        DiagnosisPage diagnosisPage= PageFactory.get(DiagnosisPage.class);

        diagnosisPage.deleteDiagnoses(diagnoses);
    }
    @Step("Add diagnosis through API <table>")
    public void addDiagnosisAPI(Table table){
        List<Diagnosis> diagnoses = TableTransformer.asEntityList(table,Diagnosis.class);
        getPatientFromSpecStore().setDiagnoses(diagnoses);
        BahmniRestClient.get().create(getPatientFromSpecStore(),"bahmnicore/bahmniencounter");
    }

}

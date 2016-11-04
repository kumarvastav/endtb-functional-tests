package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.DriverFactory;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.clinical.BacteriologyPage;
import org.bahmni.gauge.common.clinical.domain.Specimen;
import org.bahmni.gauge.util.TableTransformer;

import java.util.List;

/**
 * Created by atmaramn on 04/11/2016.
 */
public class BacteriologyPageSpec extends BahmniPage{
    @BeforeClassSteps
    public void waitForAppReady(){ BahmniPage.waitForSpinner(DriverFactory.getDriver());}

    @Step("Add following bacteriology samples <table>")
    public void addBacteriologySample(Table table){
        List<Specimen> specimens=TableTransformer.asEntityList(table, Specimen.class);
        BacteriologyPage bacteriologyPage= PageFactory.get(BacteriologyPage.class);
        bacteriologyPage.addSamples(specimens);

    }

}

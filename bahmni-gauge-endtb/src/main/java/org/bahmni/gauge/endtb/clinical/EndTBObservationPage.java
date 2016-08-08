package org.bahmni.gauge.endtb.clinical;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.clinical.ObservationsPage;
import org.bahmni.gauge.common.clinical.domain.ObservationForm;
import org.bahmni.gauge.common.program.domain.Program;
import org.bahmni.gauge.endtb.clinical.domain.BaselineForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class EndTBObservationPage extends ObservationsPage {
	
	@FindBy(how= How.ID, using ="template-control-panel-button")
    public WebElement dateBaselineAssessment;

	@FindBy(how= How.CSS, using =".dashboard-content .leaf-observation-node")
    public List<WebElement> observation_nodes;

    @FindBy(how= How.CSS, using =".control-label>span[ng-bind='::observation.label']")
    public List<WebElement> alllabel;

    public BaselineForm transformTableRowToBaselineForm(TableRow row, List<String> columnNames) {
        BaselineForm baselineForm = new BaselineForm(row.getCell(columnNames.get(0)),row.getCell(columnNames.get(1)),row.getCell(columnNames.get(2))
            ,row.getCell(columnNames.get(3)),row.getCell(columnNames.get(4)),row.getCell(columnNames.get(5)),row.getCell(columnNames.get(6)),row.getCell(columnNames.get(6)));
        return baselineForm;
    }
}

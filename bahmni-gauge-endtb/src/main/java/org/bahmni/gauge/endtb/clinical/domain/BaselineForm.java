package org.bahmni.gauge.endtb.clinical.domain;

import java.util.Date;

/**
 * Created by dharmens on 7/18/16.
 */
public class BaselineForm {

    private Date dateBaselineAssessment;
    private String maritalStatus;
    private String homeless;
    private String employed;
    private String hasThePatientEverBeenTreatedForTBInThePast;

    public BaselineForm(Date dateBaselineAssessment,String maritalStatus,
                    String homeless, String employed, String hasThePatientEverBeenTreatedForTBInThePast){
        this.dateBaselineAssessment = dateBaselineAssessment;
        this.maritalStatus= maritalStatus;
        this.homeless= homeless;
        this.employed = employed ;
        this.hasThePatientEverBeenTreatedForTBInThePast = hasThePatientEverBeenTreatedForTBInThePast;

    }
}

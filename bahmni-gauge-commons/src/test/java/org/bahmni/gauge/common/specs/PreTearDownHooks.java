package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.data.StoreHelper;
import org.bahmni.gauge.rest.BahmniRestClient;

public class PreTearDownHooks {

    @Step("PreTearDownHook: Discharge patient during teardown")
    public void dischargePatientDuringTeardown() {
        final Patient currentPatient = StoreHelper.getLatest(Patient.class);
        PreTearDownHook dischargePatient = new PreTearDownHook() {
            @Override
            public boolean execute() {
                BahmniRestClient.dischargePatient(currentPatient);
                return true;
            }
        };
        StoreHelper.store(PreTearDownHook.class,dischargePatient);
    }

    public static void executeAll() {
        for (PreTearDownHook preTearDownHook : StoreHelper.getAll(PreTearDownHook.class)) {
            preTearDownHook.execute();
        }
    }

    private interface PreTearDownHook {
        boolean execute();
    }
}

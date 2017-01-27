package org.bahmni.gauge.common.specs;

import org.bahmni.gauge.data.StoreHelper;

public class PreTearDownHooks {

    public static void executeAll() {
        for (PreTearDownHook preTearDownHook : StoreHelper.getAll(PreTearDownHook.class)) {
            preTearDownHook.execute();
        }
    }

    private interface PreTearDownHook {
        boolean execute();
    }
}

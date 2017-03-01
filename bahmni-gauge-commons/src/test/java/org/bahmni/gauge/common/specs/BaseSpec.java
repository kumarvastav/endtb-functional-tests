package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.AfterSpec;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.admin.domain.OrderSet;
import org.bahmni.gauge.common.formBuilder.domain.Form;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.data.StoreHelper;
import org.bahmni.gauge.rest.BahmniRestClient;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Deprecated
public class BaseSpec {
    static String stringDoesNotExist(String content) {
        return "String `" + content + "` does not exist";
    }

    /*
    *   date format: <NOW[simpleDateFormat]>
    *   example: <NOW[dd-MM-yy]>
    *   result: 31-12-95
    *   setDateTime("Date Of Obs: <NOW[dd-MM-yy hh:mm a]>") will give "Date Of Obs: 31-12-95 09:30 PM"
    */

    static String setDateTime(String content) {
        String pattern = "<NOW\\[(.*)\\]>";
        Matcher matcher = Pattern.compile(".*" + pattern + ".*").matcher(content);
        String dateFormat = "dd-MM-yy";
        while (matcher.find()) {
            dateFormat = matcher.group(1);
        }
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        return content.replaceAll(pattern, formatter.format(new Date()));
    }

/*
*Handled in DriverFactory
* @deprecated use {@link #org.bahmni.gauge.common.DriverFactory.tearDown()} instead
 */
    @AfterSpec @Deprecated
    public void teardown() {
        List<Patient> patients = StoreHelper.getAll(Patient.class);
        for (Patient patient : patients) {
            if (patient != null) {
                BahmniRestClient.get().retirePatient(patient);
            }
        }
        OrderSet orderSet = new BahmniPage().getOrderSetInSpecStore();
        if (orderSet != null) {
            BahmniRestClient.get().retireOrderSet(orderSet);
        }

        List<Form> forms = StoreHelper.getAll(Form.class);
        for(Form form : forms) {
            if(form != null) {
                BahmniRestClient.get().retireObsForm(form);
            }
        }
    }
}
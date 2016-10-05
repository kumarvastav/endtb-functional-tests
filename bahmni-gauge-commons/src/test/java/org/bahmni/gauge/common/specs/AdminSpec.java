package org.bahmni.gauge.common.specs;

import com.thoughtworks.gauge.BeforeClassSteps;
import com.thoughtworks.gauge.Step;
import org.bahmni.gauge.common.BahmniPage;
import org.bahmni.gauge.common.PageFactory;
import org.bahmni.gauge.common.admin.AdminPage;

/**
 * Created by atmaramn on 05/10/2016.
 */
public class AdminSpec extends BahmniPage {
    AdminPage adminPage;

    @Step("Click on order set app")
    public void goToOrderSetPage(){
        adminPage = PageFactory.get(AdminPage.class);
        adminPage.clickOrderSet();
    }
}

package org.bahmni.gauge.common;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.AfterSpec;
import com.thoughtworks.gauge.BeforeSpec;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.bahmni.gauge.common.admin.domain.OrderSet;
import org.bahmni.gauge.common.registration.RegistrationFirstPage;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.rest.BahmniRestClient;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

    private static WebDriver driver;

    //TODO: Remove this static method!!!!!
    public static WebDriver getDriver() {

        // Orignal Code
        // return driver;

        // Manpreet Code :

        if (driver != null) return driver;

        String browser = System.getenv("BROWSER");
        if (browser == null) {
            driver = new FirefoxDriver();
        }
        switch (browser) {
            case "IE":
                driver = new InternetExplorerDriver();
                break;

            case "Firefox":
                driver = new FirefoxDriver();
                break;

            default:
                driver = new ChromeDriver();
                break;

        }
        return driver;


    }

    @BeforeSpec
    public void setup() {

        // Original Code
        /* ChromeDriverManager.getInstance().setup();
        DesiredCapabilities capability = DesiredCapabilities.chrome();
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("--use-fake-ui-for-media-stream");
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//capability.setCapability(ChromeOptions.CAPABILITY,options);
		driver = new ChromeDriver(capability);
		driver.manage().window().setSize(new Dimension(1440, 900));
	*/

        // Manpreet Code


        driver = DriverFactory.getDriver();
        driver.manage().window().setSize(new Dimension(1440, 900));
    }

    @AfterSpec
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    @AfterScenario
    public void tearDownScenario() {
        Patient patient = new RegistrationFirstPage().getPatientFromSpecStore();
        if (patient != null) {
            String uuid = patient.getUuid();
            if (patient.isAdmitted()) {
                if (BahmniRestClient.get().dischargePatient(uuid)) {
                    patient.setBedNumber(null);
                    BahmniRestClient.get().retirePatient(patient);
                }
            } else
                BahmniRestClient.get().retirePatient(patient);

        }
        OrderSet orderSet = new BahmniPage().getOrderSetInSpecStore();
        if (orderSet != null) {
            BahmniRestClient.get().retireOrderSet(orderSet);
        }
    }
}

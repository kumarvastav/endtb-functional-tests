package org.bahmni.gauge.common;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import com.thoughtworks.gauge.datastore.DataStore;
import com.thoughtworks.gauge.datastore.DataStoreFactory;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.bahmni.gauge.common.admin.domain.OrderSet;
import org.bahmni.gauge.common.clinical.domain.DrugOrder;
import org.bahmni.gauge.common.clinical.domain.ObservationForm;
import org.bahmni.gauge.common.home.HomePage;
import org.bahmni.gauge.common.program.domain.PatientProgram;
import org.bahmni.gauge.common.program.domain.Program;
import org.bahmni.gauge.common.registration.domain.Patient;
import org.bahmni.gauge.data.BahmniTable;
import org.bahmni.gauge.data.StoreHelper;
import org.bahmni.gauge.util.TableTransformer;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BahmniPage {

//    private static final Object ORDERSET_KEY = "order_set";
    protected static String BASE_URL = System.getenv("BAHMNI_GAUGE_APP_URL");

//    public static final String PATIENT_KEY = "patient";
//    public static final String PROGRAM_KEY = "program";
//    public static final String PATIENT_PROGRAM_KEY = "patient_program";
//    public static final String BASELINE_KEY = "baselineForm";
//    public static final String OBSERVATION_KEY = "observation";
    public static final String DRUG_ORDER_KEY = "drug_order";
    protected WebDriver driver;

    protected static WebElement find(Collection<WebElement> elements, String elementText) {
        for (WebElement element : elements) {
            if(element.getText().contains(elementText)){
                return element;
            }
        }
        return null;
    }

    public void storePatientInSpecStore(Patient value) {
        StoreHelper.storeEntityInSpectStore(Patient.class,value);
    }

    public Patient getPatientFromSpecStore() {
        return StoreHelper.getEntityInSpectStore(Patient.class);
    }

    public List<DrugOrder> getDrugOrderFromSpecStore() {
        DataStore specStore = DataStoreFactory.getSpecDataStore();
        return (List<DrugOrder>) specStore.get(DRUG_ORDER_KEY);
    }

    public void storeProgramInSpecStore(Program program) {
        StoreHelper.storeEntityInSpectStore(Program.class,program);
    }

    public void storeBaselineFormInSpecStore(ObservationForm baselineForm) {
//        DataStore specStore = DataStoreFactory.getSpecDataStore();
//        specStore.put(BASELINE_KEY, baselineForm);
        StoreHelper.storeEntityInSpectStore(ObservationForm.class,baselineForm);
    }

    public void storeDrugOrderInSpecStore(List<DrugOrder> drugOrder) {
        DataStore specStore = DataStoreFactory.getSpecDataStore();
        specStore.put(DRUG_ORDER_KEY, drugOrder);
    }

    //@Deprecated
    public static void waitForSpinner(WebDriver driver) {
        try {
            waitForElement(driver, ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#overlay")));
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitForSpinner() {
        waitForSpinner(driver);
    }


    public Program getProgramFromSpecStore() {
        return StoreHelper.getEntityInSpectStore(Program.class);
    }

    public void acceptAlert(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void handleExceptions(WebDriver driver) {
        driver.findElement(By.cssSelector(".error-message-container .show-btn")).click();
    }

    public void validateSystemException(WebDriver driver) {
        Assert.assertNotNull(driver.findElement(By.cssSelector(".error-message-container .show-btn")));
    }

    public void dismissAlert(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void handleAlert(WebDriver driver) {
        try {
            Alert alert = driver.switchTo().alert();
            System.out.println("Inside Alert");
            alert.sendKeys(Keys.ENTER + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForAlertPopup(WebDriver driver) {
        waitForElement(driver, ExpectedConditions.alertIsPresent());
    }

    //instead use without the driver parameter
    @Deprecated
    public void waitForElementOnPage(WebDriver driver, String element) {
        waitForElement(driver, ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element)));
    }

    public WebElement waitForElementOnPage(By locator) {
        ExpectedCondition<WebElement> expectedCondition = ExpectedConditions.visibilityOfElementLocated(locator);
        return waitForElement(this.driver, expectedCondition);
    }

    public WebElement waitForElementOnPage(String cssLocator) {
        ExpectedCondition<WebElement> expectedCondition = ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssLocator));
        return waitForElement(this.driver, expectedCondition);
    }

    public WebElement waitForElementOnPage(WebElement element) {
        ExpectedCondition<WebElement> expectedCondition = ExpectedConditions.elementToBeClickable(element);
        return waitForElement(this.driver, expectedCondition);
    }

    public WebElement waitForElementOnPagewithTimeout(String cssLocator, long timeout) {
        ExpectedCondition<WebElement> expectedCondition = ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssLocator));
        return waitForElementwithTimeOut(this.driver, expectedCondition, timeout);
    }

    public static <T> T waitForElement(WebDriver driver, ExpectedCondition<T> expectedCondition) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            return wait.until(expectedCondition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T waitForElementwithTimeOut(WebDriver driver, ExpectedCondition<T> expectedCondition, long timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            return wait.until(expectedCondition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void storeObservationFormInSpecStore(ObservationForm observation) {
        StoreHelper.storeEntityInSpectStore(ObservationForm.class,observation);
    }

    public ObservationForm getObservationFormInSpecStore() {
        return StoreHelper.getEntityInSpectStore(ObservationForm.class);
    }

    public void storeOrderSetInSpecStore(OrderSet orderSet) {

        StoreHelper.storeEntityInSpectStore(OrderSet.class,orderSet);
    }

    public OrderSet getOrderSetInSpecStore() {
        return StoreHelper.getEntityInSpectStore(OrderSet.class);
    }

    public void storePatientProgramInSpecStore(PatientProgram patientProgram) {
//        DataStore specStore = DataStoreFactory.getSpecDataStore();
//        specStore.put(PATIENT_PROGRAM_KEY, patientProgram);
        StoreHelper.storeEntityInSpectStore(PatientProgram.class,patientProgram);
    }

    public PatientProgram getPatientProgramFromSpecStore() {
//        DataStore specStore = DataStoreFactory.getSpecDataStore();
//        return (PatientProgram) specStore.get(PATIENT_PROGRAM_KEY);
        return StoreHelper.getEntityInSpectStore(PatientProgram.class);
    }

    public void closeApp(WebDriver driver) {
        driver.quit();
    }

    public void navigateToHomePage(WebDriver driver) {
        driver.get(HomePage.URL);
        dismissAlert(driver);
    }
    private static boolean propertyExists (Object object, String property) {
        return PropertyUtils.isReadable(object, property) && PropertyUtils.isWriteable(object, property);
    }

    /**
     *
     * @deprecated Use the methods in TableTransformer class in org.bahmni.gauge.util package accordingly
     */
    @Deprecated
    public Object transform(TableRow row,Object object, List<String> headers){
        for (String header : headers) {
            String value = row.getCell(header);
            try {
                if(propertyExists(object,header)){
                    BeanUtils.setProperty(object, header, TableTransformer.fieldTransform(value));
                } else {
                    throw new Exception("Property :"+header+" not found in "+object.getClass());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return object;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElement(By by) {
        return findElement(driver,by);
    }
    public Boolean hasElement(By child){
        return hasElement(driver,child);
    }

    public static WebElement findElement(WebDriver driver, By by) {
        waitForSpinner(driver);
        try{
            return driver.findElement(by);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public static Boolean hasElement(WebDriver driver, By child){
        return null != findElement(driver, child);
    }
    public static WebElement findChild(WebElement parent, By child) {
        try{
            return parent.findElement(child);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public static Boolean hasChild(WebElement parent, By child){
        return null != findChild(parent, child);
    }
    public WebElement findButtonByText(String text) {
        return findElement(By.xpath("//button[contains(text(),'" + text + "')]"));
    }

    public BahmniTable extractTableDataFrom(By locator){
        List<WebElement> columnHeaders=findElement(locator).findElements(By.cssSelector("th"));
        ArrayList<String> columns=new ArrayList<>();

        for (WebElement ele:columnHeaders
             ) {
            columns.add(ele.getText());
        }
        BahmniTable table=new BahmniTable(columns);
        List<WebElement> rows=findElement(locator).findElements(By.cssSelector("tr"));

        for (WebElement row:rows
             ) {
                ArrayList<String> cells=new ArrayList<>();

                for (WebElement cell:row.findElements(By.cssSelector("td"))
                        ) {
                    cells.add(cell.getText());
                }
            if(cells.size()>0)
                table.addRow(cells);

        }
        return table;
    }
}

package org.bahmni.gauge.common;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Field;
import java.util.Objects;

public enum FormElement {
    INPUT("input") {
        public void fillUp(WebElement observationNode, String value) {
            WebElement element = observationNode.findElement(getSelector());
            if (!Objects.equals(element.getAttribute("type"), "date"))
                element.clear();
            element.sendKeys(value);
        }
    },
    TEXT_AREA("textarea") {
        public void fillUp(WebElement observationNode, String value) {
            WebElement element = observationNode.findElement(getSelector());
            element.clear();
            observationNode.findElement(getSelector()).sendKeys(value);
        }
    },
    SELECT("select") {
        public void fillUp(WebElement observationNode, String value) {
            new Select(observationNode.findElement(getSelector())).selectByVisibleText(value);
        }
    },
    BUTTON("button") {
        public void fillUp(WebElement observationNode, String value) {
            for (WebElement button : observationNode.findElements(getSelector())) {
                if (button.getText().contains(value)) {
                    try {
                        button.click();
                        break;
                    } catch (WebDriverException e) {
                        JavascriptExecutor js = ((JavascriptExecutor) getCurrentDriver(button));
                        js.executeScript("scrollBy(0,2500)");
                        Actions actions = new Actions(getCurrentDriver(button));
                        actions.moveToElement(button).click().build().perform();
                        break;
                    }
                }
            }
        }
    },
    UNKNOWN("") {
        public void fillUp(WebElement observationNode, String value) {
            System.out.println("Value :" + value + " not entered.");
        }
    };

    public static final FormElement[] allTypes = {INPUT, TEXT_AREA, SELECT, BUTTON};

    private final String tagName;

    FormElement(String tagName) {
        this.tagName = tagName;
    }


    abstract public void fillUp(WebElement observationNode, String value);

    public By getSelector() {
        return By.tagName(tagName);
    }

    public WebDriver getCurrentDriver(WebElement element) {
        WebDriver driver = null;
        try {
            Field f = element.getClass().getDeclaredField("parent");
            f.setAccessible(true);
            Object obj = f.get(element);
            if (obj instanceof WebDriver) {
                driver = (WebDriver) obj;
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return driver;
    }
}

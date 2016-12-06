package org.bahmni.gauge.common.clinical.displaycontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.bahmni.gauge.common.BahmniPage.findChild;

public class ObsDisplayControl {

	private WebElement webElement;

	public ObsDisplayControl(WebElement webElement) {
		this.webElement = webElement;
	}

	public String getTitle() {
		WebElement headerElement = webElement.findElement(By.tagName("h2"));
		if (headerElement == null) {
			return null;
		}

		return headerElement.getText();
	}

	public Map<String, String> getKeyValues() {
		Map<String, String> keyValues = new HashMap<>();
		List<WebElement> listElements = webElement.findElements(By.className("tree-list-item"));

		for (WebElement element : listElements) {
			transformWebElementToKeyValues(element, keyValues);
		}

		return keyValues;
	}

	private void transformWebElementToKeyValues(WebElement element, Map<String, String> keyValues) {
		WebElement valueElement = findChild(element, By.className("value-text-only"));
		WebElement keyElement = findChild(element, By.className("testUnderPanel"));
		if (valueElement == null || keyElement == null) {
			return;
		}

		WebElement preElement = valueElement.findElement(By.tagName("pre"));
		WebElement spanElement = valueElement.findElement(By.tagName("span"));

		String key = keyElement.findElement(By.tagName("label")).getText();
		String value = preElement.getText() + spanElement.getText();
		keyValues.put(key, value);


	}

	public String getNoRecordsFoundText() {
		WebElement errorMessageElement = webElement
				.findElement(By.xpath("//p[@translate='DISPLAY_CONTROL_ERROR_MESSAGE_KEY']"));
		return errorMessageElement == null ? null : errorMessageElement.getText();
	}

}

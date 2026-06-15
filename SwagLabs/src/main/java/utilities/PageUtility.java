package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectDropdownWithValue(WebElement element, String value) {

		Select object = new Select(element);
		object.selectByValue(value);
	}

	public void selectDropdownWithIndex(WebElement element, int index) {
		Select object = new Select(element);
		object.selectByIndex(index);
	}

	public void selectDropdownWithVisibileText(WebElement element, String Text) {
		Select object = new Select(element);
		object.selectByVisibleText(Text);
	}

	public void deselectDropdownWithValue(WebElement element, String value) {

		Select object = new Select(element);
		object.deselectByValue(value);
	}

	public void deselectDropdownWithIndex(WebElement element, int index) {
		Select object = new Select(element);
		object.deselectByIndex(index);
	}

	public void deselectDropdownWithVisibileText(WebElement element, String Text) {
		Select object = new Select(element);
		object.deselectByVisibleText(Text);
	}

	public void deselectAllDropdown(WebElement element) {
		Select object = new Select(element);
		object.deselectAll();
	}

	public void getOptionsFromDropDown(WebElement element) {
		Select object = new Select(element);
		List<WebElement> options = object.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
	}

	public void dropDownMultipleSelection(WebElement element, boolean status) {
		Select object = new Select(element);
		status = object.isMultiple();
		System.out.println(status);

	}

	public void selectAllCheckBoxes(List<WebElement> checkBoxes) {
		for (WebElement checkBox : checkBoxes) {
			if (!checkBox.isSelected()) {
				checkBox.click();
			}
		}
	}

	public void selectRadioButton(List<WebElement> radios, String value) {
		for (WebElement radio : radios) {
			if (radio.getAttribute("value").equals(value))
				;
			{
				radio.click();
			}
		}
	}

	public void mouseActionWithRightClick(WebDriver driver, WebElement element) {
		Actions object = new Actions(driver);
		object.contextClick(element).build().perform();
	}

	public void mouseActionWithMouseOver(WebDriver driver, WebElement element) {
		Actions object = new Actions(driver);
		object.moveToElement(element).build().perform();
	}

	public void mouseActionWithDragAndDrop(WebDriver driver, WebElement source_element, WebElement target_element) {
		Actions object = new Actions(driver);
		object.dragAndDrop(source_element, target_element).build().perform();
	}

	public void simpleAlert(WebDriver driver) {
		Alert al = driver.switchTo().alert();
		al.accept();

	}

	public void confirmAlert(WebDriver driver) {
		Alert al = driver.switchTo().alert();
		al.accept();
		al.dismiss();

	}

	public void promptAlert(WebDriver driver, String message) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(message);
		al.accept();
		al.dismiss();

	}

	public void openNewTab() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}

	public void scrollUpUsingJavaScriptExcecutor(WebDriver driver) {
		JavascriptExecutor object = (JavascriptExecutor) driver;
		object.executeScript("window.scrollUp(0,-350)", " ");
	}

	public void sendkeyUsingJavascriptExcecutor(WebDriver driver, WebElement element, String value) {
		JavascriptExecutor object = (JavascriptExecutor) driver;
		object.executeScript("arguments[0].value='value';", element);
	}

	public void scrollDownUsingJavaScriptExcecutor(WebDriver driver) {
		JavascriptExecutor object = (JavascriptExecutor) driver;
		object.executeScript("window.scrollBy(0,350)", " ");
	}

	public void clickUsingJavascriptExcecutor(WebDriver driver, WebElement element) {
		JavascriptExecutor object = (JavascriptExecutor) driver;
		object.executeScript("arguments[0].click();", element);
	}

	public void switchToFrameByElement(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchToFrameByIndex(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}

}

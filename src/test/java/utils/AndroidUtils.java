package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;

import io.appium.java_client.AppiumDriver;

public class AndroidUtils {
	private AppiumDriver driver;

	public AndroidUtils(AppiumDriver driver) {
		this.driver = driver;
	}

	public void waitFor(long milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Boolean objectExists(By by) {
		try {
			if (driver.findElements(by).size() == 0) {
				return false;
			} else {
				return true;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public boolean enterValueInTextBox(String text, By by) {
		boolean flag = false;
		try {
			if (driver.findElement(by).isDisplayed()) {
				driver.findElement(by).click();
				driver.findElement(by).clear();
				driver.findElement(by).sendKeys(text);
				// driver.hideKeyboard();
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public String getElementText(By by) {
		if (driver.findElement(by).isDisplayed()) {
			return driver.findElement(by).getText();
		} else {
			throw new ElementNotVisibleException("Element Not Found");
		}
	}
}

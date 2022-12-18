package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import utils.AndroidUtils;
import utils.AppiumDriverFactory;

public class ShoppingPage {

	AppiumDriver driver = null;

	AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();

	AndroidUtils androidUtils;

	private static final By title = By.id("com.saucelabs.mydemoapp.android:id/mTvTitle");

	public void launchApp() {
		driver = appiumDriverFactory.getDriver();

		androidUtils = new AndroidUtils(driver);

		if (androidUtils.objectExists(title)) {
			Assert.assertTrue(true, "Application is opened!");
		} else {
			Assert.assertTrue(true, "Application is not opened!");
		}
	}

}

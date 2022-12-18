package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumDriverFactory {
	
	private static AppiumDriverFactory instanceOfAppiumDriverFactory = null;
	
	private AndroidDriver<WebElement> driver;
	
	private static String appPackage = "com.saucelabs.mydemoapp.android";
	private static String appActivity = "com.saucelabs.mydemoapp.android.view.activities.MainActivity";
	private static String deviceName = "Android";
	
	private AppiumDriverFactory() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		capabilities.setCapability("appPackage", appPackage);
		capabilities.setCapability("appActivity", appActivity);
		
		try {
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
	}
	
	public static AppiumDriverFactory getInstanceOfAppiumDriverFactory() {
		if (instanceOfAppiumDriverFactory == null)
			instanceOfAppiumDriverFactory = new AppiumDriverFactory();

		return instanceOfAppiumDriverFactory;
	}

	public AndroidDriver<WebElement> getDriver() {
		
		return driver;
	}

}

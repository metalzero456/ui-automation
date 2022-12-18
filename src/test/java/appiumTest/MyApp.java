package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MyApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		
		Thread.sleep(3000);
		
		driver.findElementById("com.saucelabs.mydemoapp.android:id/productIV").click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Blue color\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
		
		Thread.sleep(1000);
		
		driver.findElementById("com.saucelabs.mydemoapp.android:id/plusIV").click();
		
		Thread.sleep(1000);
		
		driver.findElementById("com.saucelabs.mydemoapp.android:id/cartBt").click();
		
		Thread.sleep(1000);
		
		driver.findElementById("com.saucelabs.mydemoapp.android:id/cartIV").click();
		
		Thread.sleep(3000);
		
		driver.findElementById("com.saucelabs.mydemoapp.android:id/cartBt").click();
		
		Thread.sleep(1000);
		
		driver.findElementById("com.saucelabs.mydemoapp.android:id/nameET").sendKeys("bod@example.com");
		
		Thread.sleep(1000);
		
		driver.findElementById("com.saucelabs.mydemoapp.android:id/passwordET").sendKeys("10203040");
		
		Thread.sleep(1000);

		driver.findElementById("com.saucelabs.mydemoapp.android:id/loginBtn").click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.ScrollView[@content-desc=\"Manages scrolling of views in given screen\"]/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")).sendKeys("Rebecca Winter");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.ScrollView[@content-desc=\"Manages scrolling of views in given screen\"]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")).sendKeys("Mandorley 112");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.ScrollView[@content-desc=\"Manages scrolling of views in given screen\"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText")).sendKeys("Truro");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.ScrollView[@content-desc=\"Manages scrolling of views in given screen\"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText")).sendKeys("Cornwall");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.ScrollView[@content-desc=\"Manages scrolling of views in given screen\"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.EditText")).sendKeys("89750");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.ScrollView[@content-desc=\"Manages scrolling of views in given screen\"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText")).sendKeys("United Kingdom");
		
		Thread.sleep(1000);
		
		driver.findElementById("com.saucelabs.mydemoapp.android:id/paymentBtn").click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.ScrollView[@content-desc=\"Manages scrolling of views in given screen\"]/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.EditText")).sendKeys("Rebecca Winter");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.ScrollView[@content-desc=\"Manages scrolling of views in given screen\"]/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.EditText")).sendKeys("3258125675687891");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.ScrollView[@content-desc=\"Manages scrolling of views in given screen\"]/android.view.ViewGroup/android.widget.RelativeLayout[3]/android.widget.EditText")).sendKeys("0325");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.ScrollView[@content-desc=\"Manages scrolling of views in given screen\"]/android.view.ViewGroup/android.widget.RelativeLayout[4]/android.widget.EditText")).sendKeys("123");
		
		Thread.sleep(1000);
		
		driver.findElementById("com.saucelabs.mydemoapp.android:id/paymentBtn").click();
		
		Thread.sleep(3000);
		
		driver.findElementById("com.saucelabs.mydemoapp.android:id/paymentBtn").click();
		
		Thread.sleep(1000);
		
		driver.findElementById("com.saucelabs.mydemoapp.android:id/shoopingBt").click();
	}
}

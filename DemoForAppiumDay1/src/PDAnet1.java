import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class PDAnet1 {
	AndroidDriver driver;
	@Test
	public void testApp() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("deviceName", "GYQCFMWOYLU8T84P");
		capabilities.setCapability("platformVersion", "5.0.2");
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability("appPackage", "com.pdanet");
		capabilities.setCapability("appActivity", "com.foxfi.HotspotSettings");
		
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//		Thread.sleep(3000);
		WebElement ele=driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"android:id/checkbox\")");
		ele.click();
		//android:id/checkbox
		//Thread.sleep(15000);
		driver.quit();
		
	}
}

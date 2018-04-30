import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
public class DragNDrop1 {

	AndroidDriver driver;
	
	@Test
	public void testApp() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("deviceName", "GYQCFMWOYLU8T84P");
		capabilities.setCapability("platformVersion", "5.0.2");
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		driver.findElement(By.name("Basic usage playground")).click();
		driver.findElementByAndroidUIAutomator("uiSelector().text(\"Basic usage playground\")").click();
		WebElement ele1=(WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(1);
		
		WebElement ele2=(WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(5);
		
		TouchAction action=new TouchAction(driver);
		
		//action.longPress(x, y)
		//action.longPress(ele1).moveTo(x, y)
		
		action.longPress(ele1).moveTo(ele2).release().perform();
		
		Thread.sleep(10000);
		driver.quit();
	}
}

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Swipe3 {
	AndroidDriver driver;
	Dimension size;
	
	@Test
	public void testApp() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("deviceName", "GYQCFMWOYLU8T84P");
		capabilities.setCapability("platformVersion", "5.0.2");
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability("appPackage", "com.fortysevendeg.android.swipelistview");
		capabilities.setCapability("appActivity", "com.fortysevendeg.android.swipelistview.sample.activities.SwipeListViewExampleActivity");
		
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		size=driver.manage().window().getSize();
		System.out.println(size);
		
		
		int x1=(int)(size.width*0.20);
		int x2=(int)(size.width*0.80);
		
		WebElement ele1 = (WebElement) driver.findElements(By.id("com.fortysevendeg.android.swipelistview:id/front")).get(2);
		
	//	driver.swipe(startx, starty, endx, endy, duration);
		
		TouchAction action=new TouchAction(driver);
		
		action.longPress(ele1).moveTo(x1, 580).release().perform();
		
		WebElement ele2=(WebElement) driver.findElements(By.id("com.fortysevendeg.android.swipelistview:id/back")).get(2);
		Thread.sleep(6000);
		
		action.longPress(ele2).moveTo(x2,680).release().perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
	

}

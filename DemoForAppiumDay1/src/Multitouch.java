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

public class Multitouch {
	AndroidDriver driver;
	Dimension size;
	
	@Test
	public void testApp() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("deviceName", "GYQCFMWOYLU8T84P");
		capabilities.setCapability("platformVersion", "5.0.2");
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability("appPackage", "com.the511plus.MultiTouchTester");
		capabilities.setCapability("appActivity", "com.the511plus.MultiTouchTester.MultiTouchTester");
		
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		size=driver.manage().window().getSize();
		System.out.println(size);
		
		int x1=(int)(size.width*0.20);
		int y1=(int)(size.height*0.20);
		
		int x2=(int)(size.width*0.80);
		int y2=(int)(size.height*0.20);
		
		int x3=(int)(size.width*0.20);
		int y3=(int)(size.height*0.80);
		
		int x4=(int)(size.width*0.80);
		int y4=(int)(size.height*0.80);
		
		int x5=(int)(size.width*0.50);
		int y5=(int)(size.height*0.50);
		
		MultiTouchAction maction=new MultiTouchAction(driver);
		
		TouchAction T1=new TouchAction(driver).longPress(x1, y1).waitAction(1500);
		
		TouchAction T2=new TouchAction(driver).longPress(x2, y2).waitAction(1500);
		
		TouchAction T3=new TouchAction(driver).longPress(x3, y3).waitAction(1500);
		
		TouchAction T4=new TouchAction(driver).longPress(x4, y4).waitAction(1500);
		
		TouchAction T5=new TouchAction(driver).longPress(x5, y5).waitAction(1500);
		
		maction.add(T1).add(T2).add(T3).add(T4).add(T5).perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}

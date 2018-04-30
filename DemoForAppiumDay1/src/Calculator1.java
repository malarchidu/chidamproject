import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
public class Calculator1 {
	WebDriver driver;
	@Test
	public void testApp() throws MalformedURLException, InterruptedException
	{
	
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("deviceName", "GYQCFMWOYLU8T84P");
		capabilities.setCapability("platformVersion", "5.0.2");
		capabilities.setCapability("platformName", "Android");
		
	
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("+")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text='2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.android.calculator2:id/eq")).click();
		
		Thread.sleep(8000);
		driver.quit();
		
}
}

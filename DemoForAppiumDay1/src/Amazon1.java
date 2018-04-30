
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

	

public class Amazon1{

	WebDriver driver;
	
	@SuppressWarnings("rawtypes")
	@Test
	public void testApp() throws MalformedURLException, InterruptedException
	{
		File app=new File("C:\backupfilesfromphone/com.amazon.mShop.android.shopping.apk");
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("deviceName", "GYQCFMWOYLU8T84P");
		capabilities.setCapability("platformVersion", "5.0.2");
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability("app",app.getAbsolutePath());
		
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(8000);
		driver.quit();
		
	}
//	@Test
//	public void testApp() throws MalformedURLException, InterruptedException
//	{
//File app=new File("C:/backupfilesfromphone/com.amazon.mShop.android.shopping.apk");
//		
//		DesiredCapabilities capabilities=new DesiredCapabilities();
//		capabilities.setCapability("deviceName", "GYQCFMWOYLU8T84P");
//		capabilities.setCapability("platformVersion", "5.0.2");
//		capabilities.setCapability("platformName", "Android");
//		
//	//	capabilities.setCapability("app",app.getAbsolutePath());
//		
//		capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
//		capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
//		
//		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
//		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		Thread.sleep(8000);
//		driver.quit();
//		
//	}
}

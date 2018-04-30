import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
public class Message2 {

	AndroidDriver driver;
	@Test
	public void testApp() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("deviceName", "GYQCFMWOYLU8T84P");
		capabilities.setCapability("platformVersion", "5.0.2");
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability("appPackage", "com.android.mms");
		capabilities.setCapability("appActivity", "com.android.mms.ui.ConversationList");
		
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.android.mms:id/action_compose_new\")").click();
		
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.android.mms:id/recipients_editor\")").sendKeys("123");
		
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.android.mms:id/embedded_text_editor\")").sendKeys("Hello Team");
		Thread.sleep(5000);
		driver.hideKeyboard();
		
		//use javaclient 3.2 to be able to work with scrool
		Thread.sleep(5000);
		driver.quit();
	}
}

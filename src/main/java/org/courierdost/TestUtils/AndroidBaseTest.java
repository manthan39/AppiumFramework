package org.courierdost.TestUtils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.courierdost.pageObjects.android.FormPage;
import org.courierdost.utils.AppiumUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AndroidBaseTest extends AppiumUtils{

	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass(alwaysRun=true)
	public void ConfigureAppium() throws IOException
	{
		DesiredCapabilities flutterCapabilities = new DesiredCapabilities();
         flutterCapabilities.setCapability( "appium:deviceName", "Samsung Galaxy S22 Ultra" );
	        flutterCapabilities.setCapability( "platformName", "android" );
	        flutterCapabilities.setCapability( "platformVersion", "12.0" );
	        flutterCapabilities.setCapability("appium:automationName", "uiAutomator2");
           flutterCapabilities.setCapability("app", "bs://eaf1fbfd89947ebe34803e560b42102d1c53f39c"); 
	        flutterCapabilities.setCapability("browserstack.user", "manthanbhatiya_JpmQqv"); 
	        flutterCapabilities.setCapability("browserstack.key", "Yu9uH66YoTCAYrD3AZc1"); 
     
   //     flutterCapabilities.setCapability("appium:app",System.getProperty("user.dir")+"//src//test//java//org//courierdost//resources//General-Store.apk");
        driver = new AndroidDriver(new URL("https://hub-cloud.browserstack.com/wd/hub"), flutterCapabilities);
		
	//	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	


	
	@AfterClass(alwaysRun=true)
	public void tearDown()
	{
		driver.quit();
		}
	
}

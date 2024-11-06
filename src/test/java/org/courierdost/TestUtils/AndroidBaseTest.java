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
	public FormPage formPage;
	
	@BeforeClass(alwaysRun=true)
	public void ConfigureAppium() throws IOException
	{
		DesiredCapabilities flutterCapabilities = new DesiredCapabilities();
        flutterCapabilities.setCapability( "appium:deviceName", "Pixel 8 Pro API 30" );
        flutterCapabilities.setCapability( "platformName", "Android" );
     
        flutterCapabilities.setCapability("appium:automationName", "uiAutomator2");
        
     
        flutterCapabilities.setCapability("appium:app",System.getProperty("user.dir")+"//src//test//java//org//courierdost//resources//General-Store.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), flutterCapabilities);
		
	//	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 formPage= new FormPage(driver);
	}
	
	


	
	@AfterClass(alwaysRun=true)
	public void tearDown()
	{
		driver.quit();
		}
	
}

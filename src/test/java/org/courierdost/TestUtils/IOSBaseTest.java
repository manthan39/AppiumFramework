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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.courierdost.pageObjects.ios.HomePage;
import org.courierdost.utils.AppiumUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class IOSBaseTest extends AppiumUtils{

	public IOSDriver driver;
	public AppiumDriverLocalService service;
	public HomePage homePage;
	
	@BeforeClass
	public void ConfigureAppium() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//org//courierdost//resources//data.properties");
				
		prop.load(fis);
		String ipAddress = prop.getProperty("ipAddress");
		String port = prop.getProperty("port");
			
	//	service = startAppiumServer(ipAddress,Integer.parseInt(port));
			
				XCUITestOptions	 options = new XCUITestOptions();	
				options.setDeviceName("iPhone 16 Pro");
				options.setApp(System.getProperty("user.dir")+"//src//test//java//org//courierdost//resources//Runner.app");
				
				///Users/bhagatsinhk/Documents/bgtkher002/AppiumFramework/src/test/java/org/courierdost/resources
				options.setPlatformVersion("18.1");
				//Appium- Webdriver Agent -> IOS Apps.
				options.setWdaLaunchTimeout(Duration.ofSeconds(20));
				options.setCapability("autoAcceptAlerts", true);
				
			 driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			 
	}
	
	
	

	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		}
	
}

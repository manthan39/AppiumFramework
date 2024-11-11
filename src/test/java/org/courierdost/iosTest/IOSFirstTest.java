package org.courierdost.iosTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.courierdost.TestUtils.IOSBaseTest;
import org.courierdost.pageObjects.ios.AlertViews;
import org.openqa.selenium.By;
import org.testng.Assert;
import io.appium.java_client.AppiumBy;
import static interfaces.ClassObjects.*;


public class IOSFirstTest extends IOSBaseTest{

	
	@Test
	public void IOSBasicsTest()
	{
		//Xpath, classname, IOS, iosClassCHain, IOSPredicateString, accessibility id, id
		
		AlertViews alertViews = homePageObj.selectAlertViews();
		alertViewsObj.fillTextLabel("hello");
		String actualMessage = alertViewsObj.getConfirmMessage();
		AssertJUnit.assertEquals(actualMessage, "A message should be a short, complete sentence.");

		
		
		
		
		
		
		
	}
}

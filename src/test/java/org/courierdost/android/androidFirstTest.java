package org.courierdost.android;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.courierdost.TestUtils.AndroidBaseTest;
import org.courierdost.pageObjects.android.FormPage;
import org.courierdost.pageObjects.android.FormPage;


public class androidFirstTest extends AndroidBaseTest 
	
{
	FormPage fp;
	
	
	@Test
	public void FillForm(){
	fp = new FormPage(driver);
	fp.setNameField("manthan");
	fp.setGender("Male");
	fp.setCountrySelection("Brazil");
}

/*@BeforeMethod(alwaysRun=true)
public void preSetup()
{

	fp.setActivity();
			
}*/
}

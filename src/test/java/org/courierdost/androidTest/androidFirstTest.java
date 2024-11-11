package org.courierdost.androidTest;
import org.courierdost.TestUtils.AndroidBaseTest;
import org.testng.annotations.Test;
import static interfaces.ClassObjects.*;
public class androidFirstTest extends AndroidBaseTest 

{
	@Test
	public void FillForm(){
	formPageObj.setNameField("manthan");
	formPageObj.setGender("Male");
	formPageObj.setCountrySelection("Brazil");
}

/*@BeforeMethod(alwaysRun=true)
public void preSetup()
{

	formPage.setActivity();
			
}*/
}

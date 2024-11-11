package org.courierdost;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.courierdost.TestUtils.AndroidBaseTest;
import org.courierdost.pageObjects.android.LoginPage;

public class LoginTest extends AndroidBaseTest  {
	LoginPage LP;
	
	@Test
	public void loginAsVendor() throws InterruptedException {
		LP = new LoginPage(driver);
		LP.clickNextButton();
		LP.clickNextButton();
		LP.clickNextButton();
		//LP.clickProceed();
		LP.clickGSTNumberFieldAndSendNumber("36AABCU9355J1ZH");
		LP.clickProceed();
		LP.fillCompanyDetails();
		LP.fillOTP("1234");
		LP.addfirstpin("1234");
		LP.addReEnterpin("1234");
		LP.savePinAndContinue();
	}
	
}

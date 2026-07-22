package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	@Test(groups= {"Sanity","Master"})
	public void loginTest() {
		logger.info ("***** Starting TC002_LoginTest *****");
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clkclick();
		
		MyAccountPage mp = new MyAccountPage(driver);
		
		Assert.assertTrue(mp.targetPage(),"MyAccount is not visible");
		}catch(Exception e) {
			Assert.fail(e.getMessage());
		}
		
		logger.info ("***** Finished TC002_LoginTest *****");
	}

}

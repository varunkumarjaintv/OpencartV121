package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC012_MyAccountInformationTest extends BaseClass {
	
	@Test
	public void verifyMyAccountInformation() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clkclick();
		
		Thread.sleep(3000);
		
		hp.clickMyAccount();
		hp.clickOptionMyAccount();
		
		MyAccountPage mp = new MyAccountPage(driver);
		mp.clkEditAccount();
		Assert.assertTrue(mp.isMyAccountInformationDisplayed(), "My Account Information is not displaying");
	}
}

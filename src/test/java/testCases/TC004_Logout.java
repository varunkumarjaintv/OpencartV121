package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC004_Logout extends BaseClass {

	@Test
	public void logOutFunctionality() {
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();

			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clkclick();

			MyAccountPage mp = new MyAccountPage(driver);
			Assert.assertTrue(mp.targetPage(), "My account is not visible");

			hp.clickMyAccount();
			hp.clicklogout();
			mp.clickContinue();

			Assert.assertTrue(hp.isHomePageLogoVisible(), "Homepage logo is not visible");
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}

	}
}

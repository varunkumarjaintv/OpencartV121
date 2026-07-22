package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass {

	@Test(dataProvider = "loginDDT", dataProviderClass = DataProviders.class)
	public void verify_LoginDDT(String email, String pass, String exp) {
		logger.info("***** starting TC003_LoginDDT *****");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();

			LoginPage lp = new LoginPage(driver);
			lp.setEmail(email);
			lp.setPassword(pass);
			lp.clkclick();

			MyAccountPage ma = new MyAccountPage(driver);
			boolean targetPage = ma.targetPage();

			if (exp.equalsIgnoreCase("valid")) {
				if (targetPage == true) {
					ma.clickLogout();
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			} else if (exp.equalsIgnoreCase("Invalid")) {
				if (targetPage == true) {
					ma.clickLogout();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}
		} catch (Exception e) {
			Assert.fail("an error accured" + e.getMessage());
		}
		logger.info("***** finishing TC003_LoginDDT *****");
	}
}

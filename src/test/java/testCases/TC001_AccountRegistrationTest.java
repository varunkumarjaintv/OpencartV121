package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{

	@Test(groups={"Regression","Master"})
	public void verify_Account_Registration() {

		logger.info("****** Starting TC001_AccountRegistrationTest ******");
		try {
		HomePage hp = new HomePage(driver);
		
		logger.info("Clicked on MyAccount Link.. ");
		hp.clickMyAccount();
		
		logger.info("Clicked on Register Link.. ");
		hp.clickRegister();

		AccountRegistrationPage ar = new AccountRegistrationPage(driver);
		logger.info("Providing customer details...");
		ar.setFirstName(randomString());
		ar.setLastname(randomString());
		ar.setEmail(randomString()+"@gmail.com");
		ar.setTelephoneNum(randomNum());
		String password = alphaNumeric()+"@#";
		ar.setPassword(password);
		ar.setConfirmPassword(password);
		ar.setPrivacyPolicy();
		ar.clickContinue();
		
		logger.info("Validating expected message..");
		String confMsg = ar.getConfirmationMsg();
		Assert.assertEquals(confMsg, "Your Account Has Been Created!", "Confirmation message mismatch");
		
		logger.info("Test passed");

	}
		catch(Exception e) {
			logger.error("Test failed :"+e.getMessage());
			Assert.fail("Test failed :"+e.getMessage());
		}
		finally {
			logger.info("***** Finished TC001_AccountRegistrationTest *****");
		}
	}
}

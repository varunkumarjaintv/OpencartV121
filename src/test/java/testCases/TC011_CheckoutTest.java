package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.SearchPage;
import PageObjects.ShoppingCartPage;
import testBase.BaseClass;

public class TC011_CheckoutTest extends BaseClass {
	
	@Test
	public void checkoutTest() {
		logger.info("****** Starting TC011_CheckoutTest ********");
		try {
		HomePage hp = new HomePage(driver);
		hp.enterProductName("imac");
		hp.clickSearch();
		
		SearchPage sp = new SearchPage(driver);
		sp.clickAddToCart();
		
		Assert.assertTrue(sp.getShoppingCartSuccessMessage().contains("Success: You have added iMac to your shopping cart!"));
		sp.clicklnkShoppingcart();
		
		ShoppingCartPage sc = new ShoppingCartPage(driver);
		sc.clickbtnCheckout();
		
		Assert.assertTrue(sc.isImageisVisible());
		}catch(Exception e) {
			Assert.fail(e.getMessage());
		}
		logger.info("****** Finishing TC011_CheckoutTest ********");

	}
}

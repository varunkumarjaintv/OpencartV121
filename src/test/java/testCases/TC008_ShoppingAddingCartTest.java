package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ImacProductPage;
import PageObjects.SearchPage;
import PageObjects.ShoppingCartPage;
import testBase.BaseClass;

public class TC008_ShoppingAddingCartTest extends BaseClass {
	
	@Test
	public void ShoppingAddingCart() {
		logger.info("***** Starting TC008_ShoppingAddingCartTest *****");
		try {
		HomePage hp = new HomePage(driver);
		hp.enterProductName("imac");
		hp.clickSearch();

		SearchPage sp = new SearchPage(driver);
		sp.clickImac();
		
		ImacProductPage ip = new ImacProductPage(driver);
		ip.clkAddtoCart();
		
		Assert.assertTrue(ip.cartAddedSuccesMsg().contains("Success: You have added iMac to your shopping cart!"));
		
		ip.clkLnkShoppingCart();
		
		ShoppingCartPage sc = new ShoppingCartPage(driver);
		
		Assert.assertTrue(sc.isImageisVisible());
		}catch(Exception e) {
			Assert.fail(e.getMessage());
		}
		
		logger.info("***** Finishing TC008_ShoppingAddingCartTest *****");
	}
}

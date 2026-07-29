package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ImacProductPage;
import PageObjects.SearchPage;
import PageObjects.ShoppingCartPage;
import testBase.BaseClass;

public class TC010_ShoppingCartToHomePageTest extends BaseClass {
	
	@Test
	public void ShoppingcartToHomepage() {
		
		logger.info("***** Starting TC010_ShoppingAddingCartTest *****");
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
		sc.clkContinueShopping();
		
		Assert.assertTrue(hp.isHomePageLogoVisible());
		
		}catch(Exception e) {
			Assert.fail(e.getMessage());
		}
		
		logger.info("***** Finishing TC010_ShoppingAddingCartTest *****");	
	}
}

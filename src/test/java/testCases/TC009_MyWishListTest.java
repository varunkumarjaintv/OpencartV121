package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ImacProductPage;
import PageObjects.LoginPage;
import PageObjects.MyWishListPage;
import PageObjects.SearchPage;
import testBase.BaseClass;

public class TC009_MyWishListTest extends BaseClass {
	
	@Test
	public void myWishList() {
		
		logger.info("****** starting TC009_MyWishListTest ********");

		try {
//		HomePage hp = new HomePage(driver);
//		hp.enterProductName("imac");
//		hp.clickSearch();
			
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clkclick();
			
			Thread.sleep(3000);
			
			hp.enterProductName("imac");
			hp.clickSearch();

		SearchPage sp = new SearchPage(driver);
		sp.clickImac();

		ImacProductPage ip = new ImacProductPage(driver);
		Assert.assertEquals(ip.getbtnWishlistmsg(), "Add to Wish List", "Add to Wish List IS NOT VISIBLE");
		ip.clkAddtoWishList();
		Assert.assertTrue(ip.wishlistAddedSuccessMsg().contains("Success: You have added iMac to your wish list!"));
		
		ip.clkLnkWishList();
		
		MyWishListPage wp = new MyWishListPage(driver);
		Assert.assertEquals(wp.msgMyWishList(),"My Wish List");
		}catch(Exception e) {
			Assert.fail(e.getMessage());
		}
		logger.info("****** finishing TC009_MyWishListTest ********");

	}
}

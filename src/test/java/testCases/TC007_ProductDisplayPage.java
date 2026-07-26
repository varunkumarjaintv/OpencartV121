package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ImacProductPage;
import PageObjects.SearchPage;
import testBase.BaseClass;

public class TC007_ProductDisplayPage extends BaseClass {

	@Test()
	public void productdisplaypage() {

		logger.info("****** starting TC007_ProductDisplayPage ********");

		try {
			HomePage hp = new HomePage(driver);
			hp.enterProductName("imac");
			hp.clickSearch();

			SearchPage sp = new SearchPage(driver);
			sp.clickImac();

			ImacProductPage ip = new ImacProductPage(driver);
			ip.clickImgImac();

			Assert.assertTrue(ip.isImacimageVisible(), "imc img is not visible");

			ip.navigateThroughProductImages();
			
			Assert.assertTrue(ip.isProductPageVisible(), "product page is not visible");

			ip.clickImacimg2();

			ip.navigateThroughProductImages();
			
			Assert.assertTrue(ip.isProductPageVisible(), "product page is not visible");
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}

		logger.info("******* finishing TC007_ProductDisplayPage ******");

	}
}

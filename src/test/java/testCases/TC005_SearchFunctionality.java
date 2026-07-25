package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.SearchPage;
import testBase.BaseClass;

public class TC005_SearchFunctionality extends BaseClass {

	@Test(groups = {"Master"})
	public void searchProduct() {
		logger.info("***** TC005_SearchFunctionality *****");

		try {
			HomePage hp = new HomePage(driver);
			hp.enterProductName("imac");
			hp.clickSearch();
			SearchPage sp = new SearchPage(driver);
			Assert.assertEquals(sp.productExists(), "iMac");
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		logger.info("***** TC005_SearchFunctionality *****");
	}
}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ImacProductPage;
import PageObjects.ProductComparison;
import PageObjects.SearchPage;
import testBase.BaseClass;

public class TC006_ProductCompare extends BaseClass{
	
	@Test
	public void validateProductComparision() {
		logger.info("***** StartingTC006_ProductCompare *****");
		try {
		HomePage hp = new HomePage(driver);
		hp.enterProductName("imac");
		hp.clickSearch();

		SearchPage sp = new SearchPage(driver);
		sp.clickImac();
		
		ImacProductPage ip = new ImacProductPage(driver);
		Assert.assertEquals(ip.isComapareThisProductbtnAvailable(), "Compare this Product");
		ip.clickComapareThisProduct();
		
		Assert.assertTrue(ip.productComparisonValidation().contains("Success: You have added iMac to your product comparison!"));
		
		ip.clickproductComparison();
		
		ProductComparison pc = new ProductComparison(driver);
		Assert.assertEquals(pc.validateProductComparison(), "Product Comparison");
		}catch(Exception e) {
			Assert.fail(e.getMessage());
		}
		logger.info("***** closingTC006_ProductCompare *****");
	}
}

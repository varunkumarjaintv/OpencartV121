package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ImacProductPage extends BasePage {

	public ImacProductPage(WebDriver driver) {
		super(driver);
	}
	
	Actions act;

	@FindBy(xpath = "//div[@class='btn-group']//button[2]")
	WebElement btnComapare;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement msgSuccessAddedtoProductComparsion;

	@FindBy(xpath = "//a[normalize-space(.)='product comparison']")
	WebElement lnkproductComparison;

	@FindBy(xpath = "//li[1]//a[1]//img[1]")
	WebElement imgImac;

	@FindBy(xpath = "//button[@title='Next (Right arrow key)']")
	WebElement btnForwardNext;

	@FindBy(xpath = "//button[@title='Previous (Left arrow key)']")
	WebElement btnbackwordNext;
	
	@FindBy(xpath = "//img[@class='mfp-img']")
	WebElement imgBigImac;

	@FindBy(xpath = "//div[@class='mfp-counter']")
	WebElement imgCount;
	
	@FindBy(xpath = "//h1[normalize-space(.)='iMac']")
	WebElement ProductPage;
	
	@FindBy(xpath = "//li[2]//a[1]//img[1]")
	WebElement imacimg2;
	
	@FindBy (xpath = "//button[@id='button-cart']")
	WebElement btnAddtoCart;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement msgSuccessAddedtoCart;
	
	@FindBy (xpath = "//a[normalize-space(.)='shopping cart']")
	WebElement lnkShoppingCart;
	
	@FindBy (xpath = "//div[@id='product-product']//div[@class='btn-group']//button[1]")
	WebElement btnWishList;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement msgSuccessAddedtoWishlist;
	
	@FindBy (xpath = "//a[normalize-space(.)='wish list']")
	WebElement linkWishList;
	


	public String isComapareThisProductbtnAvailable() {
		return btnComapare.getAttribute("data-original-title");
	}

	public void clickComapareThisProduct() {
		act = new Actions(driver);
		act.moveToElement(btnComapare).click().build().perform();
	}

	public String productComparisonValidationmsg() {
		return msgSuccessAddedtoProductComparsion.getText();
	}

	public void clickproductComparison() {
		lnkproductComparison.click();
	}

	public void clickImgImac() {
		imgImac.click();
	}
	
	public boolean isImacimageVisible() throws Exception {
		Thread.sleep(3000);
		return imgBigImac.isDisplayed();
	}

	public void navigateThroughProductImages() throws InterruptedException {

		String imgcount = imgCount.getText(); 
		String[] actcount = imgcount.split(" of "); 
		int count = Integer.parseInt(actcount[1]); 
		Thread.sleep(4000);
		for (int i = 1; i < count; i++) { 
			btnForwardNext.click();
			Thread.sleep(2000);
			} 
		for (int i = 1; i < count; i++) {
			btnbackwordNext.click(); 
			Thread.sleep(2000);
			} 
		new Actions(driver).sendKeys(Keys.ESCAPE).build().perform(); }
	
	public void clickImacimg2() {
		imacimg2.click();
	}
	
	public boolean isProductPageVisible() {
		return ProductPage.isDisplayed();
	}
	
	public void clkAddtoCart() {
		btnAddtoCart.click();
	}
	
	public String cartAddedSuccesMsg() {
		return msgSuccessAddedtoCart.getText();
	}
	
	public void clkLnkShoppingCart() {
		lnkShoppingCart.click();
	}
	
	public String getbtnWishlistmsg() {
		return btnWishList.getAttribute("data-original-title");
	}
	
	public void clkAddtoWishList() {
		btnWishList.click();
	}
	
	public String wishlistAddedSuccessMsg() {
		return msgSuccessAddedtoWishlist.getText();
	}
	
	public void clkLnkWishList() {
		linkWishList.click();
	}
	
}

package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
	
	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[normalize-space(.)='iMac']")
	WebElement txtImac;
	
	@FindBy(xpath = "//span[normalize-space(.)='Add to Cart']")
	WebElement lnkAddToCart;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement txtSuccessMsgAddedToShoppingCart;
	
	@FindBy(xpath = "//a[normalize-space(.)='shopping cart']")
	WebElement lnkShoppingcart;
	
	public String productExists() {
		return txtImac.getText();
	}
	
	public void clickImac(){
		txtImac.click();
	}
	
	public void clickAddToCart() {
		lnkAddToCart.click();
	}
	
	public String getShoppingCartSuccessMessage() {
		return txtSuccessMsgAddedToShoppingCart.getText();
	}
	
	public void clicklnkShoppingcart() {
		lnkShoppingcart.click();
	}
}

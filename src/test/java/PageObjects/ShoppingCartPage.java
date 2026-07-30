package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id='content']/form/div/table/tbody/tr/td[1]/a/img")
	WebElement shoppingCartImageValidation;
	
	@FindBy(xpath = "//a[normalize-space(.)='Continue Shopping']")
	WebElement btnContinueShopping;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement btnCheckout;
	
	public boolean isImageisVisible() {
		return shoppingCartImageValidation.isDisplayed();
	}
	
	public void clkContinueShopping() {
		btnContinueShopping.click();
	}
	
	public void clickbtnCheckout() {
		btnCheckout.click();
	}

}

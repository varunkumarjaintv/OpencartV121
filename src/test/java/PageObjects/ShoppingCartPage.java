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
	
	public boolean isImageisVisible() {
		return shoppingCartImageValidation.isDisplayed();
	}

}

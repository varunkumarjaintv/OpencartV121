package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWishListPage extends BasePage  {

	public MyWishListPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = "//h2[normalize-space(.)='My Wish List']")
	WebElement msgWishList;
	
	public String msgMyWishList() {
		return msgWishList.getText();
	}
	
}

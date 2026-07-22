package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h2[normalize-space(.)='My Account']")
	WebElement destinationPage;

	@FindBy(xpath = "//a[normalize-space(.)='Logout' and @class='list-group-item']")
	WebElement btnLogout;

	public boolean targetPage() {
		try {
			return destinationPage.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void clickLogout() {
		btnLogout.click();
	}

}

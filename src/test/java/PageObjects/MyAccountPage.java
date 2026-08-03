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
	
	@FindBy(xpath = "//a[normalize-space(.)='Continue']")
	WebElement btnContinue;
	
	@FindBy (xpath = "//a[normalize-space(.)='Edit Account']")
	WebElement lnkEditAccount;
	
	@FindBy (xpath="//h1[normalize-space(.)='My Account Information']")
	WebElement txtMyAccountInformation;
	

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

	public void clickContinue() {
		btnContinue.click();
	}
	
	public void clkEditAccount() {
		lnkEditAccount.click();
	}
	
	public boolean isMyAccountInformationDisplayed() {
		return txtMyAccountInformation.isDisplayed();
	}
	
}

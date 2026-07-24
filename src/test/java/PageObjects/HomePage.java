package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[normalize-space(.)='Qafox.com']")
	WebElement homepageLogo;
	
	@FindBy(xpath = "//span[normalize-space(.)='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath = "//a[normalize-space(.)='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath = "//a[normalize-space(.)='Login']")
	WebElement lnkLogin;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//li[5]")
	WebElement lnklogout;
	
	public boolean isHomePageLogoVisible() {
		return homepageLogo.isDisplayed();
	}
	
	public void clickMyAccount() {
		lnkMyAccount.click();
	}
	
	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin() {
		lnkLogin.click();
	}
	
	public void clicklogout() {
		lnklogout.click();
	}
}

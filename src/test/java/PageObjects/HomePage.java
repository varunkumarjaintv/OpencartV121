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
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement txtSearch;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	WebElement btnSearch;
	
	@FindBy (xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a")
	WebElement lnkoptionMyAccount;
	
	
	
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
	
	public void enterProductName(String pname) {
		txtSearch.sendKeys(pname);
	}
	
	public void clickSearch() {
		btnSearch.click();
	}
	
	public void clickOptionMyAccount() {
		lnkoptionMyAccount.click();
	}
}

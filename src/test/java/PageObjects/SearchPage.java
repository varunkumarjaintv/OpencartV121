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
	
	public String productExists() {
		return txtImac.getText();
	}
	
	public void clickImac(){
		txtImac.click();
	}
}

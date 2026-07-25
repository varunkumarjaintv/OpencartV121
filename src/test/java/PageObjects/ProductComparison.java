package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparison extends BasePage {

	public ProductComparison(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h1[normalize-space(.)='Product Comparison']")
	WebElement txtProductComparison;
	
	public String validateProductComparison() {
		return txtProductComparison.getText();
	}
	
}

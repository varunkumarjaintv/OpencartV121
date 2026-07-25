package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ImacProductPage extends BasePage{

	public ImacProductPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='btn-group']//button[2]")
	WebElement btnComapare;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement msgSuccess;
	
	@FindBy(xpath = "//a[normalize-space(.)='product comparison']")
	WebElement lnkproductComparison;
	
	public String isComapareThisProductbtnAvailable() {
		return btnComapare.getAttribute("data-original-title");
	}
	
	public void clickComapareThisProduct() {
		Actions act = new Actions(driver);
		act.moveToElement(btnComapare).click().build().perform();
	}
	
	public String  productComparisonValidation() {
		return msgSuccess.getText();
	}
	
	public void clickproductComparison(){
		lnkproductComparison.click();
	}
	
}

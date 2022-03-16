package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckoutPage {
	
	
	By cartbag=By.xpath("//img[@alt='Cart']");
	By checkout =By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	By promocode=By.xpath("//input[@class='promoCode']");
	By promobtn=By.xpath("//button[@class='promoBtn']");
	By placeorder= By.xpath("//button[text()='Place Order']");
	By productname=By.xpath("//p[@class='product-name']");
	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getProductName() {
		return driver.findElement(productname).getText();
	}
	
	public void checkout() {
		
		driver.findElement(cartbag).click();
		driver.findElement(checkout).click();
		
	}
	
	public boolean verifyPromobtn() {

		return driver.findElement(promobtn).isDisplayed();
		
	}
	public boolean verifyPlaceOrder() {
		
		
		return driver.findElement(placeorder).isDisplayed();
		
	}
}


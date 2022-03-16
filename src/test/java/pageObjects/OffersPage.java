package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	

	By search= By.xpath("//input[@type='search']");
	By productname=By.cssSelector("tr td:nth-child(1)");
	
	
	public WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void searchitem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName() {
		return driver.findElement(productname).getText();
	}
	
	
	
}

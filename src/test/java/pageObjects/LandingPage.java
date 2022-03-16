package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LandingPage {
	
	
	By search= By.xpath("//input[@type='search']");
	By productname= By.xpath("//h4[@class='product-name']");
	By topdeals=By.xpath("//a[text()='Top Deals']");
	By count= By.xpath("//a[@class='increment']");
	By addtocart=By.xpath("//button[text()='ADD TO CART']");
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void searchitem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName() {
		return driver.findElement(productname).getText();
	}
	
	public void selecttopdeals() {
		driver.findElement(topdeals).click();
	}
	

	public void increment(int quantity) {
		
		int i=quantity-1;
		while(i>0) {
			
			driver.findElement(count).click();
			i--;
			
		}
			
	}
	
	public void addtocart() {
	
		driver.findElement(addtocart).click();
	}

	public String getTitleLAndingPage() {
		
		return driver.getTitle();
	}
}


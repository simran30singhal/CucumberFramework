package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectsManager {
	
	public LandingPage landingpage;
	public OffersPage offerspage;
	public CheckoutPage checkoutPage;
	public WebDriver driver;
	
	public PageObjectsManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LandingPage getLandingPageObject() {
		return landingpage=new LandingPage(driver);
	}
	
	public OffersPage getOffersPageObject() {
		return offerspage=new OffersPage(driver);
	}
	
	public CheckoutPage getCheckoutPageObject() {
		return checkoutPage=new CheckoutPage(driver);
	}
}

package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.CheckoutPage;
import utils.TestContextSetup;

public class checkoutDefinitions {
	
	WebDriver driver;
	public CheckoutPage checkoutpage;
	public String checkoutproductname;
	TestContextSetup textcontextsetup;
	
	public checkoutDefinitions(TestContextSetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
		this.checkoutpage=textcontextsetup.pageobject.getCheckoutPageObject();
	}
	
	@Then("User proceed to Checkout")
	public void User_proceed_to_Checkout() throws InterruptedException {
		
		checkoutpage.checkout();
		Thread.sleep(2000);
		//String checkoutproductname=checkoutpage.getProductName();
		//Assert.assertEquals(name,textcontextsetup.checkoutproductname);
		//Assertion to validate the product name and compare with string name 
	}
	
	@Then("Verify user has ability to enter promo code  and place the order")
	public void Verify_user_has_ability_to_enter_promo_code() {
		
		Assert.assertTrue(checkoutpage.verifyPromobtn());
		Assert.assertTrue(checkoutpage.verifyPlaceOrder());
	}
}


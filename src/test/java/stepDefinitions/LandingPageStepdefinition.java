package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import utils.TestContextSetup;


public class LandingPageStepdefinition {
	
	WebDriver driver;
	public String landingproductName;
	LandingPage landingpage;
	TestContextSetup textcontextsetup;
	
	public LandingPageStepdefinition(TestContextSetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
		//this.landingpage=textcontextsetup.pageobject.getLandingPageObject();
	}
	
	@Given("User is on GreenKart landing page")
	public void user_is_on_green_kart_landing_page() {
	    
		landingpage=textcontextsetup.pageobject.getLandingPageObject();
		//textcontextsetup.testBase.WebDriverManager();
		Assert.assertTrue(landingpage.getTitleLAndingPage().contains("GreenKart"));
		
	}
	
	@When("^User searched with shortname (.+) and extracted the actual name of product$")
	public void user_searched_with_shortname_and_extracted_the_actual_name_of_product(String shortname) throws InterruptedException{
		
		landingpage=textcontextsetup.pageobject.getLandingPageObject();
		landingpage.searchitem(shortname);
		Thread.sleep(3000);

	    textcontextsetup.landingproductName= landingpage.getProductName().split("-")[0].trim();
	    System.out.println(textcontextsetup.landingproductName+" is extracted from Homepage");
	}
	
	@When("Added {string} items of the selected product to cart")
	public void Added_items_of_the_selected_product_to_cart(String quantity) {
		
		
		landingpage.increment(Integer.parseInt(quantity));
		landingpage.addtocart();
	}
}

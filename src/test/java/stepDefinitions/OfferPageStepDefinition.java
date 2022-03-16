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
import pageObjects.OffersPage;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
	
	TestContextSetup textcontextsetup;
	String offerproductname;
	public OfferPageStepDefinition(TestContextSetup textcontextsetup) {
		this.textcontextsetup= textcontextsetup;
	}
	
	@Then("^User searched for (.+) in offers page$")
	public void user_searched_for_in_offers_page(String shortname) throws InterruptedException {
		
		 switch_To_OfferPage();
	
		 OffersPage offerpage=textcontextsetup.pageobject.getOffersPageObject();
		 offerpage.searchitem(shortname);
		 Thread.sleep(2000);
		 offerproductname=offerpage.getProductName();
	}
	
	public void switch_To_OfferPage() {
		
	
			LandingPage landingpage=textcontextsetup.pageobject.getLandingPageObject();
		   landingpage.selecttopdeals();
		   textcontextsetup.genericUtils.switchWindowToChild();
	}

	@And("validate product name in offers page matches with Landing page")
	public void validate_product_name_in_offers_page_matches_with_Landing_page() {
		
		Assert.assertEquals(offerproductname,textcontextsetup.landingproductName);
	}

}

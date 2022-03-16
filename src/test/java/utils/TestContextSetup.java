package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectsManager;



public class TestContextSetup {
	
	public WebDriver driver;
	public String landingproductName;
	public PageObjectsManager pageobject;
	public TestBase testBase;
	public GenericUtils genericUtils;
	public String checkoutproductname;
	
	public 	TestContextSetup() throws IOException {
		
		 testBase=new TestBase();
		 pageobject=new PageObjectsManager(testBase.WebDriverManager());
		 genericUtils= new GenericUtils(testBase.WebDriverManager());
}
}

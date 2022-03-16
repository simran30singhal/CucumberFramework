package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	
	TestContextSetup textcontextsetup;
	public Hooks(TestContextSetup textcontextsetup) {
		this.textcontextsetup=textcontextsetup;
	}
	@After
	public void AfterScenario() throws IOException {
		
		textcontextsetup.testBase.WebDriverManager().quit();;
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		
		WebDriver driver=textcontextsetup.testBase.WebDriverManager();
		if(scenario.isFailed()) {
			
			File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent= FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(filecontent,"image/png","image");
		}
	}
}

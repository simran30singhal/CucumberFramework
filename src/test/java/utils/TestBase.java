package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
		
	WebDriver driver;
	public WebDriver WebDriverManager() throws IOException {
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String URL=prop.getProperty("URL");
		if(driver==null) {
			
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
			
		}
		if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			//firefox code
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		
		}
		return driver;
	}
}

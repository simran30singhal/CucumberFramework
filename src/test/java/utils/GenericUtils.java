package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void switchWindowToChild() {
		   
		   Set<String> Window =driver.getWindowHandles();
		   Iterator<String> itr=Window.iterator();
		   String ParentWin=itr.next();
		String childWin=itr.next();
		driver.switchTo().window(childWin);
				
	}
}

package BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunch {

	public static void main(String[] args)
	{
		System.setProperty("Webdriver.gecko.driver", 
				"./BrowserDrivers/geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/");
	}

}

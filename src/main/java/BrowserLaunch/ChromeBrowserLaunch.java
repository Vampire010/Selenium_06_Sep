package BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {

	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.driver", 
		"C:\\Users\\giris\\eclipse-workspace-web\\Selenium_06_Sep\\BrowserDrivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");

	}

}

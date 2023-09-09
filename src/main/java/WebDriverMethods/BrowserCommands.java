package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) 
	{
		
		System.setProperty("Webdriver.chrome.driver", 
				"./BrowserDrivers/chromedriver.exe");
					
				WebDriver driver = new ChromeDriver();	
				//driver.get("https://parabank.parasoft.com/");
				driver.manage().window().maximize();

				driver.navigate().to("https://www.amazon.in/");
				
				
				String actualPageTitle = driver.getTitle();
				String actualPageUrl = driver.getCurrentUrl();
				System.out.println("Your Page Url: " + actualPageUrl);
				
				String actualPageSource = driver.getPageSource();
				System.out.println("Your Page Source: " + actualPageSource);



				
				String expectedPageTitle = actualPageTitle;

				if(actualPageTitle==expectedPageTitle)
				{
					System.out.println("You are on Expected Page: " + actualPageTitle);
				}
				else
				{
					System.out.println("You are Not on Expected Page: " + actualPageTitle);
				}
				
				driver.close();
	}

}

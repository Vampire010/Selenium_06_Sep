package WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample {

	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver", 
				"./BrowserDrivers/chromedriver.exe");
					
				WebDriver driver = new ChromeDriver();	
				//driver.get("https://parabank.parasoft.com/");
				driver.manage().window().maximize();

				driver.navigate().to("https://parabank.parasoft.com/parabank/about.htm");
				
				
				List<WebElement> allText =  driver.findElements(By.tagName("p"));
				
				if(allText.size()!=0)
				{
					for(WebElement pText : allText)
					{
						System.out.println(pText.getText());
					}
				}
				
				driver.close();
				
	}

}

package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\giris\\eclipse-workspace-web\\Selenium_06_Sep\\BrowserDrivers\\chromedriver.exe");
					
				WebDriver driver = new ChromeDriver();	
				//driver.get("https://parabank.parasoft.com/");
				
				driver.navigate().to("https://www.snapdeal.com/");
				
				
				driver.manage().window().maximize();
				
				//Click on Register link
				
				WebElement prd1 = driver.findElement(By.xpath("//*[@id='content_wrapper']/section/div[4]/section/div[2]/div[1]/div/div[5]/a/div[3]/div[1]"));
				
				String producttext = prd1.getText();
				System.out.print(producttext);
				
				prd1.click();
				
			
				//Thread.sleep(5000);
				
				//driver.close();
				
				driver.quit();
	}

}

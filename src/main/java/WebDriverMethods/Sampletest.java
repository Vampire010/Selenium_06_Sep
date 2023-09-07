package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", 
		"C:\\Users\\giris\\eclipse-workspace-web\\Selenium_06_Sep\\BrowserDrivers\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();	
		//driver.get("https://parabank.parasoft.com/");
		
		driver.navigate().to("https://parabank.parasoft.com/");
		
		
		driver.manage().window().maximize();
		
		//Click on Register link
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		
		//Enter First Name
		driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Sri");

		//Enter Last Name
		driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("Krishna");
		
		//Clear text in First Name		
		driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).clear();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		
		Thread.sleep(5000);

		driver.navigate().forward();
		
		Thread.sleep(5000);

		driver.navigate().refresh();
		
		
		
	}

}

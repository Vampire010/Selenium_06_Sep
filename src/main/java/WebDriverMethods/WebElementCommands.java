package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.driver", 
				"./BrowserDrivers/chromedriver.exe");
					
				WebDriver driver = new ChromeDriver();	
				//driver.get("https://parabank.parasoft.com/");
				driver.manage().window().maximize();

				driver.navigate().to("D:\\Selenium With java\\Selnium_Topics_vice_Notes\\2.Introduction to Selenium\\cura.html");
				
				WebElement hospital_readmission = driver.findElement(By.xpath("//*[@id=\"chk_hospotal_readmission\"]"));
				
				boolean ishospital_readmissionSelected = hospital_readmission.isSelected();
				System.out.println("ishospital_readmissionSelected: " + ishospital_readmissionSelected);
				
				
				boolean ishospital_readmissionDisplayed = hospital_readmission.isDisplayed();
				System.out.println("ishospital_readmissionDisplayed: " + ishospital_readmissionDisplayed);
				
				
				boolean ishospital_readmissionEnabled = hospital_readmission.isEnabled();
				System.out.println("ishospital_readmissionEnabled: " + ishospital_readmissionEnabled);
				
				if(ishospital_readmissionSelected==false)
				{
					hospital_readmission.click();
					ishospital_readmissionSelected = hospital_readmission.isSelected();
					System.out.println("ishospital_readmissionSelected: " + ishospital_readmissionSelected);
				}
				
				
				WebElement bookAppointment = driver.findElement(By.xpath("//*[@id=\"btn-book-appointment\"]"));
				
				Dimension getSizeOfElement = bookAppointment.getSize();
				System.out.println("getSizeOfElement: " + getSizeOfElement);
				
				WebElement cssAttributes = driver.findElement(By.xpath("//*[@id=\"top\"]/div/h3"));
				
				String font_size = cssAttributes.getCssValue("font-size");
				System.out.println("font_size: " + font_size);

				String font_family = cssAttributes.getCssValue("font-family");
				System.out.println("font-family: " + font_family);
				
				
				Point getCoOrdinates = cssAttributes.getLocation();
				System.out.println("getCoOrdinates: " + getCoOrdinates);

				String getAttribute = bookAppointment.getAttribute("id");
				System.out.println("getAttribute: " + getAttribute);
				
				
				
				//bookAppointment.submit();
				
				driver.quit();
				
				
				
	}

}

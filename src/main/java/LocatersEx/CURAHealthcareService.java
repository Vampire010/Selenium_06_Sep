package LocatersEx;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CURAHealthcareService 
{ 
	public WebDriver driver;


	public void Login()
	{
		System.setProperty("Webdriver.chrome.driver", 
				"./BrowserDrivers/chromedriver.exe");
					
				driver = new ChromeDriver();	
				
				driver.manage().window().maximize();

				driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
				
		WebElement makeapntlnk = driver.findElement(By.linkText("Make Appointment"));		
		makeapntlnk.click();
		
		//WebElement makeapntlnk = driver.findElement(By.partialLinkText("Make Appo"));		
		//makeapntlnk.click();
		
		
		WebElement getUsrname = driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div[1]/div[1]/div/div/input"));
		String Username = getUsrname.getAttribute("value");
		System.out.println(Username);

		
		WebElement getUsrpswrd = driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div[1]/div[2]/div/div/input"));
		String userPassword = getUsrpswrd.getAttribute("value");
		System.out.println(userPassword);
		
		
		
		WebElement setUsername = driver.findElement(By.id("txt-username"));
		setUsername.sendKeys(Username);
		
		WebElement setuserPswrd = driver.findElement(By.id("txt-password"));
		setuserPswrd.sendKeys(userPassword);
		
		
		WebElement loginBtn = driver.findElement(By.id("btn-login"));
		loginBtn.click();
	}
	
	public void MakeAppointment()
	{
		WebElement chk_hospotal_readmission = driver.findElement(By.name("hospital_readmission"));
		chk_hospotal_readmission.click();
		
		
		WebElement Medicaid = driver.findElement(By.cssSelector("#radio_program_medicaid"));
		Medicaid.click();
		
		WebElement visit_date = driver.findElement(By.id("txt_visit_date"));
		visit_date.sendKeys("12/09/2023");
		
		//Native Xpath
		WebElement Comment = driver.findElement(By.xpath("/html/body/section/div/div/form/div[5]/div/textarea"));
		Comment.sendKeys("Regular CheckUp");
		
		//Relative Xpath
		WebElement bookAppointmentBtn = driver.findElement(By.xpath("//*[@id=\"btn-book-appointment\"]"));
		bookAppointmentBtn.click();
	
	}
	
	public void takeScreenShot() throws IOException
	{
		
		//Date date = new Date();
		
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        Files.copy(scrFile, new File("C:\\Users\\giris\\eclipse-workspace-web\\Selenium_06_Sep\\Images\\imageTest.png"));

		driver.quit();

	}
	
	
	public static void main(String[] args) throws IOException 
	{
		
		CURAHealthcareService cu = new CURAHealthcareService();
		cu.Login();
		cu.MakeAppointment();
		cu.takeScreenShot();
						
	}

}


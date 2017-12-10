package com.selenium.Assg;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiWindowAssg {

	
	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.deal4loans.com/apply-education-loans.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("privacy policy")).click();
		Thread.sleep(3000);
	
		
		driver.findElement(By.id("Name")).sendKeys("hello");
		Thread.sleep(3000);
		
		
	Set<String> browsers = driver.getWindowHandles();
		
	System.out.println("browsers size is   " + browsers.size());
		
	for (String browser : browsers) 
	{
			
		System.out.println("browser id is    " + browser);
		driver.switchTo().window(browser);
		if (driver.getTitle().equals("Privacy Policy - Deal4loans.com's Services | Online Loan Application And Information")) 
		{
			driver.switchTo().window(browser);
			driver.findElement(By.xpath(" //b[contains(text(),' www.deal4loans.com/personal-loan-offers.php')]")).click();	
	
			Set<String> browsers1 = driver.getWindowHandles();
			for (String cbrowser : browsers1) 
			{
				System.out.println("title is   " + driver.getTitle());
				driver.switchTo().window(cbrowser);	
				if (driver.getTitle().equals("Personal Loan Festival Offers | Deal4loans")) 
				{
					driver.switchTo().window(cbrowser);						
					driver.findElement(By.xpath("//a[@href='http://www.deal4loans.com/apply-personal-loan-continue.php']")).click();
					Thread.sleep(5000);
					driver.close();
					Thread.sleep(2000);				
				}
					
			}
		}
	}	
		
	Set<String> browsers2 = driver.getWindowHandles();
	System.out.println("New Br"+browsers2.size());
	
	for (String nbrowser : browsers2) 
		{
				driver.switchTo().window(nbrowser);
				if (driver.getTitle().equals("Privacy Policy - Deal4loans.com's Services | Online Loan Application And Information")) 
				{ 
					System.out.println("title is   " + driver.getTitle());
					driver.navigate().refresh();
					Thread.sleep(2000);
					driver.close();
					Thread.sleep(2000);
				}
														
		}
	Set<String> browsers3 = driver.getWindowHandles();
	System.out.println("browsers size is   " + browsers3.size());
	for (String browser : browsers3) {
		System.out.println("browser id is    " + browser);
		driver.switchTo().window(browser);
		if (driver.getCurrentUrl().equals("http://www.deal4loans.com/apply-education-loans.php")) {
			driver.findElement(By.id("Name")).clear();
			Thread.sleep(3000);
			driver.quit();
		}
	}	
}
}


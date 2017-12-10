package com.selenium.Assg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitMethods {

	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		PageFactory.initElements(driver, this);

		driver.get("http://www.deal4loans.com/apply-education-loans.php");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);  
	      wait.until(ExpectedConditions.presenceOfElementLocated(By.className("edu-get-quotebtn1"))); 

		driver.findElement(By.className("edu-get-quotebtn")).click();
		//driver.findElement(By.className("edu-get-quotebtn1")).click();
		
		

	}

}

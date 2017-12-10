package com.selenium.Assg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.annotations.Test;

public class ClickActionAssg {
	
	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://passport.in.ckgs.us/get-started");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@data-id='stateReside']")).click();
		
		driver.findElement(By.xpath("//button[@data-id='stateReside']")).click();
		
		driver.findElement(By.xpath("//span[text()='GEORGIA']")).click();
		
		//driver.findElement(By.xpath("//a[contains(.,'GEORGIA')]")).click(); 
		
		//System.out.println();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[contains(text(),'Tatkal')]")).click();
		
	}

}

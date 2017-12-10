package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	
	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://blueimp.github.io/jQuery-File-Upload");
		driver.manage().window().maximize();
		driver.findElement(By.name("files[]")).sendKeys("C:\\tmp\\screenshot.png");
		
	}

}

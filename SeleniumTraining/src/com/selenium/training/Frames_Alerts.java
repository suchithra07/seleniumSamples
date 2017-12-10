package com.selenium.training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames_Alerts {

	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		
		WebElement e=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(e);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.accept();
		//a.dismiss();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()='Run »']")).click();

	}

}

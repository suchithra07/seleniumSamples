package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTitl_GetCurrentUrl {

	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.espncricinfo.com/ci/content/video_audio/index.html");
		driver.manage().window().maximize();
		
		String a = driver.getTitle();
		System.err.println("title is   " + a);
		String b = driver.getCurrentUrl();
		System.out.println("url is   " + b);
		driver.findElement(By.linkText("HIGHLIGHTS")).click();
		Thread.sleep(3000);
		String d = driver.getTitle();
		System.err.println("title is   " + d);
		String c = driver.getCurrentUrl();
		System.out.println("url is   " + c);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		

	}

}

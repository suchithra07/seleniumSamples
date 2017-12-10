package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {
	
	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bankofamerica.com");
		driver.manage().window().maximize();
		
		String a = driver.getTitle();
		System.err.println("Title is   " + a);
		
		String b = driver.getCurrentUrl();
		System.out.println("Url is   " + b);
		
		driver.findElement(By.linkText("Businesses & Institutions")).click();
		Thread.sleep(3000);
		
		String c = driver.getTitle();
		System.err.println("Title is   " + c);
		
		String d = driver.getCurrentUrl();
		System.out.println("url is   " + d);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		System.out.println("Back");
		
		String e = driver.getTitle();
		System.err.println("Title is   " + e);
		
		String f = driver.getCurrentUrl();
		System.out.println("url is   " + f);
		
		
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println("Forward");
		
		String g = driver.getTitle();
		System.err.println("Title is   " + g);
		
		String h = driver.getCurrentUrl();
		System.out.println("url is   " + h);
		
		driver.navigate().refresh();
		System.out.println("Refresh");
		
		String i = driver.getTitle();
		System.err.println("Title is   " + i);
		
		String j = driver.getCurrentUrl();
		System.out.println("url is   " + j);
		

	}
		
}

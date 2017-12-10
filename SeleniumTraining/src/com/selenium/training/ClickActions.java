package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickActions {
	
	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.deal4loans.com/apply-education-loans.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//option[@value='Chennai']")).click();
		WebElement checkbox=driver.findElement(By.name("accept"));
		boolean a=checkbox.isSelected();
		System.out.println("is check box selected  "+a);
		Thread.sleep(3000);
		checkbox.click();
		Thread.sleep(3000);
		
		
		boolean b=checkbox.isSelected();
		System.out.println("is check box selected  "+b);
	//	driver.findElement(By.className("edu-get-quotebtn")).click();
		boolean c=driver.findElement(By.id("Course_Name")).isEnabled();
		System.out.println("is text box active   "+c);
		WebElement e=driver.findElement(By.className("hintanchor"));
		boolean d=e.isDisplayed();
		System.out.println("is error message displayed  "+d);
		String f=e.getCssValue("font-size");
		System.out.println("color is   "+f);
		
	}
	
	

}

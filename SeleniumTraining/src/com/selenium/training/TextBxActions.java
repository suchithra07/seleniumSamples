package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBxActions {

	public WebDriver driver;

	@Test
	public void chromePrg() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.deal4loans.com/apply-home-loans.php");
		driver.manage().window().maximize();
		WebElement fullNameTextBox = driver.findElement(By.id("Name"));
		fullNameTextBox.sendKeys("hello");
		String a = fullNameTextBox.getAttribute("value");
		System.out.println("full name value is   " + a);
		WebElement loan = driver.findElement(By.name("Loan_Amount"));
		loan.sendKeys("1234");
		String b = loan.getAttribute("value");
		System.out.println("loan value is   " + b);
		fullNameTextBox.clear();
		loan.clear();
		String c = fullNameTextBox.getAttribute("value");
		System.out.println("full name value is   " + c);
		String d = loan.getAttribute("value");
		System.out.println("loan value is   " + d);
		String e = loan.getAttribute("onkeypress");
		System.out.println("value of onkeypress is  " + e);

		String f = loan.getAttribute("onkeyup");
		System.out.println("value of onkeyup is  " + f);

	}

}

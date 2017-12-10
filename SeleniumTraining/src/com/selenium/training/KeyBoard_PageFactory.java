package com.selenium.training;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class KeyBoard_PageFactory {

	public WebDriver driver;

	@FindBy(id = "Name")
	public WebElement fullNameTextBox;

	@FindBy(name = "Email")
	public WebElement emailTextBox;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
		driver.get("http://www.deal4loans.com/apply-education-loans.php");
		driver.manage().window().maximize();
		fullNameTextBox.sendKeys("hello");
		Thread.sleep(2000);
		fullNameTextBox.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		fullNameTextBox.sendKeys(Keys.CONTROL + "x");
		Thread.sleep(2000);
		fullNameTextBox.sendKeys(Keys.CONTROL + "v");
		Thread.sleep(2000);
		fullNameTextBox.sendKeys(Keys.SHIFT + "world");
		Thread.sleep(2000);
		fullNameTextBox.sendKeys(Keys.CONTROL + "z");
		Thread.sleep(2000);
		fullNameTextBox.sendKeys(Keys.CONTROL + "y");

	}

}

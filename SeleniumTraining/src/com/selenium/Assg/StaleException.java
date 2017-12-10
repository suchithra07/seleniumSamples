package com.selenium.Assg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class StaleException {

	public WebDriver driver;
	
	@FindBy(name="q")
	public WebElement searchBox;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		
		/*WebElement e=driver.findElement(By.name("q"));
		e.sendKeys("hello");
		Thread.sleep(2000);
		e.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("q")).clear();*/
		searchBox.sendKeys("hello");
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		searchBox.clear();

	}

}

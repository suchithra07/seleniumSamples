package com.selenium.Assg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class JseExecutorAssg {
	
	public WebDriver driver;

	@FindBy(xpath = "(//div[@class='xg_subtab'])[2]")
	public WebElement searchBox;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
		driver.get("http://www.qualitytesting.info/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style', 'display: block;');",searchBox);

		Thread.sleep(3000);
		driver.findElement(By.linkText("Test Management Tools")).click();
		

	}


}



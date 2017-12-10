package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class JsExecutor {

	public WebDriver driver;

	@FindBy(className = "ul_box_education")
	public WebElement searchBox;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
		driver.get("https://www.deal4loans.com/apply-personal-loan-continue.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style', 'left: 1px;');",
				searchBox);

		Thread.sleep(3000);
		driver.findElement(By.linkText("EMI Calculator")).click();

	}

}

package com.selenium.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MouseOver {

	public WebDriver driver;

	@FindBy(xpath = "//a[@href='/Contents_Calculators.php']")
	public WebElement clacluator;

	@FindBy(xpath = "//a[text()='Business Loan']")
	public WebElement businessLoans;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
		driver.get("http://www.deal4loans.com/apply-education-loans.php");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(businessLoans).build().perform();
		Thread.sleep(2000);
		//clacluator.click();

	}

}

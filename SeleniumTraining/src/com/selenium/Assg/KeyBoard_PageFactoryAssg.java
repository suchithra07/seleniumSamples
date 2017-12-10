package com.selenium.Assg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class KeyBoard_PageFactoryAssg {

	
	public static WebDriver driver;

	@FindBy(className = "edu-get-quotebtn")
	public WebElement getQuoteBtn;
	
	@FindBy(id = "Name")
	public WebElement fullNameTextBox;


	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		PageFactory.initElements(driver, this);
		
		driver.get("http://www.deal4loans.com/apply-education-loans.php");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		getQuoteBtn.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		fullNameTextBox.sendKeys(Keys.F5);
		Thread.sleep(2000);
		//explicitWait(By.name("dfsdf"));
	
	}
	
	
		 }

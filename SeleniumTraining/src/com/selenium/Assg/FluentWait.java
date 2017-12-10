package com.selenium.Assg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import org.openqa.selenium.support.ui.FluentWait;



public class FluentWait {
	
	
	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		PageFactory.initElements(driver, this);
		
		driver.get("http://www.deal4loans.com/apply-education-loans.php");
		driver.manage().window().maximize();
		
		
		
		
	}
	public static WebElement explicitWait(WebDriver driver, By by) {
		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		    .withTimeout(20, TimeUnit.SECONDS)
		    .pollingEvery(2, TimeUnit.SECONDS)
		    .ignoring(NoSuchElementException.class);

		  WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		   public WebElement apply(WebDriver driver) {
		    return driver.findElement(By.id("foo"));
		   }
		  });
		  return element;
		 }
	

}

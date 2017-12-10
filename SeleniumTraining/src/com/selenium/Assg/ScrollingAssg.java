package com.selenium.Assg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingAssg {
	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://stackoverflow.com/questions/12293158/page-scroll-up-or-down-in-selenium-webdriver-selenium-2-using-java");
		Thread.sleep(2000);
		/*JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,5000)", "");

		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-4000)", "");*/
		WebElement e=driver.findElement(By.xpath("//a[text()='user3472488']"));
				
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
	}

}

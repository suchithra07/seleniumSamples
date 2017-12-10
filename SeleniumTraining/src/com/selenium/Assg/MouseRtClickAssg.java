package com.selenium.Assg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MouseRtClickAssg {

	
	public WebDriver driver;

	@FindBy(className = "context-menu-one")
	public WebElement RtClickBtn;

	@FindBy(xpath= "//span[text()='Delete']")
	public WebElement DeleteOpt;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		PageFactory.initElements(driver, this);
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		a.contextClick(RtClickBtn).build().perform();		
		
		Thread.sleep(2000);
		DeleteOpt.click();
		Thread.sleep(2000);
		
		Alert al=driver.switchTo().alert();
		al.accept();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
	}
}

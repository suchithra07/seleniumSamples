package com.selenium.Assg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MouseDoubleClickAssg {
	
	public WebDriver driver;

	@FindBy(xpath = "//input[@value='Double Click']")
	public WebElement DoubleClickBtn;

	
	@Test
	public void chromePrg() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		PageFactory.initElements(driver, this);
		
		driver.get("http://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		a.doubleClick(DoubleClickBtn).build().perform();
		Thread.sleep(2000);
		

	}

}

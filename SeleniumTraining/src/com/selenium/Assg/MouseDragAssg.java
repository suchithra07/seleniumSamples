package com.selenium.Assg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MouseDragAssg {
	
	public WebDriver driver;

	@FindBy(id= "goat0")
	public WebElement DragGoat;

	@FindBy(id = "dropzone1")
	public WebElement DropGoat;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		PageFactory.initElements(driver, this);
		
		driver.get("http://beej.us/blog/data/drag-n-drop/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(DragGoat, DropGoat).build().perform();
		Thread.sleep(2000);
		
		Alert al=driver.switchTo().alert();
		al.accept();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		
	}

}

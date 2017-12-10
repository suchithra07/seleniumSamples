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

public class MultipleFramesAssg {


	public WebDriver driver;
	
	@FindBy(id="iframeResult")
	public WebElement MainFrame;
	
	@FindBy(xpath="//frame[@src='frame_a.htm']")
	public WebElement FrameA;
	
	@FindBy(xpath="//frame[@src='frame_b.htm']")
	public WebElement FrameB;
	
	@FindBy(xpath="//frame[@src='frame_c.htm']")
	public WebElement FrameC;
	
	@FindBy(xpath="//button[text()='Run »']")
	public WebElement RunBtn;
	

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_frame_cols");
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, this);
		
		driver.switchTo().frame(MainFrame);
	
	
		driver.switchTo().frame(FrameA);
		//driver.findElement(By.xpath("//h3[text()='Frame A']")).click();
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(FrameB);
		//driver.findElement(By.xpath("//h3[text()='Frame B']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(FrameC);
	//	driver.findElement(By.xpath("//h3[text()='Frame C']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		RunBtn.click();
	


	}

}

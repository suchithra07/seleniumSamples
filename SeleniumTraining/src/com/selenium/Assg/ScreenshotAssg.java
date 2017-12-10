package com.selenium.Assg;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotAssg {
	
	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deal4loans.com/apply-education-loans.php");
		Thread.sleep(2000);
		
	
		
		try {
			
			DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
	        Date date = new Date();
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File("c:\\tmp\\"+dateFormat.format(date)+".png"));
	   		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}

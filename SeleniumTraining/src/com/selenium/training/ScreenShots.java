package com.selenium.training;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShots {

	public WebDriver driver;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://stackoverflow.com/questions/12293158/page-scroll-up-or-down-in-selenium-webdriver-selenium-2-using-java");
		Thread.sleep(2000);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// File scrFile = ((TakesScreenshot)driver).getScreenshotAs(arg0)
		// Now you can do whatever you need to do with it, for example copy somewhere
		try {
			Date vdate = new Date(); 
				System.out.println(vdate);	
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\"+vdate.toString()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.selenium.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InvokeFireFox {
	
	public WebDriver driver;
	
	@Test
	
	public void FireFoxPrg() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	

}

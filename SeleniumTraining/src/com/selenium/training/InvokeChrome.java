package com.selenium.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeChrome {

	public WebDriver driver;

	@Test
	public void chromePrg() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

}

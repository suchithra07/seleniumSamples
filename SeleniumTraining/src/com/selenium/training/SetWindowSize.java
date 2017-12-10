package com.selenium.training;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SetWindowSize {
	
	public WebDriver driver;

	@Test
	public void FireFoxPrg() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
	//	Dimension d = new Dimension(600,800);
		driver.manage().window().setSize(new Dimension(600,800));
	}

}

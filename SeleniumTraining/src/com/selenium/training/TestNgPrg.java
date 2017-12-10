package com.selenium.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgPrg {

	public WebDriver driver;

	
	
	@BeforeSuite(alwaysRun=true)
	public void beforeAnyTestCase() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterSuite(alwaysRun=true)
	public void closeBrowser() {
		driver.quit();
	}
	
	@BeforeMethod(alwaysRun=true)
	public void beforeEveryTestCase() throws InterruptedException {
		driver.get("http://www.twitter.com");
		Thread.sleep(2000);
	}
	
	@AfterMethod(alwaysRun=true)
	public void afterEveryTestCase() throws InterruptedException {
		driver.get("http://www.deal4loans.com");
		Thread.sleep(2000);
	}

	@Test(priority = 1, testName = "gmail prg", description = "invoking gmail prg", timeOut = 20000, enabled = true, groups = {
			"1", "smoke" })
	public void gmail() throws InterruptedException {
		driver.get("http://www.gmail.com");
		Reporter.log("this is gmail",true);
	}

	@Test(priority = 2, testName = "facebook prg", description = "invoking fb prg", timeOut = 20000, enabled = true, groups = {
			"2", "regression" })
	public void facebook() throws InterruptedException {
		driver.get("http://www.facebook.com");
		Reporter.log("this is facebook",true);
	}

	@Test(priority = 3, testName = "bing prg", description = "invoking bing prg", timeOut = 20000, enabled = true, groups = {
			"3", "smoke", "regression" })
	public void bing() throws InterruptedException {
		driver.get("http://www.bing.com");
		Reporter.log("this is bing",true);
	}

	@Test(priority = 4, testName = "hotmail prg", description = "invoking hotmail prg", timeOut = 20000, enabled = true, groups = {
			"4", "regression", "UI" })
	public void hotmail() throws InterruptedException {
		driver.get("http://www.hotmail.com");
		Reporter.log("this is hotmail",true);
	}

	@Test(priority = 5, testName = "google prg", description = "invoking google prg", timeOut = 20000, enabled = true, groups = {
			"5", "UI" })
	public void google() throws InterruptedException {
		driver.get("http://www.google.com");
		Reporter.log("this is google",true);
	}
}

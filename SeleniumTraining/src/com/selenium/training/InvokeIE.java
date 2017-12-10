package com.selenium.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;



public class InvokeIE {
	
	public WebDriver driver;
	
		@Test
		public void IEPrg() {
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
	
	
	}

}

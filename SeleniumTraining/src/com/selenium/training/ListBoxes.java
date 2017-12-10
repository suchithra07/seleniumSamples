package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListBoxes {

	public WebDriver driver;

	@Test
	public void chromePrg() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"http://www.jqueryscript.net/demo/Responsive-jQuery-Dual-Select-Boxes-For-Bootstrap-Bootstrap-Dual-Listbox");
		WebElement e = driver.findElement(By.id("bootstrap-duallistbox-nonselected-list_duallistbox_demo2"));
		Select s = new Select(e);
		s.selectByIndex(0);
		s.selectByValue("option8");
		s.selectByVisibleText("Option 9");
		// s.deselectAll();
		s.deselectByIndex(0);
		s.deselectByValue("option8");
		s.deselectByVisibleText("Option 9");
	}

}

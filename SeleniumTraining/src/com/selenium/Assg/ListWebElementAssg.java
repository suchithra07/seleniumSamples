package com.selenium.Assg;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ListWebElementAssg {
	
	public WebDriver driver;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']//a[contains(@class,'ui-state-default')]")
	public List<WebElement> datelist;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		PageFactory.initElements(driver, this);

		//get the url
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		WebElement e=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(e);
		
		
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		
		List<WebElement> dateslist = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a[contains(@class,'ui-state-default')]"));
		
		System.out.println("dates size is   " + dateslist.size());
		Calendar cal = Calendar.getInstance();
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

		String dayOfMonthStr = String.valueOf(dayOfMonth);
		for (WebElement date : dateslist) {
			System.out.println("date is   " + date.getText());
			if(date.getText().equals(dayOfMonthStr)) {
				date.click();
				break;
			}
		}
		
		driver.switchTo().defaultContent();

	}


}

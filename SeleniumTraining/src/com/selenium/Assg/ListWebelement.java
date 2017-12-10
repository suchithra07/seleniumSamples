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

public class ListWebelement {

	public WebDriver driver;

	@FindBy(xpath = "//table[@class='jCalendar']//td[contains(@class,'current-month')]")
	public List<WebElement> datelist;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		PageFactory.initElements(driver, this);

		driver.get("http://2008.kelvinluck.com/assets/jquery/datePicker/v2/demo/datePickerClickInput.html");
		driver.manage().window().maximize();
		driver.findElement(By.className("dp-choose-date")).click();
		
		List<WebElement> dateslist = driver
				.findElements(By.xpath("//table[@class='jCalendar']//td[contains(@class,'current-month')]"));
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

		/*for (int i = 0; i < dateslist.size(); i++) {
			System.out.println("date is   " + dateslist.get(i).getText());
			if(dateslist.get(i).getText().equals(dayOfMonthStr)) {
				dateslist.get(i).click();
				break;
			}
		}*/

	}

}

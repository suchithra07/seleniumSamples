package com.selenium.Assg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CityListWebElementAssg {
	
	
	public WebDriver driver;

	@FindBy(xpath = "//table//select[@id='City']//option")
	public List<WebElement> citieslist;

	@Test
	public void chromePrg() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		PageFactory.initElements(driver, this);

		driver.get("http://www.deal4loans.com/apply-education-loans.php");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//select[@id='City']")).click();
		
		
		System.out.println("cities size is   " + citieslist.size());
		
		
		for (WebElement city : citieslist) {
			System.out.println("city is   " + city.getText());
			if(city.getText().equals("Trichy")) {
				city.click();
				break;
				}
			}

		

	}


}

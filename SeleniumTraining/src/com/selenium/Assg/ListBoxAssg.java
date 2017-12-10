package com.selenium.Assg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListBoxAssg {
	
	public WebDriver driver;

	@Test
	public void chromePrg() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(	"http://www.deal4loans.com/apply-education-loans.php");
		
		//country
		WebElement e1 = driver.findElement(By.id("Country"));
	
		Select s1= new Select(e1);
		s1.selectByIndex(0);
		System.out.println("SelecByIndex value is  " + s1.getAllSelectedOptions().get(0).getText());
		
		s1.selectByValue("3");
		System.out.println("SelecByValue value is  " + s1.getAllSelectedOptions().get(0).getText());
		
		s1.selectByVisibleText("Other Country");
		System.out.println("selectByVisibleText  value is " + s1.getAllSelectedOptions().get(0).getText());
		System.out.println();
		
		//course
		WebElement e2 = driver.findElement(By.id("Course"));
		
		Select s2 = new Select(e2);
		
		s2.selectByIndex(3);
		System.out.println("SelecByIndex value is  " + s2.getAllSelectedOptions().get(0).getText());
		
		s2.selectByValue("2");
		System.out.println("SelecByValue value is  " + s2.getAllSelectedOptions().get(0).getText());
		
		s2.selectByVisibleText("Graduation Courses");
		System.out.println("selectByVisibleText  value is " + s2.getAllSelectedOptions().get(0).getText());
		System.out.println();
		
		//City
		WebElement e3 = driver.findElement(By.id("City"));
				
		Select s3 = new Select(e3);
				
		s3.selectByIndex(15);
		System.out.println("SelecByIndex value is  " + s3.getAllSelectedOptions().get(0).getText());
		
		s3.selectByValue("Chandigarh");
		System.out.println("SelecByValue value is  " + s3.getAllSelectedOptions().get(0).getText());
				
		s3.selectByVisibleText("Thiruvananthapuram");
		System.out.println("selectByVisibleText  value is " + s3.getAllSelectedOptions().get(0).getText());
		System.out.println();
		
		//Income status
		WebElement e4 = driver.findElement(By.id("Employment_Status"));
						
		Select s4 = new Select(e4);
						
		s4.selectByIndex(1);
		System.out.println("SelecByIndex value is  " + s4.getAllSelectedOptions().get(0).getText());
				
		s4.selectByValue("2");
		System.out.println("SelecByValue value is  " + s4.getAllSelectedOptions().get(0).getText());
						
		s4.selectByVisibleText("Salaried");
		System.out.println("selectByVisibleText  value is " + s4.getAllSelectedOptions().get(0).getText());
		System.out.println();
						
	}
}

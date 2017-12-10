package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FillForm {
	
	public WebDriver driver;

	@Test
	public void chromePrg() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaiShiva\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.experienceworks.org/site/PageServer?pagename=Practice_Online_application");
		//driver.manage().window().maximize();
		//First Name
		WebElement FirstNameTextBox = driver.findElement(By.id("applicant.firstName"));
		FirstNameTextBox.sendKeys("Suchithra");
		String fa = FirstNameTextBox.getAttribute("value");
		System.out.println("FirstName is   " + fa);
		FirstNameTextBox.clear();
		String fb = FirstNameTextBox.getAttribute("value");
		System.out.println("FirstName is   " + fb);
		String fc = FirstNameTextBox.getAttribute("name");
		System.out.println("value of name is   " + fc);
		//Mid Name
		WebElement MidNameTextBox = driver.findElement(By.id("applicant.middleName"));
		MidNameTextBox.sendKeys("Laxmi");
		String ma = MidNameTextBox.getAttribute("value");
		System.out.println("MiddleName is   " + ma);
		MidNameTextBox.clear();
		String mb = MidNameTextBox.getAttribute("value");
		System.out.println("MiddleName is   " + mb);
		String mc = MidNameTextBox.getAttribute("name");
		System.out.println("value of name is   " + mc);
		//Lastname
		WebElement LastNameTextBox = driver.findElement(By.id("applicant.lastName"));
		LastNameTextBox.sendKeys("K");
		String la =LastNameTextBox.getAttribute("value");
		System.out.println("LastName is   " + la);
		LastNameTextBox.clear();
		String lb =LastNameTextBox.getAttribute("value");
		System.out.println("LastName is   " + lb);
		String lc = LastNameTextBox.getAttribute("name");
		System.out.println("value of name is   " + lc);
		
		//Address1
		WebElement Adr1TextBox = driver.findElement(By.id("applicant.address.streetAddress1"));
		Adr1TextBox.sendKeys("Address1");
		String Aa =Adr1TextBox.getAttribute("value");
		System.out.println("Address1 is   " + Aa);
		Adr1TextBox.clear();
		String Ab =Adr1TextBox.getAttribute("value");
		System.out.println("Address1 is   " + Ab);
		String Ac = Adr1TextBox.getAttribute("name");
		System.out.println("value of name is   " + Ac);
		
		//Adress2
		WebElement Adr2TextBox = driver.findElement(By.id("applicant.address.streetAddress2"));
		 Adr2TextBox.sendKeys("Addr2");
		String Ba = Adr2TextBox.getAttribute("value");
		System.out.println("Address2 is   " + Ba);
		 Adr2TextBox.clear();
		String Bb = Adr2TextBox.getAttribute("value");
		System.out.println("Address2 is   " + Bb);
		String Bc =  Adr2TextBox.getAttribute("name");
		System.out.println("value of name is   " + Bc);
		
		//City
		WebElement CityTextBox = driver.findElement(By.id("applicant.address.city"));
		CityTextBox.sendKeys("Atlanta");
		String Ca =CityTextBox.getAttribute("value");
		System.out.println("City is   " + Ca);
		CityTextBox.clear();
		String Cb =CityTextBox.getAttribute("value");
		System.out.println("City is   " + Cb);
		String Cc = CityTextBox.getAttribute("name");
		System.out.println("value of name is   " + Cc);
		
		//state
		WebElement StateDropDown = driver.findElement(By.id("applicant.address.state"));
		StateDropDown.sendKeys("GA");
		String Sa =StateDropDown.getAttribute("value");
		System.out.println("state is   " + Sa);
		//StateDropDown.clear();
		String Sb =StateDropDown.getAttribute("value");
		System.out.println("State is   " + Sb);
		String Sc = StateDropDown.getAttribute("name");
		System.out.println("value of name is   " + Sc);
		
		//Zipcode
		WebElement ZipCodeTextBox = driver.findElement(By.id("applicant.address.zipCode"));
		ZipCodeTextBox.sendKeys("50004");
		String Za =ZipCodeTextBox.getAttribute("value");
		System.out.println("ZipCode is   " + Za);
		ZipCodeTextBox.clear();
		String Zb =ZipCodeTextBox.getAttribute("value");
		System.out.println("ZipCode is   " + Zb);
		String Zc =ZipCodeTextBox.getAttribute("name");
		System.out.println("value of name is   " + Zc);
		
		//email
		WebElement EmailTextBox = driver.findElement(By.id("applicant.primaryEmail"));
		EmailTextBox.sendKeys("abc@gmail.com");
		String Ea =EmailTextBox.getAttribute("value");
		System.out.println("Email is   " + Ea);
		EmailTextBox.clear();
		String Eb =EmailTextBox.getAttribute("value");
		System.out.println("Email is   " + Eb);
		String Ec = EmailTextBox.getAttribute("name");
		System.out.println("value of name is   " + Ec);
		
		//phone
		WebElement PhoneTextBox = driver.findElement(By.id("applicant.primaryPhone"));
		PhoneTextBox.sendKeys("9876543210");
		String Pa =PhoneTextBox.getAttribute("value");
		System.out.println("Phone is   " + Pa);
		PhoneTextBox.clear();
		String Pb =PhoneTextBox.getAttribute("value");
		System.out.println("Phone is   " + Pb);
		String Pc = PhoneTextBox.getAttribute("name");
		System.out.println("value of name is   " + Pc);
		
		//schoolName
		
		WebElement SchoolNameTextBox = driver.findElement(By.id("educationViews::.education.userEnteredOrganizationName"));
		SchoolNameTextBox.sendKeys("ABC School");
		String sna =SchoolNameTextBox.getAttribute("value");
		System.out.println("SchoolName is   " + sna);
		SchoolNameTextBox.clear();
		String snb =SchoolNameTextBox.getAttribute("value");
		System.out.println("SchoolName is   " + snb);
		String snc = SchoolNameTextBox.getAttribute("name");
		System.out.println("value of name is   " + snc);
		
		
		//major
		WebElement MajorTextBox = driver.findElement(By.id("educationViews::.education.field"));
		MajorTextBox.sendKeys("Computers");
		String mja =MajorTextBox.getAttribute("value");
		System.out.println("Major is   " + mja);
		MajorTextBox.clear();
		String mjb =MajorTextBox.getAttribute("value");
		System.out.println("Major is   " + mjb);
		String mjc = MajorTextBox.getAttribute("name");
		System.out.println("value of name is   " + mjc);
		
		
		//GPA
		
		WebElement GpaTextBox = driver.findElement(By.id("educationViews::.education.gpa"));
		GpaTextBox.sendKeys("9");
		String ga =GpaTextBox.getAttribute("value");
		System.out.println("GPA is   " + ga);
		GpaTextBox.clear();
		String gb =GpaTextBox.getAttribute("value");
		System.out.println("GPA is   " + gb);
		String gc = GpaTextBox.getAttribute("name");
		System.out.println("value of name is   " + gc);
		
		
		//schoolName2
		
		WebElement SchoolName2TextBox = driver.findElement(By.xpath("(//input[@id='educationViews::.education.userEnteredOrganizationName'])[2]"));
		SchoolName2TextBox.sendKeys("XYZ School");
		String sn2a =SchoolName2TextBox.getAttribute("value");
		System.out.println("SchoolName2 is   " + sn2a);
		SchoolName2TextBox.clear();
		String sn2b =SchoolName2TextBox.getAttribute("value");
		System.out.println("SchoolName2 is   " + sn2b);
		String sn2c = SchoolName2TextBox.getAttribute("name");
		System.out.println("value of name is   " + sn2c);
				
				
		//major2
		WebElement Major2TextBox = driver.findElement(By.xpath("(//input[@id='educationViews::.education.field'])[2]"));
		Major2TextBox.sendKeys("AI");
		String mj2a =Major2TextBox.getAttribute("value");
		System.out.println("Major2 is   " + mj2a);
		Major2TextBox.clear();
		String mj2b =Major2TextBox.getAttribute("value");
		System.out.println("Major2 is   " + mj2b);
		String mj2c = Major2TextBox.getAttribute("name");
		System.out.println("value of name is   " + mj2c);
				
				
		//GPA2
				
		WebElement Gpa2TextBox = driver.findElement(By.xpath("(//input[@id='educationViews::.education.gpa'])[2]"));
		Gpa2TextBox.sendKeys("8.5");
		String g2a =Gpa2TextBox.getAttribute("value");
		System.out.println("GPA2 is   " + g2a);
		Gpa2TextBox.clear();
		String g2b =Gpa2TextBox.getAttribute("value");
		System.out.println("GPA2 is   " + g2b);
		String g2c = Gpa2TextBox.getAttribute("name");
		System.out.println("value of name is   " + g2c);
		
		//EmployerName
		
		WebElement EmpNameTextBox = driver.findElement(By.id("employments::.userEnteredOrganizationName"));
		EmpNameTextBox.sendKeys("ENAMe1");
		String ena =EmpNameTextBox.getAttribute("value");
		System.out.println("Employer name is   " + ena);
		EmpNameTextBox.clear();
		String enb =EmpNameTextBox.getAttribute("value");
		System.out.println("Employer name is   " + enb);
		String enc = EmpNameTextBox.getAttribute("name");
		System.out.println("value of name is   " + enc);
		
		//Job Title
		
		WebElement JobTextBox = driver.findElement(By.id("employments::.title"));
		JobTextBox.sendKeys("Manager");
		String ja =JobTextBox.getAttribute("value");
		System.out.println("job Title is   " + ja);
		JobTextBox.clear();
		String jb =JobTextBox.getAttribute("value");
		System.out.println("Job Title is   " + jb);
		String jc = JobTextBox.getAttribute("name");
		System.out.println("value of name is   " + jc);
		
		
				
		
		
		
		
	
	}
}

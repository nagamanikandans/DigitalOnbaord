package com.dataDrivenTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utilities.Xls_Reader;

public class dataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Xls_Reader reader = new Xls_Reader("D:\\Selenium\\AutomationTraining\\AutomationJavaSession\\src\\com\\testdata\\RediffMailData.xlsx");
		
		String fullname = reader.getCellData("RediffTestData", "fullname", 2);
		System.out.println(fullname);
		
		String mail1 = reader.getCellData("RediffTestData", "mail1", 2);
		System.out.println(mail1);
		
		String password1 = reader.getCellData("RediffTestData", "password1", 2);
		System.out.println(password1);
		
		String password2 = reader.getCellData("RediffTestData", "password2", 2);
		System.out.println(password2);
		
		String mail2 = reader.getCellData("RediffTestData", "mail2", 2);
		System.out.println(mail2);
		
		String mobilenumber = reader.getCellData("RediffTestData", "mobilenumber", 2);
		System.out.println(mobilenumber);
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
								
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(3) > td:nth-child(3) > input[type=text]")).sendKeys(fullname);
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(7) > td:nth-child(3) > input[type=text]:nth-child(1)")).sendKeys(mail1);
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(10) > td:nth-child(3) > input[type=password]")).sendKeys(password1);
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(12) > td:nth-child(3) > input[type=password]")).sendKeys(password2);
		driver.findElement(By.cssSelector("#div_altemail > table > tbody > tr:nth-child(1) > td:nth-child(3) > input[type=text]")).sendKeys(mail2);
		
		driver.findElement(By.id("mobno")).sendKeys(mobilenumber);
		
	}

}

package com.dataDrivenTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utilities.Xls_Reader;

public class parameterizeTestData {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));	
		
		Xls_Reader reader = new Xls_Reader("D:\\Selenium\\AutomationTraining\\AutomationJavaSession\\src\\com\\testdata\\RediffMailData.xlsx");
		int rowCount = reader.getRowCount("RediffTestData");
		System.out.println(rowCount);
		
		reader.addColumn("RediffTestData", "Status");
		
		for(int rowNum = 2; rowNum<=rowCount;rowNum++ )
		{
			System.out.println("++++++++++++++++++++++++++");
			
			String fullname = reader.getCellData("RediffTestData", "fullname", rowNum);
			System.out.println(fullname);
			
			String mail1 = reader.getCellData("RediffTestData", "mail1", rowNum);
			System.out.println(mail1);
			
			String password1 = reader.getCellData("RediffTestData", "password1", rowNum);
			System.out.println(password1);
			
			String password2 = reader.getCellData("RediffTestData", "password2", rowNum);
			System.out.println(password2);
			
			String mail2 = reader.getCellData("RediffTestData", "mail2", rowNum);
			System.out.println(mail2);
			
			String mobilenumber = reader.getCellData("RediffTestData", "mobilenumber", rowNum);
			System.out.println(mobilenumber);
										
			driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(3) > td:nth-child(3) > input[type=text]")).clear();
			driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(3) > td:nth-child(3) > input[type=text]")).sendKeys(fullname);
			
			driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(7) > td:nth-child(3) > input[type=text]:nth-child(1)")).clear();
			driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(7) > td:nth-child(3) > input[type=text]:nth-child(1)")).sendKeys(mail1);
			
			driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(10) > td:nth-child(3) > input[type=password]")).clear();
			driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(10) > td:nth-child(3) > input[type=password]")).sendKeys(password1);
			
			driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(12) > td:nth-child(3) > input[type=password]")).clear();
			driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(12) > td:nth-child(3) > input[type=password]")).sendKeys(password2);
			
			driver.findElement(By.cssSelector("#div_altemail > table > tbody > tr:nth-child(1) > td:nth-child(3) > input[type=text]")).clear();
			driver.findElement(By.cssSelector("#div_altemail > table > tbody > tr:nth-child(1) > td:nth-child(3) > input[type=text]")).sendKeys(mail2);
			
			driver.findElement(By.id("mobno")).clear();
			driver.findElement(By.id("mobno")).sendKeys(mobilenumber);
			
			
			driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(25) > td:nth-child(3) > input[type=radio]:nth-child(1)")).click();
			Thread.sleep(3000);
			
			reader.setCellData("RediffTestData", "Status", rowNum, "Pass");
		}
	}

}

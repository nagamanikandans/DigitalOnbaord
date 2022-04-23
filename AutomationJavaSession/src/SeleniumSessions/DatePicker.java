package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("onward_cal")).click();
		
		String monthYearValue = driver.findElement(By.className("monthTitle")).getText();
		System.out.println(monthYearValue);
		
		// Mar 2022 --> Split these values using split function
		
		String monthValue = monthYearValue.split(" ")[0].trim();
		System.out.println(monthValue); // Mar
		
		String yearValue = monthYearValue.split(" ")[1].trim();
		System.out.println(yearValue); // 2022
		
		// Apr 2023 --> Need to select this month and year
		while(!(monthValue.equals("Apr") && yearValue.equals("2023"))) { //True 
			driver.findElement(By.cssSelector("#rb-calendar_onward_cal > table > tbody > tr.rb-monthHeader > td.next > button")).click();
			
			monthYearValue = driver.findElement(By.className("monthTitle")).getText();
			System.out.println(monthYearValue); // Apr 2022 // May 2022 // Aug 2022 // ....// Apr 2023
			monthValue = monthYearValue.split(" ")[0].trim();		// Apr
			yearValue = monthYearValue.split(" ")[1].trim();		// 2023
		}
		
		driver.findElement(By.cssSelector("#rb-calendar_onward_cal > table > tbody > tr:nth-child(6) > td:nth-child(2)")).click();
	}

}

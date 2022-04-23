package check;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class picker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(2000);
		
		String monthYearValue = driver.findElement(By.className("monthTitle")).getText();
		System.out.println(monthYearValue);
		
		String monthValue = monthYearValue.split(" ")[0].trim();
		System.out.println(monthValue);
		
		String yearValue = monthYearValue.split(" ")[1].trim();
		System.out.println(yearValue);
		
		while(!(monthValue.equals("Apr") && yearValue.equals("2023"))) {
			driver.findElement(By.cssSelector("#rb-calendar_onward_cal > table > tbody > tr.rb-monthHeader > td.next > button")).click();
			
			monthYearValue = driver.findElement(By.className("monthTitle")).getText();
			System.out.println(monthYearValue);
			
			monthValue = monthYearValue.split(" ")[0].trim();			
			yearValue = monthYearValue.split(" ")[1].trim();			
		}
		
		//driver.findElement(By.cssSelector("#rb-calendar_onward_cal > table > tbody > tr:nth-child(6) > td:nth-child(3)")).click();
		driver.findElement(By.cssSelector("#rb-calendar_onward_cal > table > tbody > tr:nth-child(6) > td:nth-child(3)")).click();
		
		//table[contains(@class,'rb-monthTable first last')]
		
	}

}

package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://seleniumpractise.blogspot.com/2021/08/");
		
		List<WebElement> allHeaders = driver.findElements(By.xpath("//table[contains(@id,'cust')]//th"));
		System.out.println("Head cound: " + allHeaders.size());
		
		System.out.println("Table headings");
		for(WebElement element:allHeaders) {			
			String value = element.getText();
			System.out.println(value);
		}
		
		List<WebElement> rowsCount = driver.findElements(By.xpath("//table[contains(@id,'cust')]//tr"));
		System.out.println("Rows Count: " + rowsCount.size());
		
		List<WebElement> allData = driver.findElements(By.xpath("//table[contains(@id,'cust')]//td"));
		System.out.println("Table data Count: " + allData.size());
		
		System.out.println("==============================================================");
		System.out.println("Print all Table Data");
		for(WebElement element:allData) {			
			String value = element.getText();
			System.out.println(value);
			if(value.equals("Ola")) {
				System.out.println("Data is present");
				break;
			}
		}
		
		System.out.println("==============================================================");
		List<WebElement> companyNames = driver.findElements(By.xpath("//table[contains(@id,'cust')]//tr//td[2]"));
		System.out.println("Company names Count: " + companyNames.size());
		
		System.out.println("Print company names in the Table");
		for(WebElement element:companyNames) {			
			String value = element.getText();
			System.out.println(value);
		}
		
		driver.findElement(By.xpath("//td[text()='Selenium']//preceding-sibling::td//input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[text()='Selenium']//following-sibling::td[3]//a")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}

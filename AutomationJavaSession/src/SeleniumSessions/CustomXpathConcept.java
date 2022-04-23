package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomXpathConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Selenium");
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Name property");
		//driver.findElement(By.xpath("//input[@css='#gh-ac']")).sendKeys("Name property");
		
		//#gh-ac
		//Another Way --> contains functions		
		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).clear();
		//When to use Contains Xpath
		// id = test_123 --> By.id("test_123")
		// id = test_123
		// test_456
		// test_433
		
		//input[contains(@id,'test_')]
		
		//starts with
		//input[starts-with(@id,'test_')]
		
		//id = 1234_test
		// id = 23222_test
		
		//ends-with
		//input[ends-with(@id,'_test')]
		
		//a[contains(text(),'register')]  -->Xpath for Links alone
		driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Beauty & Makeup')]")).click();
		
	}

}

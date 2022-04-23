package check;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://seleniumpractise.blogspot.com/2021/08/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//table[@id="customers"] --> To Find the table
		//table[contains(@id,'cust')] --> To Find the table
		//table[contains(@id,'cust')]//th ---> TO find the columns and headers
		//table[contains(@id,'cust')]//tr  --> To find rows		
		//table[contains(@id,'cust')]//td  ---> To find table data		
		//table[contains(@id,'cust')]//tr//td[2] ---> Only second column
		//table[contains(@id,'cust')]//tr//td[4]  ---> Only country column
		//td[text()='Selenium']//preceding::td  ---> It will point out all the elements before selenium in Table
		//td[text()='Selenium']//preceding-sibling::td//input  --> Check box before selenium
		//td[text()='Selenium']//following-sibling::td[3]//a  ---> Click on know more on selenium
		
		List<WebElement> allHeaders = driver.findElements(By.xpath("//table[contains(@id,'cust')]//th"));
		System.out.println(allHeaders.size());
		
		for(WebElement element:allHeaders) {
			String Value = element.getText();
			System.out.println(Value);
			if(Value.equals("Country")) {
				System.out.println("Element is present");
				break;
			}
		}
		
		List<WebElement> rowsCount = driver.findElements(By.xpath("//table[contains(@id,'cust')]//tr"));
		System.out.println(rowsCount.size());
		
		
		List<WebElement> allData = driver.findElements(By.xpath("//table[contains(@id,'cust')]//td"));
		System.out.println("Table data count" + allData.size());
		
		for(WebElement element:allData) {
			String Value = element.getText();
			System.out.println(Value);
			if(Value.equals("Ola")) {
				System.out.println("Data is present");
				break;
			}
		}
		
		List<WebElement> companyNames = driver.findElements(By.xpath("//table[contains(@id,'cust')]//tr//td[2]"));
		System.out.println("Table data count" + companyNames.size());
		
		for(WebElement element:companyNames) {
			String Value = element.getText();
			System.out.println(Value);
		}
		
		driver.findElement(By.xpath("//td[text()='Selenium']//preceding-sibling::td//input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='Selenium']//following-sibling::td[3]//a")).click();
		//driver.quit();
	}

}

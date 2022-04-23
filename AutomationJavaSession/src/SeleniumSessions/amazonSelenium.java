package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazonSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		 Actions b = new Actions(driver);
		 b.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		 Thread.sleep(2000);		 
		 driver.findElement(By.linkText("Start here.")).click();
		 Thread.sleep(2000);	 
		 
		 WebElement passwordCheckBox = null;
		 try {
			 passwordCheckBox = driver.findElement(By.id("ap_password_check"));
		 }catch(Exception e) {
			 
		 }
		 
		 if(passwordCheckBox !=null)
		 {
			 System.out.println("Password 2 box is Displayed");
			 driver.findElement(By.id("ap_customer_name")).sendKeys("Junk data");
			 driver.findElement(By.id("ap_email")).sendKeys("Junk data");
			 driver.findElement(By.id("ap_password")).sendKeys("Junk data");
			 driver.findElement(By.id("ap_password_check")).sendKeys("Junk data");
			 driver.findElement(By.id("continue")).click();
		 }
		 else {
			 System.out.println("Password 2 box is Not displayed");
			 driver.findElement(By.id("ap_customer_name")).sendKeys("Junk data");
			 driver.findElement(By.id("ap_phone_number")).sendKeys("Junk data");
			 driver.findElement(By.id("ap_email")).sendKeys("Junk data");
			 driver.findElement(By.id("ap_password")).sendKeys("Junk data");
			 driver.findElement(By.id("continue")).click();
			 
			 
		 } 
		 
		 
		driver.findElement(By.cssSelector("#a-page > div.a-section.a-padding-medium.auth-workflow > div.a-section.a-spacing-none.auth-navbar > div > a > i.a-icon.a-icon-logo")).click(); 
		
		driver.findElement(By.linkText("Today's Deals")).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//span[contains(text(),'Beauty & Makeup')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		
		driver.findElement(By.xpath("//span[@aria-label='Sort deals by']")).click();
		new Select(driver.findElement(By.id("sorting_dropdown0")));
		driver.findElement(By.id("BY_PRICE_ASCENDING")).click();
		
	}

}

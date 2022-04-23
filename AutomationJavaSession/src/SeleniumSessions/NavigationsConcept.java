package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationsConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.ebay.com/");
		Thread.sleep(2000);
		
		driver.navigate().back(); // Google page
		Thread.sleep(2000);
		
		driver.navigate().forward(); //Ebay page
		Thread.sleep(2000);
		
		driver.navigate().refresh(); //Refresh page
		Thread.sleep(2000);
	}

}

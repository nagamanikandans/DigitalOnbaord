package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Chrome Browser
		//WebDriver --> Interface
		//driver --> Reference variable to refer ChromeDriver Object
		
	/*	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch CHrome browser
		driver.get("http://www.google.com"); // Enter URL
		driver.manage().window().maximize();		
		String title = driver.getTitle();
		System.out.println(title);
		
		//validation point
		if(title.equals("Google")) {
			System.out.println("Correct Title");
		}else {
			System.out.println("Wrong Title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		/*
		 1. Launch browser
		 2. Enter URL
		 3. Get Title
		 4. Validation
		 5. Get currentURL
		 6. close the browser
		 */
		
		//Firefox Browser
		//geckodriver
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
	}

}

package check;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch CHrome browser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); 
		
	/*	System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); */
		
		driver.manage().window().maximize();	
		Thread.sleep(3000);
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
		Alert alertPopUp = driver.switchTo().alert();
		
		System.out.println(alertPopUp.getText());
		
		String popupText = alertPopUp.getText();
		
		if(popupText.equals("Please enter a valid user name")) {
			System.out.println("Test case Passed");
		}
		else {
			System.out.println("Test case Failed");
		}
		alertPopUp.accept();
		Thread.sleep(2000);
		//alertPopUp.dismiss();
		
		driver.quit();
		
	}

}

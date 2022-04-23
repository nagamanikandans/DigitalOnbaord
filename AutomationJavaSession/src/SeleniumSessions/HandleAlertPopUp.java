package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlertPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alertPopup = driver.switchTo().alert();
		
		System.out.println(alertPopup.getText());
		
		String popupText = alertPopup.getText();
		
		if(popupText.equals("Please enter a valid user name")) {
			System.out.println("Test case is passed");
		}else {
			System.out.println("Test case is failed");
		}
		
		alertPopup.accept(); // --->  To click on OK button
		
		//alertPopup.dismiss(); --> To click on cancel button inside the popup
	}

}

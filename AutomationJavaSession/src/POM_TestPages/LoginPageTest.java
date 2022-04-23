package POM_TestPages;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM_PageClass.LoginPage;

public class LoginPageTest {

	
	@Test
	public void verifyValidLogin() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		LoginPage login = new LoginPage(driver);
		
		login.typeUserName("nagamanikanda@Rediff.com");
		login.typePassword("Test1234");
		login.clickOnLoginButton();
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void verifyInValidLogin() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		LoginPage login = new LoginPage(driver);
		
		login.typeUserName("Invalid Data");
		login.typePassword("Test1234");
		login.clickOnLoginButton();
		Thread.sleep(2000);
		driver.quit();
	}
	
	
}

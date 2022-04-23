package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	FirefoxDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.google.com/");
	}

	@Test()
	public void googleTitleTestAssertion() { //2
		String title = driver.getTitle();
		System.out.println(title);		
		Assert.assertEquals(title, "Google123", "Title is not Matched");
	}
	
	@Test()
	public void googleLogoTest() { //1
		boolean b = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
		Assert.assertTrue(b);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

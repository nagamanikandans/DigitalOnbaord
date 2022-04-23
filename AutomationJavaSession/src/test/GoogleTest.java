package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	FirefoxDriver driver;
	
	
	// beforemethod //Test //AfterMethod --> GoogleLogoTest
	// beforemethod //Test //AfterMethod --> GoodleTitleTest
	// beforemethod //Test //AfterMethod --> MailLinkTest
	
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

	@Test(priority=1, groups = "Title")
	public void googleTitleTest() { //2
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2, groups = "Logo")
	public void googleLogoTest() { //1
		boolean b = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
	}
	
	@Test(priority=3, groups = "Link Test")
	public void mailLinkText() { //3
		boolean b1 = driver.findElement(By.linkText("gmail")).isDisplayed();
	}
	
	@Test(priority = 4, groups = "Test")
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(priority = 5, groups = "Test")
	public void test2() {
		System.out.println("Test 1");
	}
	
	@Test(priority = 6, groups = "Test")
	public void test3() {
		System.out.println("Test 1");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

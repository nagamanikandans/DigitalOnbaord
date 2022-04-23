package testNGdataProvider;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utilities.TestUtil;

public class dataProviderTest {

	FirefoxDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	
	@DataProvider
	public Iterator<Object[]> getTestData() {	
		
		ArrayList<Object[]> testData = TestUtil.getDataFomExcel();
		return testData.iterator();
	}
	
	
	@Test(dataProvider = "getTestData")
	public void rediffRegistrationTest(String fullname, String mail1, String password1, String password2, String mail2, String mobilenumber) throws InterruptedException {
		
		
		//Enter data in the registration Page
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(3) > td:nth-child(3) > input[type=text]")).clear();
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(3) > td:nth-child(3) > input[type=text]")).sendKeys(fullname);
		
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(7) > td:nth-child(3) > input[type=text]:nth-child(1)")).clear();
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(7) > td:nth-child(3) > input[type=text]:nth-child(1)")).sendKeys(mail1);
		
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(10) > td:nth-child(3) > input[type=password]")).clear();
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(10) > td:nth-child(3) > input[type=password]")).sendKeys(password1);
		
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(12) > td:nth-child(3) > input[type=password]")).clear();
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(12) > td:nth-child(3) > input[type=password]")).sendKeys(password2);
		
		driver.findElement(By.cssSelector("#div_altemail > table > tbody > tr:nth-child(1) > td:nth-child(3) > input[type=text]")).clear();
		driver.findElement(By.cssSelector("#div_altemail > table > tbody > tr:nth-child(1) > td:nth-child(3) > input[type=text]")).sendKeys(mail2);
		
		driver.findElement(By.id("mobno")).clear();
		driver.findElement(By.id("mobno")).sendKeys(mobilenumber);
		Thread.sleep(3000);
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException{
		driver.quit();
		Thread.sleep(2000);
	}
}

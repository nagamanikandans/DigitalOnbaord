package digitalOnboard.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import digitalOnboard.base.TestBase;
import digitalOnboard.pages.HomePage;

public class HomePageTest extends TestBase {

	HomePage homepage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		intialization();
		homepage = new HomePage();
	}
	
	@Test(priority = 1)
	public void onBoardLogoTest() throws IOException {
		boolean logoTest = homepage.validateOnboardLogo();
		Assert.assertTrue(logoTest);
		takeScreenshot("onBoardLogo");
	}
	
	@Test(priority = 2)
	public void navigateLoginPage() throws InterruptedException, IOException {
		homepage.signInAsCompany();
		takeScreenshot("loginPage");
	}
	
	@Test(priority = 3)
	public void navigateCompanyRegistrationPage() throws InterruptedException, IOException {
		homepage.registerAsCompany();
		takeScreenshot("companyRegistration");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	public static void takeScreenshot(String fileName) throws IOException{
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, 
				new File("D:\\Selenium\\AutomationTraining\\DigitalOnBoardAutomation\\screenshots\\" + fileName +".png"));

	}
}

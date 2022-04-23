package digitalOnboard.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import digitalOnboard.base.TestBase;
import digitalOnboard.pages.CompanyRegistrationPage;
import digitalOnboard.pages.HomePage;
import digitalOnboard.util.TestUtil;

public class CompanyRegistrationPageTest extends TestBase{

	HomePage homepage;
	CompanyRegistrationPage companypage;
	
	String sheetname = "companyregistration";
	
	public CompanyRegistrationPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		intialization();
		homepage = new HomePage();
		companypage = new CompanyRegistrationPage();
		homepage.registerAsCompany();
	}
	
	@DataProvider
	public Object[][] getDigitalOnboardTestData() {
		Object data[][] = TestUtil.getTestData(sheetname);
		return data;
	}
	
//	@Test(priority = 1)
//	public void registerNewUser() throws InterruptedException {
//		companypage.newRegistration("ITGalax", "123", "456", "Testname", "test@gamil.com", "5656112233");
//	}
	
	@Test(priority = 1, dataProvider = "getDigitalOnboardTestData")
	public void registerNewUser(String compname, String BRnumber, String TAXnumber, String ContactName, String mailID, String contactNum) throws InterruptedException, IOException {
		companypage.newRegistration(compname, BRnumber, TAXnumber, ContactName, mailID, contactNum);
		takeScreenshot("Dat1");
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

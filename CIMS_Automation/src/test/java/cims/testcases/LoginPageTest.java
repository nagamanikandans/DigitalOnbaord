package cims.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cims.base.TestBase;
import cims.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void authorizedUserLogin() {
		loginpage.loginAsSuperAdmin();
	}
	

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

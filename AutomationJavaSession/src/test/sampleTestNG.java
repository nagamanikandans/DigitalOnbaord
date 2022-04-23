package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTestNG {

	//Pre Conditions
	@BeforeSuite  //1
	public void SetUp() {
		System.out.println("Setup system property");
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@BeforeMethod  //4
	public void enterURL() {
		System.out.println("Enter URL");
	}
	
	@BeforeClass() //3
	public void login() {
		System.out.println("Login to Application");
	}
	
	// 1. BeforeMethod
	// 2. Test
	// 3. After Method
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	
	// 1. BeforeMethod
	// 2. Test
	// 3. After Method
	@Test
	public void googleLogoTest() {
		System.out.println("Google Logo Test");
	}
	
	//Post conditions
	@AfterMethod //6
	public void logOut() {
		System.out.println("LogOut from Application");
	}
	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
}

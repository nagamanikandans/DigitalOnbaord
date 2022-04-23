package POM_TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM_PageClass.BrowserFactory;
import POM_PageClass.LoginPageNew;

public class LoginPageNewTes {

	@Test
	public void checkLogin_WithValidCredentials() {
		
		//This will launch the Browser and specific url
		WebDriver driver = BrowserFactory.startBrowser("firefox", "https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Create page object using page factory
		LoginPageNew login_page = PageFactory.initElements(driver, LoginPageNew.class);
		
		//call the Method
		login_page.LoginMail("nagamanikadans", "Test1234");
	}
	
	public void checkLogin_WithInValidCredentials() {

		WebDriver driver = BrowserFactory.startBrowser("firefox", "https://mail.rediff.com/cgi-bin/login.cgi");
		LoginPageNew login_page = PageFactory.initElements(driver, LoginPageNew.class);
		login_page.LoginMail("invalidCredentials", "Test1234");	
	}
	
	public void testCase3(){
		WebDriver driver = BrowserFactory.startBrowser("firefox", "https://mail.rediff.com/cgi-bin/login.cgi");
		LoginPageNew login_page = PageFactory.initElements(driver, LoginPageNew.class);
		login_page.LoginMail("valid Credentials", "Invalid Password");	
	}
}

package POM_PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {

	WebDriver driver;
	
	public LoginPageNew(WebDriver adriver) {
		this.driver = adriver;
	}
	
	@FindBy(id = "login1") 
	WebElement username;
	
	@FindBy(name = "passwd") 
	WebElement password;
	
	@FindBy(name = "login") 
	WebElement username_Name;
	
//	@FindBy(how = How.NAME,using = "proceed") 
//	WebElement SignInButton;
	
	@FindBy(name = "proceed") 
	WebElement SignInButton;
	
	
	public void LoginMail(String uid, String pwd) {
		username.sendKeys(uid);
		password.sendKeys(pwd);
		SignInButton.click();
	}
}

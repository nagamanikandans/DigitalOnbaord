package cims.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cims.base.TestBase;


public class LoginPage extends TestBase{

	@FindBy(id = "mat-input-0")
	WebElement username;
	
	@FindBy(id = "mat-input-1")
	WebElement password;
	
	@FindBy(xpath = "//span[text()='LOGIN']")
	WebElement loginButton;
		
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public UserSearch loginAsSuperAdmin() {
		username.sendKeys(prop.getProperty("admin_username"));
		password.sendKeys(prop.getProperty("admin_password"));
		loginButton.click();
		return new UserSearch();
	}
	
	public void withoutUserNamePassword() {
		loginButton.click();
	}
}

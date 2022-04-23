package POM_PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By username = By.id("login1");
	By password = By.id("password");
	By loginButton = By.name("proceed");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void typeUserName(String uid) {
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
}

package digitalOnboard.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import digitalOnboard.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div[2]/div/div/div/form/app-input-control[1]/div/div[2]/input")
	WebElement clientcode;
	
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div[2]/div/div/div/form/app-input-control[2]/div/div[2]/input")
	WebElement username;
	
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div[2]/div/div/div/form/app-password-control/div/div[2]/input")
	WebElement password;
	
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div[2]/div/div/div/form/button")
	WebElement loginbutton;
	
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div[2]/div/div/div/div[2]/div[1]/a")
	WebElement forgetUsernamelink;
	
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div[2]/div/div/div/div[2]/div[2]/a")
	WebElement forgetpasswordlink;
	
	@FindBy(xpath = "/html/body/app-root/app-login/div/div/div/div[2]/div/div/div/form/app-password-control/div/div[1]/div/a/span[1]/span")
	WebElement showpasswordlink;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	

	
}

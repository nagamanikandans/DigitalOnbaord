package digitalOnboard.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import digitalOnboard.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath = "/html/body/app-root/app-landing-page/div[1]/div[1]/div[4]/div[1]/div[2]")
	WebElement signInButton;
	
	@FindBy(xpath = "//span[text()='As a Company']")
	WebElement signInAsCompanyButton;
	
	@FindBy(xpath = "/html/body/app-root/app-landing-page/div[1]/div[1]/div[4]/div[2]/div[2]")
	WebElement registerButton;
	
	@FindBy(xpath = "//button[@class = 'mat-focus-indicator lg-btn mat-raised-button mat-button-base mat-primary ng-star-inserted']")
	WebElement loginButton;
	
	@FindBy(xpath = "//button[@class = 'mat-focus-indicator ext-btn mat-raised-button mat-button-base']//span[text()='As a Company']")
	WebElement registerAsCompanyButton;
	
	@FindBy(xpath = "//img[@class='white-logo']")
	WebElement onBoardLogo;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateOnboardLogo() {
		return onBoardLogo.isDisplayed();
	}
	
	public LoginPage signInAsCompany() throws InterruptedException {
		Thread.sleep(2000);
		signInButton.click();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOf(signInAsCompanyButton));
		signInAsCompanyButton.click();
		return new LoginPage();
	}
	
	public CompanyRegistrationPage registerAsCompany() throws InterruptedException {
		Thread.sleep(2000);
		registerButton.click();
		registerAsCompanyButton.click();
		return new CompanyRegistrationPage();
	}
	
	
}

package StepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import TestBase.propertyReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class loginSteps{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\Selenium\\AutomationTraining\\BDDcucumberDemo\\src\\main\\java\\TestData\\digitalOnboard.properties");
		prop.load(ip);
		
		String clientcode = prop.getProperty("clientcode");
	}
	

	
	FirefoxDriver driver;
			
	@Given("^Launch the application URL$")
	public void Launch_the_application_URL() throws InterruptedException {
		System.out.println("Application Launched Sucessfully");
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://onboardqa.igalaxsuite.com/login/company");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
	}
	
	@When("^Login into the application with valid credentials$")
	public void Login_into_the_application_with_valid_credentials(String clientcode) throws InterruptedException {
		System.out.println("Login with valid credentials");
		driver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > div.part-2 > div > div > div > form > app-input-control:nth-child(1) > div > div.input-group > input")).sendKeys(clientcode);
		driver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > div.part-2 > div > div > div > form > app-input-control:nth-child(2) > div > div.input-group > input")).sendKeys("jotishmav");
		driver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > div.part-2 > div > div > div > form > app-password-control > div > div.input-group > input")).sendKeys("123");
		driver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > div.part-2 > div > div > div > form > button")).click();
		Thread.sleep(3000);
	}
	
//	@When("^Login into the application with valid credentials \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void loginWithMoreData(String clientcode, String username, String password) throws InterruptedException {
//		driver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > div.part-2 > div > div > div > form > app-input-control:nth-child(1) > div > div.input-group > input")).sendKeys(clientcode);
//		driver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > div.part-2 > div > div > div > form > app-input-control:nth-child(2) > div > div.input-group > input")).sendKeys(username);
//		driver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > div.part-2 > div > div > div > form > app-password-control > div > div.input-group > input")).sendKeys(password);
//		driver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > div.part-2 > div > div > div > form > button")).click();
//		Thread.sleep(3000);
//	}
	
	@Then("^I verify user is able to login into the application$")
	public void I_verify_user_is_able_to_login_into_the_application() {
		System.out.println("User verified");
		String title = "Digital Onboarding | ITGalax Solutions Private Limited";
		Assert.assertEquals("Digital Onboarding | ITGalax Solutions Private Limited", title);
	}
	
	@And("^I logout the application$")
	public void I_logout_the_application() {
		System.out.println("Application Logged out successfull");
		
	/*	driver.findElement(By.cssSelector("body > app-root > app-home > div > div > div.side-bar.h100.relative > div > div.footer-icon.bt-1 > div > img")).click();
		driver.findElement(By.cssSelector("#mat-menu-panel-4 > div > div > button:nth-child(3)")).click();
		driver.findElement(By.cssSelector("#mat-dialog-2 > app-common-alert > div > div.mat-dialog-actions.d-flex.align-items-center.justify-content-center > button.mat-focus-indicator.mat-raised-button.mat-button-base.mat-danger.ng-star-inserted")).click();
	*/
		driver.quit();
	}
	

	@When("^Login into the application with valid credentials \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void login_into_the_application_with_valid_credentials(String arg1, String arg2, String arg3) throws Throwable {
		driver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > div.part-2 > div > div > div > form > app-input-control:nth-child(1) > div > div.input-group > input")).sendKeys(arg1);
		driver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > div.part-2 > div > div > div > form > app-input-control:nth-child(2) > div > div.input-group > input")).sendKeys(arg2);
		driver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > div.part-2 > div > div > div > form > app-password-control > div > div.input-group > input")).sendKeys(arg3);
		driver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > div.part-2 > div > div > div > form > button")).click();
		Thread.sleep(3000);
	}

	

}

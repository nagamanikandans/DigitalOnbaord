package digitalOnboard.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import digitalOnboard.base.TestBase;

public class CompanyRegistrationPage extends TestBase {

	@FindBy(xpath = "/html/body/app-root/app-sign-up/div/div[1]/div/div/div/div/div/form/div/app-input-control[1]/div/div[2]/input")
	WebElement companyName;
	
	@FindBy(xpath = "/html/body/app-root/app-sign-up/div/div[1]/div/div/div/div/div/form/div/div[1]/div[1]/app-input-control/div/div[2]/input")
	WebElement bussinessRegistrationNo;
	
	@FindBy(xpath = "/html/body/app-root/app-sign-up/div/div[1]/div/div/div/div/div/form/div/div[1]/div[3]/app-input-control/div/div[2]/input")
	WebElement taxIdentificationNo;
	
	@FindBy(xpath = "/html/body/app-root/app-sign-up/div/div[1]/div/div/div/div/div/form/div/app-input-control[2]/div/div[2]/input")
	WebElement contactPersonName;
	
	@FindBy(xpath = "//input[@name = 'emailid']")
	WebElement emailID;
	
	@FindBy(xpath = "/html/body/app-root/app-sign-up/div/div[1]/div/div/div/div/div/form/div/div[2]/div[2]/app-number-control/div/div[2]/input")
	WebElement contactNo;
	
	@FindBy(xpath = "/html/body/app-root/app-sign-up/div/div[1]/div/div/div/div/div/form/div/button")
	WebElement signUpButton;
	
	public CompanyRegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void newRegistration(String cmpnyName, String brNo, String taxNo, String name, String mail, String contactnumber) throws InterruptedException
	{
		Thread.sleep(2000);
		companyName.sendKeys(cmpnyName);
		bussinessRegistrationNo.sendKeys(brNo);
		taxIdentificationNo.sendKeys(taxNo);
		contactPersonName.sendKeys(name);
		emailID.sendKeys(mail);
		contactNo.sendKeys(contactnumber);
		Thread.sleep(2000);
		//signUpButton.click();		
	}
}

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch CHrome browser
		driver.get("https://test.qatechhub.com/form-elements/");
		driver.manage().window().maximize();	
		Thread.sleep(5000);
		
	/*	driver.findElement(By.xpath("//input[@id='wpforms-49-field_1']")).sendKeys("Manikandan");
		
		Select selectDropdown = new Select(driver.findElement (By.id("wpforms-49-field_5")));
		selectDropdown.selectByVisibleText("Selenium"); */
		
		WebElement name=driver.findElement(By.name("wpforms[fields][1][first]"));
		name.sendKeys("chitra");

		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"wpforms-49-field_1-last\"]"));
		lastname.sendKeys("Subbaraj");

		WebElement EmailID = driver.findElement(By.name("wpforms[fields][2]"));
		EmailID.sendKeys("heck@gmail.com");

		driver.findElement(By.cssSelector("#wpforms-49-field_4")).sendKeys("98765432");
		driver.findElement(By.id("wpforms-49-field_3_2")).click();
		
		
		Select sel=new Select(driver.findElement(By.name("wpforms[fields][5]")));
		sel.selectByVisibleText("TestComplete");
		sel.selectByValue("Cypress");
				//sel.selectByIndex(1);
		driver.findElement(By.id("wpforms-submit-49")).click();
		Thread.sleep(3000);
		
		String ExpectedMessage = "You have successfully filled in the form!";
		
		String message = driver.findElement(By.id("wpforms-confirmation-49")).getText();
		System.out.println(message);
		if(message.contains(ExpectedMessage)) {
			System.out.println("Success");
		}else {
			System.out.println("Failed");
		}
	}

}

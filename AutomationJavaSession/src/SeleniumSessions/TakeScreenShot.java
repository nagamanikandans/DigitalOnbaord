package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver); //convert web driver object to take screenshot
		
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE); // Call Getscrennshot method to create image file
		
		//copy the image file to yout destination directory
		
		File destFile = new File("D:\\Selenium\\AutomationTraining\\AutomationJavaSession\\src\\SeleniumSessions\\screenshot1.png");
		
		FileHandler.copy(scrFile, destFile);
		
		driver.navigate().to("https://www.ebay.com/");
		Thread.sleep(2000);
		
		TakesScreenshot scrShot1 = ((TakesScreenshot)driver); //convert web driver object to take screenshot
		
		File scrFile1 = scrShot1.getScreenshotAs(OutputType.FILE); // Call Getscrennshot method to create image file
		
		//copy the image file to yout destination directory
		
		File destFile1 = new File("D:\\Selenium\\AutomationTraining\\AutomationJavaSession\\src\\SeleniumSessions\\screenshot2.png");
		
		FileHandler.copy(scrFile1, destFile1);
	}

}

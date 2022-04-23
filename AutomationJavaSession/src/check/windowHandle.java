package check;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		
		//driver.findElement(By.name("emailid")).sendKeys("Check");
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowID = it.next();
		System.out.println("Parent Window ID"+parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("Child Window ID"+childWindowID);
		
		driver.switchTo().window(childWindowID);
		
		driver.findElement(By.name("emailid")).sendKeys("Check");
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		Thread.sleep(2000);
		
		
	}

}

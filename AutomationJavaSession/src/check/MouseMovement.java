package check;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
//		Actions action = new Actions(driver);	
//		action.moveToElement(driver.findElement(By.linkText("Sports"))).build().perform();		
//		driver.findElement(By.linkText("Watersports")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();
		
		List <WebElement> TagList = driver.findElements(By.tagName("a"));
		
		System.out.println(TagList.size());
		
		for(int i = 0; i<TagList.size();i++) {
			String ListName = TagList.get(i).getText();
			System.out.println(ListName);
		}
		
		
	}

}

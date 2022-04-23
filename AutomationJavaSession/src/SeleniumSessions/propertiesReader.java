/**
 * 
 */
package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author nagamanikandans
 *
 */
public class propertiesReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\Selenium\\AutomationTraining\\AutomationJavaSession\\src\\com\\testdata\\config.properties");
		prop.load(ip);
			
		System.out.println(prop.getProperty("browser"));
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.id("login1")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("proceed")).click();	
		
	}

}

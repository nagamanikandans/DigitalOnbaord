package digitalOnboard.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import digitalOnboard.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"D:\\Selenium\\AutomationTraining\\DigitalOnBoardAutomation\\src\\main\\java\\digitalOnboard\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void intialization() {
		
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver_99.exe");
			driver = new ChromeDriver(); // launch CHrome browser
		}else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PageLoadTimeOut));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.ImplicitWait));
		
		driver.get(prop.getProperty("url"));
		
	}
}

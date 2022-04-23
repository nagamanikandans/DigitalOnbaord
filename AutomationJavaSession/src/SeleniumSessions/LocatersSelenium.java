package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch CHrome browser
		driver.get("https://chatbot.igalaxsuite.com/login");
		driver.manage().window().maximize();	
		Thread.sleep(3000);
		 
		//1. Xpath --> 2
		// Relative Xpath -->//input[@id='mat-input-0']
		// absolute Xpath --> /html/body/app-root/app-login/div/div[2]/div[2]/div/div[2]/div/div/div/form/mat-form-field[1]/div/div[1]/div[3]/input
//		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("ITGTEST");
//		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("muthukumark.itgalax@gmail.com");
		
		//2. id  --> 1
	//	driver.findElement(By.id("mat-input-0")).sendKeys("ITGTEST");
	//	driver.findElement(By.id("mat-input-1")).sendKeys("muthukumark.itgalax@gmail.com");
		
		//3. linkText --> Only used for links
	//	driver.findElement(By.linkText("Forgot Password?")).click();
		
		//4. name --> 3
//		driver.findElement(By.name("clientcode")).sendKeys("ITGTEST");
//		driver.findElement(By.name("userid")).sendKeys("muthukumark.itgalax@gmail.com");
//		
		//5. CSS selector --2
		driver.findElement(By.cssSelector("#mat-input-0")).sendKeys("ITGTEST");
		driver.findElement(By.cssSelector("#mat-input-1")).sendKeys("muthukumark.itgalax@gmail.com");
		
		//class name, partial link Text --> Not usefull
	}

}

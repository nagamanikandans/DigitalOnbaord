package TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class propertyReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\Selenium\\AutomationTraining\\BDDcucumberDemo\\src\\main\\java\\TestData\\digitalOnboard.properties");
		prop.load(ip);
	}
}

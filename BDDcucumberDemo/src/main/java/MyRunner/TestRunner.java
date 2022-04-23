package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Selenium\\AutomationTraining\\BDDcucumberDemo\\src\\main\\java\\Features\\login.feature",  //the path of the feature files
		glue={"StepDefinition"}, //the path of the step definition files
		format= {"pretty"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"~@Regression" }			
		)
public class TestRunner {

}

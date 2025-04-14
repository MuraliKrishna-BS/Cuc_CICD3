package StepDefinition;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;

public class Testccu1 {

	WebDriver Driver = new EdgeDriver();
	
	
	@Given("Test Step for Scenario of Feature1")
	public void Test_Step_for_Scenario_of_Feature1() throws InterruptedException {
		
		Driver.get("https://www.google.com");
		
		Thread.sleep(5000);
		
		Driver.quit();
	  
	  // url is given in Hook
	}



}

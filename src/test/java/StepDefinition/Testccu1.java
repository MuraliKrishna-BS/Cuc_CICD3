package StepDefinition;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;

public class Testccu1 {

	
	ChromeOptions Opt = new ChromeOptions();
	//optiion.addArguments("--headless=new");

	
	
	@Given("Test Step for Scenario of Feature1")
	public void Test_Step_for_Scenario_of_Feature1() throws InterruptedException {
		
		//Opt.addArguments("--headless=new");
		
		WebDriver Driver = new ChromeDriver(Opt);
		Driver.get("https://www.google.com");
		
		Thread.sleep(5000);
		
		Driver.quit();
	  
	  // url is given in Hook
	}



}

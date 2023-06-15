package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.ClassDriver;

public class StepdefExample {


	
	public static WebDriver driver;
@Given("^User Launched browser $")	
	public void launchedbrowser() {
	WebDriver driver = ClassDriver.Browser("https://www.amazon.com/");
	
	
}

@When("^User clicks on enter username and password textbox $")
	public void action() {
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("none@gmail.com");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	
	
}

@Then("^User is able to verify the Amazon website launched successfully$")
	public void verify() {
	
	
}
	
	
}

package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.ClassDriver;

public class StepdefExample {
	
	 WebDriver driver = null;
@Given("^User is Launching the browser$")	
	public void launchedbrowser() {
     driver = ClassDriver.Browser("https://www.amazon.com/");

	System.out.println("inside launched browser method");
}
@And("^User Navigates to Amazon website$")
public void openAmazonWebsite(){
	driver.get("https://www.amazon.com/");
System.out.println("Inside Open amazon method.");

}
@When("^User clicks on username textbox$")
	public void action() {
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	System.out.println("Inside clicks username method");
	
}
@And("^User enters valid username$")
public void userName() {
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("none@gmail.com");	
}
@And("^User Clicks on password textbox$")
public void passwordTextbox() {
	driver.findElement(By.xpath("//input[@id='continue']")).click();

}
@And("^User enters valid password$")
public void enterPassword() {
	System.out.println("inside enter password method");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("None222");
}
@And("^User Clicks on signin button$")
public void click() {
	driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
	System.out.println("inside click method");	
}
@Then("^User should be able to verify the name of user in Account&List dropdown$")
	public void verify() {
	System.out.println("Inside verification method");
	Assert.assertTrue(true);
}


@Given("User Logged in to Amazon")
public void user_Logged_in_to_Amazon() {
    
}

@When("User Clicks on search button")
public void user_Clicks_on_search_button() {
    
}

@When("User search multiple Shoes")
public void user_search_multiple_Shoes() {
    
}

@Then("User verify that all the items were avaiable for shopping")
public void user_verify_that_all_the_items_were_avaiable_for_shopping() {
   
}

@When("User search multiple Tshirt")
public void user_search_multiple_Tshirt() {
    
}

@When("User search multiple Shirt")
public void user_search_multiple_Shirt() {
    
}

@Given("User log in to Amazon")
public void user_log_in_to_Amazon() {
    
}

@Given("User Searched for Items")
public void user_Searched_for_Items() {
    
}

@When("User clicks on search textbox")
public void user_clicks_on_search_textbox() {
    
}

@When("User type Tshirt then click on search button")
public void user_type_Tshirt_then_click_on_search_button() {
    
}

@When("User clicks on the first Tshirt")
public void user_clicks_on_the_first_Tshirt() {
    
}

@Then("User is able to verify the first Tshirt was showing with more details")
public void user_is_able_to_verify_the_first_Tshirt_was_showing_with_more_details() {
}

@Then("User is able to verify add to cart button was showing")
public void user_is_able_to_verify_add_to_cart_button_was_showing() {
    
}





	
	
}

package stepdef;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import login.LoginSample;
import selenium.ClassDriver;
//@Listeners(listner.ListnerSample.class)
public class StepSauceDemo {
	WebDriver driver = null;
   public LoginSample ls;
	

	@Given("^User Navigate to Saucedemo website$")
	public void user_Navigates_to_Saucedemo_website() {
		 {
		     driver = ClassDriver.Browser("https://www.saucedemo.com/"); 
		     driver.get("https://www.saucedemo.com/");
		     }
	}
	
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		LoginSample ls = new LoginSample(driver);
		ls.enterUsername(username);
		ls.enterPassword(password);
		ls.clickLogin();
		driver.quit();
		
		}
	/*@When("User enters username as standard_user and password as secret_sauce")
	public void user_enters_username_as_standard_user_and_password_as_secret_sauce() {
	}

	@Then("user verify the success in step")
	public void user_verify_the_success_in_step() {
	    
	}

	@When("User enters username as locked_out_user and password as secret_sauce")
	public void user_enters_username_as_locked_out_user_and_password_as_secret_sauce() {
	    
	}

	@Then("user verify the Fail in step")
	public void user_verify_the_fail_in_step() {
	    
	}



		
	

	/*@When("User enters standard_user as Username and secret_sauce as Password")
	public void user_enters_standard_user_as_Username_and_secret_sauce_as_Password() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	    
	}

	@When("User enters locked_out_user as Username and secret_sauce as Password")
	public void user_enters_locked_out_user_as_Username_and_secret_sauce_as_Password() {
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	    
	}
	
	@Then("user verify the success in step")
	public void user_verify_the_success_in_step() {
		 String Actual = driver.findElement(By.className("title")).getText();
		 String Expected = "Products";
		 assertEquals(Actual, Expected);
		 System.out.println("Actual is -" + Actual);
		 driver.quit();
		 
	}

	@Then("user verify the Fail in step")
	public void user_verify_the_Fail_in_step() {
		String Actual =driver.findElement(By.xpath("//div[@class='error-message-container error']")).getText();
		String expected = "Epic sadface: Sorry, this user has been locked out.";
		 assertEquals(Actual, expected);
		 System.out.println("Actual is- "+ Actual);
		driver.quit();
	    
	}
	
	@Given("User logged into Saucedemo")
	public void user_logged_into_saucedemo() {
	    driver = ClassDriver.Browser("https://www.saucedemo.com/"); 
	    driver.get("https://www.saucedemo.com/");
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	    
	}

	@When("User click on Sauce Labs Backpack")
	public void user_click_on_sauce_labs_backpack() {
		driver.findElement(By.xpath("//a[@id='item_4_img_link']")).click();
	    
	}

	@Then("User verify the product detail is visible")
	public void user_verify_the_product_detail_is_visible() {
		
		String Actual = driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']")).getText();
		String Expected = "Sauce Labs Backpack";
		assertEquals(Actual,Expected);
		driver.quit();		
	}

	@Given ("User finds Sauce Labs Backpack")
	public void user_finds_sauce_labs_backpack() {
	     driver = ClassDriver.Browser("https://www.saucedemo.com/"); 
	     driver.get("https://www.saucedemo.com/");
	     driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
		    

		//driver.findElement(By.xpath("//a[@id='item_4_img_link']")).click();
	    
	}

	@When("User clicks ob Add to cart button")
	public void user_clicks_ob_add_to_cart_button() {
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();

	}

	@Then("User Clicks on cart icon to verify the product was added.")
	public void user_clicks_on_cart_icon_to_verify_the_product_was_added() {
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.id("checkout")).isDisplayed();
		driver.quit();
		
	}*/





}



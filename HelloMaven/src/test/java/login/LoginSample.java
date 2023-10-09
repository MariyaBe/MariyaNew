package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSample {
	 WebDriver driver;
	 
	 
	 By txt_username=By.id("user-name");
	 By txt_password=By.id("password");
	 By txt_loginbtn=By.id("login-button");
	 
	 public LoginSample(WebDriver driver) {
		this.driver=driver;
	 }
	
	public void enterUsername (String username) {
		driver.findElement(txt_username).sendKeys(username);
		
	}
	
	public void enterPassword (String password) {
		driver.findElement(txt_password).sendKeys(password);
		
	}
	public void clickLogin () {
		driver.findElement(txt_loginbtn).click();
		
	}
}

package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class FacebookLogin {
	@Test
	
	
	public void login() throws Exception {
		
		
		WebDriver driver = ClassDriver.Browser("https://www.facebook.com/");
		Thread.sleep(3000);
		File picture = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File save = new File(System.getProperty("user.dir")+ "/target/"+ "before.jpeg");
		FileHandler.copy(picture, save);
		
		driver.findElement(By.xpath("//input[@ id='email']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		File Picture2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File save2 = new File(System.getProperty("user.dir")+ "/target/"+"After.jpeg");
		FileHandler.copy(Picture2, save2);
		
		driver.findElement(By.xpath("//button[@ class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		Thread.sleep(5000);
		File picture3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File save3 = new File(System.getProperty("user.dir")+"/target/"+"Final.jpeg");
		FileHandler.copy(picture3, save3);
		
		
	}

}

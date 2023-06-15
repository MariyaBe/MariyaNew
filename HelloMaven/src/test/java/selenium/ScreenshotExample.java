package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
@Test
public class ScreenshotExample {
	
	public void ssmethod() throws Exception {
		
		WebDriver driver = ClassDriver.Browser("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		
		
		ScreenShotsClass.Screenshot(driver, "screenshotNew");

		driver.findElement(By.id("firstName")).sendKeys("Mariya");

		ScreenShotsClass.Screenshot(driver, "screenshotNew1");
		
		
	}
	
	
	
	

}

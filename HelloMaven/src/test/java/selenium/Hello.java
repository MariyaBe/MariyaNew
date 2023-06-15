package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Hello {

	@Test
	public void launchBrowser() throws Exception   {
		WebDriver driver = ClassDriver.Browser("https://demoqa.com/automation-practice-form");

		Thread.sleep(5000);
		
		driver.findElement(By.id("firstName")).sendKeys("Mariya");
		driver.findElement(By.id("lastName")).sendKeys("Begum");
		driver.findElement(By.xpath("//label[@for = 'gender-radio-2']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Elements')]" )).click();
		Thread.sleep(2000);
		driver.findElement(By.id("item-0")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("MARIYA BEGUM");

		driver.findElement(By.xpath("//input[@ id = 'userEmail']")).sendKeys("mariabegum7@gmail.com");

		driver.findElement(By.id("currentAddress")).sendKeys("123 Main st");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("123 Main St");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='submit']")).click();
		//Thread.sleep(2000);

		//driver.findElement(By.xpath("//li[@id='item-5']//span[contains(text(),'Links')]")).click();
		//driver.findElement(By.linkText("Created")).click();
		Thread.sleep(20000);
		driver.quit();
	}
	
	
	
	}



package selenium;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ClassA {

	
	@Test
	public void method() throws Exception {
		

		WebDriver driver = ClassDriver.Browser("https://demo.guru99.com/test/newtours/register.php");

				
		driver.manage().window().maximize();
		
		
		
		//Select sel = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		
		/*sel.selectByIndex(5);
		Thread.sleep(1000);
		sel.selectByValue("BANGLADESH");
		Thread.sleep(1000);
		sel.selectByVisibleText("ALGERIA");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://output.jsbin.com/osebed/2");
		
		//Select sel1 = new Select(driver.findElement(By.id("fruits")));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		//driver.navigate().to("https://output.jsbin.com/osebed/2");
		Thread.sleep(2000);
		Select sel1 = new Select(driver.findElement(By.id("fruits")));

		sel1.selectByIndex(1);
		Thread.sleep(3000);
		sel1.selectByValue("orange");
		Thread.sleep(3000);
		sel1.selectByVisibleText("Grape");
		Thread.sleep(3000);
		sel1.deselectByValue("orange");
		Thread.sleep(3000);
		sel1.deselectAll();*/
		
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		//List<WebElement> obj=driver.findElements(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']"));


		List<WebElement> obj = driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']"));
		Thread.sleep(000);
		
		System.out.println("Size is : " + obj.size());
		System.out.println(obj.get(1));
		
		for(WebElement element:obj) {
			
			String tmp = element.getText().toString();
			System.out.println(tmp);
			if(tmp.equalsIgnoreCase("sports")) {
				element.click();
			}
			
			
		}
		Thread.sleep(30000);
		driver.quit();
		
		
	}
}

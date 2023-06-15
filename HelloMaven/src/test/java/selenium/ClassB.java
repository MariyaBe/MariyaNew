package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ClassB {
	@Test
		
public void method1() throws Exception {
		
		WebDriver driver = ClassDriver.Browser("https://demo.guru99.com/test/newtours/");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		WebElement flights = driver.findElement(By.linkText("Flights"));
		Thread.sleep(3000);
		WebElement hotels = driver.findElement(By.linkText("Hotels"));
	    //Actions a = new Actions(driver);
		Actions a = new Actions(driver);
		a.moveToElement(flights).build().perform();
		Thread.sleep(3000);
		a.moveToElement(hotels).build().perform();
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement from = driver.findElement(By.xpath("//li[@id='credit1']"));
		Thread.sleep(3000);
		WebElement to = driver.findElement(By.xpath("//ol[@id='loan']"));
		WebElement from1 = driver.findElement(By.xpath("//li[@id='fourth']"));
		Thread.sleep(3000);
		WebElement to1=driver.findElement(By.xpath("//ol[@id='amt8']"));
		Actions ac = new Actions(driver);
		ac.dragAndDrop(from, to).build().perform();
		Thread.sleep(3000);
		ac.dragAndDrop(from1, to1).build().perform();
		
		WebElement c =driver.findElement(By.xpath("//li[@id='credit4']"));
		Actions aa = new Actions(driver);
		aa.click(c).build().perform();
		Thread.sleep(5000);

		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);

		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));

		Actions acc = new Actions(driver);
		acc.doubleClick(doubleclick).build().perform();
		
		
		
		Thread.sleep(30000);
		driver.quit();

	
	
	
		
	}
}

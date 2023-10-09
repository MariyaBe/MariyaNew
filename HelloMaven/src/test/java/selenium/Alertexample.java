package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Alertexample {
	
	@Test
	public void method1() throws Exception {
		
		WebDriver driver = ClassDriver.Browser("https://demoqa.com/alerts");

	
	driver.manage().window().maximize();
	
	//Thread.sleep(2000);
	//WebElement firstButton = driver.findElement(By.id("alertBox"));
	//firstButton.click();
	//Thread.sleep(2000);
    //driver.findElement(By.xpath("//div[contains (text(),'Alerts, Frame & Windows')]")).click();

	//driver.findElement(By.xpath("//li[@id='item-1']")).click();
	WebElement ele = driver.findElement(By.xpath("//button[@id='alertButton']"));
	ele.click();
	//Thread.sleep(2000);

	Alert al = driver.switchTo().alert();
	al.accept();
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	//Thread.sleep(3000);
	al.dismiss();
	//Thread.sleep(3000);
	driver.findElement(By.id("promtButton")).click();
	//Thread.sleep(1500);

	al.sendKeys("Hello Alert");
	al.accept();

	Actions ac =new Actions(driver);
	WebElement ele2 = driver.findElement(By.xpath("//div[contains(text(),'Elements')]"));
	//Thread.sleep(1500);

	ac.contextClick(ele2).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).build().perform();
		
	//Thread.sleep(30000);	
		driver.quit();
	}
	
	

}



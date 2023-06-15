package selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {

	@Test
	public void method() throws Exception {
		
		WebDriver driver = ClassDriver.Browser("https://www.w3schools.com/sql/");

		
	    String mainWindow=driver.getWindowHandle();
	    System.out.println(driver.getTitle());
	  driver.findElement(By.xpath("//a[contains(text(),'Try it Yourself')]")).click();
	    Thread.sleep(3000);
	 
	 driver.switchTo().window(mainWindow);
	    
	 driver.findElement(By.xpath("//a[@title='Java Tutorial']")).click();
	    Thread.sleep(3000);
	 driver.findElement(By.linkText("Java Output")).click();
	    Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[@class='w3-btn']")).click();
	   
	   
	  Set<String>windows= driver.getWindowHandles();
	  
	  int windowCount = windows.size();
	  System.out.println("windows Count "+ windowCount);
	  for(String child : windows) {
		  
		  if(mainWindow.equalsIgnoreCase(child)){
			  
			driver.switchTo().window(child);
			String title = driver.getTitle();
			 System.out.println("Parent window title : "+ title);
			 
			 
		  }
	  }
	  
	  
	   	 }}
	
	 

	 //Set <String> s =driver.getWindowHandles(); 
	 

	 //Set <String> windows = driver.getWindowHandles();
	 
	 
	 
	    //driver.findElement(By.xpath("//a[@title='SQL Tutorial']")).click();
	    //Thread.sleep(3000);
	    //String actualTitle = (driver.getTitle());
	    //System.out.println(actualTitle);
	    //String expectedTitle = "SQL Tutorial";

	    
	    
	    
	    


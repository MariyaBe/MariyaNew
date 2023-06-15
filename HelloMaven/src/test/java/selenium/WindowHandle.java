package selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {
	
	@Test
	public void method() throws Exception {
		
		WebDriver driver = ClassDriver.Browser("https://www.w3schools.com/css/css_tooltip.asp");

			    
	    List <WebElement>obj=driver.findElements(By.xpath("//a[@class='w3-btn w3-margin-bottom']"));
	    
	    List<WebElement> obj2 = driver.findElements(By.xpath("//a[@title='SQL Tutorial']"));
	    
	    for(WebElement element:obj) {
	    	element.click();
	    } 
	    for(WebElement element:obj2) {
	    	element.click();
	    } 
	    
	    System.out.println(driver.getWindowHandle());
	    System.out.println(driver.getWindowHandles());
	    
	    Set<String> set=driver.getWindowHandles();
	    int count = set.size();
	    String parent = driver.getWindowHandle();
	    
	    for(String ss : set) {
	    	if(!parent.equals(ss)) {
	    		driver.switchTo().window(ss);
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	    		Thread.sleep(5000);
	    		driver.close();
	    	}
	    	
	    	driver.switchTo().window(parent);
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//a[@id='navbtn_tutorials']")).click();
	    }
	   
	    Thread.sleep(30000);
	    driver.quit();
	    
	    
	  
		
	}

}

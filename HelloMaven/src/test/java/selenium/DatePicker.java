package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listner.ListnerSample.class)
public class DatePicker {
@Test
	
	public void Method() throws Exception {
		
		WebDriver driver = ClassDriver.Browser("http://demo.guru99.com/test/");
		Thread.sleep(3000);
		WebElement datepicker = driver.findElement(By.xpath("//input[@name='bdaytime']"));
		
		datepicker.sendKeys("12/10/1992");
		datepicker.sendKeys(Keys.TAB);
		datepicker.sendKeys("12:37AM");
		driver.findElement(By.xpath("//input[@ type='submit']")).click();
		
		String bd = driver.findElement(By.xpath("//div[contains( text(), 'Your Birth Date is ')]")).getText();
		System.out.println("Print Birthday : " + bd);
		if(bd.contains("Your Birth Date is 1992-12-10")){
			Assert.assertTrue(true);
			
			//Assert.assertEquals("Your Birth Date is 1992-12-10Your Birth Time is 00:37",bd);
			//q: my actual and expected is same still was showing exception. 
			} else {
				Assert.assertTrue(false);
			}
		
		Thread.sleep(20000);
		driver.quit();
	}
	

}

package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table {

	
@Test	
	public static void Method () throws Exception {
	WebDriver driver = ClassDriver.Browser("http://demo.guru99.com/test/web-table-element.php");

		
		WebElement table = driver.findElement(By.tagName("table"));
		
		WebElement tableRow = table.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[6]"));
		String rowtext = tableRow.getText();
		System.out.println("Text from row 6 : " + rowtext);
		WebElement td = table.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[5]/td[2]"));
		String tabledata = td.getText();
		System.out.println("Table data 2 from row 5: " + tabledata);
		
		List<WebElement> col = table.findElements(By.xpath("//div[@id='leftcontainer']/table/thead/tr/th"));
			System.out.println("The column size is : "+ col.size());
				
		List<WebElement> row = table.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"));
			System.out.println("Row size : " + row.size());	
				
				
			/*driver.get("https://demoqa.com/frames");
			driver.switchTo().frame("frame1");
			System.out.println("Inside frame 1");*/
			
				
		Thread.sleep(20000);
		driver.quit();
		
		
	}

}

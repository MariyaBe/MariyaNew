package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws Exception {

		WebDriver driver = ClassDriver.Browser("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/target/" + "Screenshot1.png");
		FileHandler.copy(screenshot,dest);
		Thread.sleep(3000);

		System.out.println(System.getProperty("user.dir"));
		
		driver.findElement(By.xpath("//div[contains(text(),'Elements')]")).click();
		Thread.sleep(5000);
		File Screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest2 = new File(System.getProperty("user.dir")+"/target/" + "Screenshot2.jpeg");
		FileHandler.copy(Screenshot2, dest2);
		
	}
		
	}



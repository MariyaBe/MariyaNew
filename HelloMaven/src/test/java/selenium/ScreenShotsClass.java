package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotsClass {

	public static void Screenshot (WebDriver driver, String screenshots) throws Exception{

		//ClassDriver.Browser();
		File shot =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File save = new File(System.getProperty("user.dir")+ "/target/"+screenshots+".jpeg");
		
		FileHandler.copy(shot, save);
		
	Thread.sleep(2000);
		

	}

}

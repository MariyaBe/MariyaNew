package listner;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import selenium.ScreenShotsClass;

public class ListnerSample implements ITestListener {


	
	public void onStart(ITestContext arg0) {
		System.out.println("On start method");
		/*File shot1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File save1 = new File(System.getProperty("user.dir")+"/target/"+screenshots+".jpeg");
		FileHandler.copy(shot1, save1);*/
	
	}
	public void onFinish(ITestContext arg0) {
		System.out.println("On finish method");
	}
	public void failed(ITestResult arg0) {
		System.out.println("On failed method");
	}
	public void skipped(ITestResult arg0) {
		System.out.println("On skipped method");
	}
	public void success(ITestResult arg0) {
		System.out.println("On success method");
		
		/*TakesScreenshot driver = null
		File shot =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshots = null;
		File save = new File(System.getProperty("user.dir")+"/target/"+screenshots+".jpeg");
		FileHandler.copy(shot, save);*/
	
	}
	
}

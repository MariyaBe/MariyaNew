package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassDriver {

	
	public static WebDriver Browser (String url) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\17184\\OneDrive\\Desktop\\chromedriver_win32N\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
}}

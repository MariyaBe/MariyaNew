package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassDriver {

	
	public static WebDriver Browser (String url) {

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\17184\\OneDrive\\Desktop\\chromedriver-win32La\\chromedriver");
		ChromeOptions op = new ChromeOptions();
		op.setBinary("\\Users\\17184\\OneDrive\\Desktop\\chrome-win64Ve\\chrome-win64");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get(url);

		return driver;
		
}}

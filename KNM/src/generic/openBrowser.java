package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class openBrowser implements auto_constant{
	public static WebDriver driver = null;

	@BeforeTest
	public void open() {
		
		System.setProperty(chromeKey, chromeValue);
		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");
		driver = new ChromeDriver(co);
		System.out.println("Web Browser Launched\n");
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("Website launched");
		
	}
	
	@AfterTest
	public void close() {
		
		driver.quit();
		System.out.println("Web Browser closed");
		
	}
	
}

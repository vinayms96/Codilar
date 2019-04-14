package generic;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class openbrowser implements auto_constant{
	public static WebDriver driver;
	@BeforeMethod
	public void open() {
		System.setProperty(key, value);
		ChromeOptions co = new ChromeOptions();
		co.setExperimentalOption("useAutomationExtension", false);
		co.addArguments("--headless");
		driver = new ChromeDriver(co);
		System.out.println("Chrome Browser Launched.\n");
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("URL entered for Search...");
		try {
			stats.stat(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}

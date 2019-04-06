package generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class openbrowser implements auto_constant{
	public WebDriver driver;
	@BeforeMethod
	public void open() {
		System.setProperty(key, value);
		ChromeOptions co = new ChromeOptions();
		co.setExperimentalOption("useAutomationExtension", false);
		co.addArguments("--headless");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}

package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class waiting{
	public static void waitVisi(WebDriver driver,WebElement element) {
		try {
		WebDriverWait w = new WebDriverWait(driver, 15);	
		w.until(ExpectedConditions.visibilityOf(element));
		}catch(Exception e) {
			Reporter.log("Element Not Found",true);
		}
	}
	
	public static void waitClick(WebDriver driver, WebElement element) {
		try {
			WebDriverWait w = new WebDriverWait(driver, 2);
			w.until(ExpectedConditions.elementToBeClickable(element));
			
		}catch(Exception e) {
			Reporter.log("Element not Clickable",true);
		}
	}
	
}

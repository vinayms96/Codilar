package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action extends openbrowser {
	
	public static void actMove(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public static void actClick(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).click().perform();
	}
	
}

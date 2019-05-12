package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class action extends openBrowser{

	static Actions a = new Actions(driver);
	public static void actClick(WebElement ele) {
		a.moveToElement(ele).click().build().perform();
	}
	
	public static void actMove(WebElement ele) {
		a.moveToElement(ele).perform();
	}
	
}

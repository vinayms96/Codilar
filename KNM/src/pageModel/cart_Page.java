package pageModel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart_Page {

	@FindBy(xpath = "//td[@class='col item']//a[contains(text(),'Aegyptius Bug')]")
	private WebElement cartProdName;

	@FindAll(@FindBy(xpath = "//div[@class='cart table-wrapper']/table"))
	private List<WebElement> allProdNames;

	@FindBy(xpath = "//li[@class='item']//button[@class='action primary checkout']")
	private WebElement goCheckout;

	// Constructor
	public cart_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void cartName() {

	}

	public void toCheckout(WebDriver driver) {
//		goCheckout.click();
//		action.actClick(goCheckout);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		if (js.executeScript("return document.readyState").equals("complete")) {
//			js.executeScript("arguments[0].scrollIntoView();", goCheckout);
//			js.executeScript("arguments[0].click();", goCheckout);
//			System.out.println("Going to Checkout Page...\n");
//		}else {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			generic.wait.waitClick(goCheckout);
			js.executeScript("arguments[0].scrollIntoView();", goCheckout);
			js.executeScript("arguments[0].click();", goCheckout);
			System.out.println("Going to Checkout Page...\n");
//		}
	}

}

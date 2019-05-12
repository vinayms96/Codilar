package pageModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.action;

public class prod_Page {

//	@FindBy(xpath = "(//button[@class=\"action primary tocart\"])[2]")
	@FindBy(xpath = "(//button[@id=\"product-addtocart-button\"])[3]")
	private WebElement addCart;

	@FindBy(xpath = "//div[@id=\"toast-container\"]/div")
	private WebElement toast;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement mini;

	@FindAll(@FindBy(xpath = "//ol[@id=\"mini-cart\"]/li"))
	private List<WebElement> miniList;

	@FindBy(xpath = "//ol[@id=\"mini-cart\"]/li[1]/..//strong/a")
	private WebElement miniProdName;

	@FindBy(xpath = "//div[@class=\"product-container\"]/..//span")
	private WebElement prodName;
	
	@FindBy(xpath = "//a[@class=\"action viewcart\"]")
	private WebElement goCart;

	// Constructor
	public prod_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void addToCart(WebDriver driver) {
		generic.wait.waitClick(addCart);
//		addCart.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",addCart);
		js.executeScript("arguments[0].click();", addCart);
//		action.actClick(addCart);
		System.out.println("Product Added to Cart\n");
	}

	public void toastMsg() {
		generic.wait.waitVisible(toast);
		toast.getAttribute("outerHTML");
		String check = String.valueOf("style");
		if (check == "display")
			System.out.println("<----Toast Msg Displayed---->\n");
		else
			System.out.println("<----Toast Msg Not Displayed---->\n");
	}

	public void clickCart() {
//		mini.click();
		action.actClick(mini);
		System.out.println("Minicart Displayed\n");
	}

	public void checkProd(WebDriver driver) {
		if (miniList.size() == 1) {
			Assert.assertEquals(prodName.getText(), miniProdName.getText());
			System.out.println("Product added to MiniCart is Verified\n");

		} else {
			for (int i = 0; i < miniList.size(); i++) {
				String miniName = driver.findElement(By.xpath("//ol[@id=\"mini-cart\"]/li["+i+"]/..//strong/a")).getText();
				if(miniName.equals(prodName.getText())) {
					System.out.println("Product added to MiniCart is Verified\n");
				}
			}
		}
	}
	
	public void toCart() {
		goCart.click();
		System.out.println("Cart page loading...\n");
	}

}

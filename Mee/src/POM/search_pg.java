package POM;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import generic.Action;
import generic.openbrowser;

public class search_pg extends openbrowser {

	// Finding WebElements
	@FindBy(xpath = "//input[@name=\"q\"]")
	private WebElement box;

	@FindBys(@FindBy(xpath = "//div[@class=\"searchautocomplete-placeholder UI-PLACEHOLDER\"]/ul/li"))
	public List<WebElement> allli;

	@FindBy(xpath = "//div[@id=\"product-options-wrapper\"]/.//ul[@id=\"configurable_swatch_color\"]/li/a")
	private WebElement swatch;

	@FindBy(xpath = "//button[@class=\"button btn-cart add-cart-btn\"]")
	private WebElement add;

	@FindBy(xpath = "(//div[@class=\"cart\"]/.//table/.//tbody)[2]/tr/td[2]/h2/a")
	private WebElement cartpop;

	@FindBy(xpath = "//div[@id=\"ajaxpro-notice-form\"]/a")
	private WebElement closepop;

	@FindBy(xpath = "//div[@class=\"header-minicart\"]/a")
	private WebElement headercart;

	@FindBy(xpath = "//div[@class=\"minicart-over\"]/ul/li/div/p/a")
	private WebElement miniName;

	@FindBy(xpath = "//div[@class=\"header-minicart\"]/a/span")
	private WebElement cliCart;

	@FindBy(xpath = "//tr[@class=\"whish-remove last even\"]/td[2]/a")
	private WebElement cartCheck;

	// Writing a Constructor
	public search_pg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	SoftAssert sa = new SoftAssert();

	// Methods to Execute
	public void searchbox(String name) {
		box.sendKeys(name);
	}

	public String select() {
		ArrayList<WebElement> al = new ArrayList<WebElement>();
		Random r = new Random();
		String ref = "";
		for (WebElement ele : allli) {
			al.add(ele);
		}
		int val = al.size();
		System.out.println("Search Suggestions Displayed: " + val);
		if (val == 1) {
			ref = al.get(val - 1).getAttribute("data-url");
			al.get(val - 1).click();
		} else {
			ref = al.get(val - 1).getAttribute("data-url");
			al.get(r.nextInt(val - 1)).click();
		}
		return ref;
	}

	public void selSwatch() {
		swatch.click();
	}

	public void ATC() {
		add.click();
	}

	public void checkpop(String expected) {
		try {
			cartpop.isDisplayed();
			String actual = cartpop.getText();
			System.out.println("Product name added to Cart: " + actual);
			try {
//				Assert.assertEquals(actual, expected);
				assertTrue("Cart Popup Does NOT has the Same product added", actual.equalsIgnoreCase(expected));
				System.out.println("Cart Popup has Same product that is added");
			} catch (Exception e) {
				System.out.println("Cart Popup Does NOT has the Same product added");
			}
		}catch(Exception e) {
			System.out.println("Element NOT Found");
		}
	}

	public void popClose() {
		closepop.click();
	}

	public void headMini() {
		Action.actMove(headercart);
	}

	public void miniProdName(String expected) {
		try {
			miniName.isDisplayed();
			String actual = miniName.getAttribute("textContent");
			System.out.println("Product name added to Cart: " + actual);
			try {
//				Assert.assertEquals(actual, expected);
				assertTrue("Minicart Does NOT has the Same product added", actual.equalsIgnoreCase(expected));
				System.out.println("Minicart has Same product that is added");
			} catch (Exception e) {
				System.out.println("Minicart Does NOT has the Same product added");
			}
		} catch (Exception e) {
			System.out.println("Element NOT Found");
		}
	}

	public void goCart() {
		Action.actClick(headercart);
	}

	public void cartName(String expected) {
//		waiting.waitVisi(driver, cartCheck);
		try {
			cartCheck.isDisplayed();
			String actual = cartCheck.getAttribute("textContent");
			System.out.println("Product name added to Cart: " + actual);
			try {
//				Assert.assertEquals(actual, expected);
				assertTrue("CartPage Does NOT has the Same product added", actual.equalsIgnoreCase(expected));
				System.out.println("CartPage has Same product that is added");
			} catch (Exception e) {
				System.out.println("CartPage Does NOT has the Same product added");
			}
		} catch (Exception e) {
			System.out.println("Element NOT found");
		}
//		cartCheck.click();
	}
}

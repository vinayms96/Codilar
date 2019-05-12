package pageModel;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.action;

public class cat_Listing {

	Random r = new Random();

	@FindAll(@FindBy(xpath = "//ol[@class=\"products list items product-items \"]/li"))
	private List<WebElement> prodSelect;
	
	@FindBy(xpath = "//ol[@class=\"products list items product-items \"]/li[1]//a")
	private WebElement defaultSelect;

	// Constructor
	public cat_Listing(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void product(WebDriver driver) {
		int rand = r.nextInt(15);
		System.out.println(rand);
		if (rand != 0) {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			action.actMove(driver.findElement(By.xpath("//ol[@class=\"products list items product-items \"]/li[" + rand + "]//a")));
			WebElement ele = driver.findElement(By.xpath("//ol[@class=\"products list items product-items \"]/li[" + rand + "]//a"));
			generic.wait.waitClick(ele);
//		ele.click();
			action.actClick(ele);
			System.out.println("List of " + prodSelect.size() + " products Displayed");
		} else {
			action.actClick(defaultSelect);
		}
	}
}

package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.action;


public class home_Page {
	
	@FindBy(xpath = "//a[@title=\"Close\"]")
	private WebElement popClose;
	
	@FindBy(css="button#btn-cookie-allow")
	private WebElement cookie;
	
	@FindBy (xpath ="//li[contains(@class,'ui-menu-item level0 fullwidth parent')]//a[@class='level-top']")
	private WebElement catLink;
	
	public home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void closePopup() {
		generic.wait.waitClick(popClose);
		System.out.println("Subscription popup Displayed");
		popClose.click();
		System.out.println("Subscription popup Closed");
	}
	
	public void category() {
//		catLink.click();
		generic.wait.waitClick(catLink);
		action.actClick(catLink);
		System.out.println("Clicked on a Category link\n");
	}
	
	public void closeCookie() {
		action.actClick(cookie);
		generic.wait.waitRefresh(catLink);
//		cookie.click();
	}
	
}

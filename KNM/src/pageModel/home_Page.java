package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_Page {

	@FindBy(xpath = "//a[@title=\"Close\"]")
	private WebElement popClose;
	
	public home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void closePopup() {
		generic.wait.waitClick(popClose);
		System.out.println("Subscription popup Displayed");
		popClose.click();
		System.out.println("Subscription popup Closed");
	}
	
}

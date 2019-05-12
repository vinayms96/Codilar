package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout_Page {

	@FindBy(xpath = "//span[contains(text(),'Continue to Payment Gateway')]")
	private WebElement place;
	
	@FindBy(xpath = "(//div[@data-role=\"checkout-messages\"])[2]/div/div")
	private WebElement errorMsg;
	
	@FindBy(xpath="(//div[@data-role=\"checkout-messages\"])[2]")
	private WebElement checkError;

	// Constructor
	public checkout_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void placeOrder() {
		place.click();
		checkError.getAttribute("outerHTML");
		if(!(String.valueOf("style")=="display: none;")) 
			System.out.println("Order Placed Successfully\n");
		else
			System.out.println(errorMsg.getText()+" :Error Msg is Displayed\n");
	}

}

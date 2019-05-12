package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.properties;

public class check_Page {

	@FindBy(xpath="//button[@class='action action-auth-toggle']")
	private WebElement Sign;
	
	@FindBy(xpath="//input[@id='login-email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='login-password']")
	private WebElement pwd;
	
	@FindBy(xpath="//aside[contains(@class,'_show')]//span[contains(text(),'Sign In')]")
	private WebElement submit;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement next;
	
	// Constructor
	public check_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
	}
	
	public void signin() {
		generic.wait.waitClick(Sign);
		Sign.click();
	}
	
	public void mailid() {
		email.sendKeys(properties.getProperty("username"));
		pwd.sendKeys(properties.getProperty("password"));
		submit.click();
		System.out.println("Logged in from Checkout Page\n");
	}
	
	public void nextPage() {
		next.click();
	}

}

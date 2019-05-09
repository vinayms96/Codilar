package testCases;

import org.testng.annotations.Test;

import generic.openBrowser;
import pageModel.home_Page;

public class homePage extends openBrowser{

	@Test
	public void home() {
		
		home_Page hp = new home_Page(driver);
		hp.closePopup();
		
	}
	
}

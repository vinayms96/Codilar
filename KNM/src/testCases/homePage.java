package testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import generic.openBrowser;
import pageModel.cart_Page;
import pageModel.cat_Listing;
import pageModel.check_Page;
import pageModel.checkout_Page;
import pageModel.home_Page;
import pageModel.prod_Page;

public class homePage extends openBrowser{

	
	
	@Test(priority=1)
	
	public void home() {
		
		home_Page hp = new home_Page(driver);
		hp.closePopup();
		hp.closeCookie();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		hp.category();
		
		cat_Listing cl = new cat_Listing(driver);
		cl.product(driver);
		
		prod_Page pp = new prod_Page(driver);
		pp.addToCart(driver);
//		pp.toastMsg();
		pp.clickCart();
		pp.checkProd(driver);
		pp.toCart();
		
		cart_Page cp = new cart_Page(driver);
		cp.toCheckout(driver);
		
		check_Page chp = new check_Page(driver);
		chp.signin();
		chp.mailid();
		chp.nextPage();
		
		checkout_Page chp2 = new checkout_Page(driver);
		chp2.placeOrder();
		
	}
	
}

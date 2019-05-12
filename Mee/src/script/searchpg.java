package script;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM.search_pg;
import generic.excel;
import generic.openbrowser;
import generic.stats;

public class searchpg extends openbrowser{
	
	@Test
	public void atc() throws InterruptedException {
		search_pg sp = new search_pg(driver);
		SoftAssert sa = new SoftAssert();
		
		String name = excel.getData(prod, sheet, 1, 0);
		sp.searchbox(name);
		System.out.println("Product Name entered in Searchbox\n");
//		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("Selected/Clicked on one of Search Suggestions\n");
		String expected = sp.select();
		try {
			String actual = driver.getCurrentUrl();
			stats.stat(actual);
			Assert.assertEquals(actual, expected);
//			sa.assertEquals(actual, expected);
			System.out.println("Product Page is Displayed\n");
//			Reporter.log("Product Page is Displayed\n", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Product page is not Displayed");
//			Reporter.log("Product page is not Displayed", true);
		}
		
		//Adding Product to Cart
		System.out.println("Adding Product to Cart...");
		sp.selSwatch();
		sp.ATC();
		System.out.println("Product Added to Cart\n");
		
		//Verifying the Product added to Cart
		System.out.println("1. Verifying the Product added in Cart Popup...");
		driver.switchTo().activeElement();
		sp.checkpop(name);
		sp.popClose();
		System.out.println("Cart Popup closed\n");
		System.out.println("2. Verifying the Product added in Minicart Popup...");
		driver.switchTo().activeElement();
		sp.headMini();
		sp.miniProdName(name);
		System.out.println();
		sp.goCart();
		System.out.println("3. Verifying the Product added in Cart Page...");
		sp.cartName(name);
		
		sa.assertAll();
	}
}

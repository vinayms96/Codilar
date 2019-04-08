package script;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.home_pg;
import generic.openbrowser;

public class homepg extends openbrowser {

	@Test
	public void banners() throws Exception {
		home_pg hp = new home_pg(driver);
		Properties prop = new Properties();
		prop.load(new FileInputStream("./data.properties"));
//		Assert sa = new Assert();

		// Header Ad
//		System.out.println("Header Ad: ");
//		hp.headerad(driver);
//		ArrayList<String> wind = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(wind.get(1));
//		stat(driver.getCurrentUrl());
//		driver.close();
//		driver.switchTo().window(wind.get(0));
//		
//		hp.miniad(driver);
//		String actual = (driver.findElement(By.xpath("//a[@class=\"open-close-offer\"]/i"))).getAttribute("class");
//	    try {
//		Assert.assertEquals(actual,"fa fa-angle-double-down");
//		System.out.println("Ad Minimized");
//	    }catch(Exception e) {
//	    	System.out.println("Minimizing Failed");
//	    }
//		
//		hp.miniad(driver);
//		actual = (driver.findElement(By.xpath("//a[@class=\"open-close-offer\"]/i"))).getAttribute("class");
//		try {
//		Assert.assertEquals(actual,"fa fa-angle-double-up");
//		System.out.println("Ad Maximized");
//	    }catch(Exception e) {
//	    	System.out.println("Maximizing Failed");
//	    }
//		
//		hp.closead(driver);
//		actual = (driver.findElement(By.xpath("//a[@class=\"cms_index_index_topbanner\"]/img"))).getAttribute("display");
//		sa.assertEquals(actual, "none");

		// Login
//		hp.log();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		hp.closelogin();
//		hp.clicklogo();
//		
//		//Deals
//		hp.deals();
//		stat(driver.getCurrentUrl());
//		
//		//Cart
//		hp.cart(driver);
//		stat(driver.getCurrentUrl());

		// Banners
//		System.out.println("Banners: ");
//		try {
//			stat(hp.ban1());
//			hp.clicklogo();
//
//			stat(hp.ban2());
//			hp.clicklogo();
//
//			stat(hp.ban3());
//			hp.clicklogo();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// Mega Menu
//		System.out.println("Mega Menu: ");
//		for(int num=1 ; num<=10 ; num++) {
//			WebElement ele = driver.findElement(By.xpath("//ol[@class=\"nav-primary\"]/li["+num+"]"));
//			hp.megamenu(driver,ele);
//			stat(driver.getCurrentUrl());
//			driver.navigate().back();
//		}

		// Most Impo
//		System.out.println("Most Impo: ");
//		for (int num = 1; num < 10; num++) {
//			try {
//			WebElement ele = driver.findElement(By.xpath("(//div[@class=\"info-picker\"])[" + num + "]/a"));
//			WebElement ele2 = driver.findElement(By.xpath("(//div[@class=\"item-row\"]/..//div[@class=\"thumb\"])["+num+"]"));
//				hp.shop(driver, ele, ele2);
////				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//				stat(driver.getCurrentUrl());
//				driver.navigate().back();
//			}catch(Exception e) {
//				System.out.println("Link "+num+" is not Clicked");
//			}
//		}

		// Milestone Products
//		System.out.println("Milestone Products:");
//		try {
//			hp.mileimg1(driver);
//		} catch (Exception e) {
//			System.out.println("Milestone link 1 not Clicked");
//		}
//		stat(driver.getCurrentUrl());
//		try {
//			hp.mileimg2(driver);
//		} catch (Exception e) {
//			System.out.println("Milestone link 1 not Clicked");
//		}
//		stat(driver.getCurrentUrl());
//		try {
//			hp.mileimg3(driver);
//		} catch (Exception e) {
//			System.out.println("Milestone link 1 not Clicked");
//		}
//		stat(driver.getCurrentUrl());

		// Maternity Kits
//		for (int i = 20; i < 22; i++) {
//			for (int num = 1; num < 4; num++) {
//				WebElement ele = driver.findElement(By.xpath("//div[@aria-describedby=\"slick-slide"+i+"\"]/div[2]/div/ul/li["+num+"]/a/span"));
//				hp.matercheck(driver, ele);
//				stat(driver.getCurrentUrl());
//				driver.navigate().back();
//			}
//		}
		
		//Subscribe
//		String val = properties.propData();
			//Click when No Data Entered
		hp.subcheckimg(driver);
		hp.subSubmit(driver);
		hp.mailid(prop.getProperty("check"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String actual = hp.emptySub();
		Thread.sleep(10000);
		try {
		Assert.assertEquals(actual, "This is a required field.");
		System.out.println("Error Msg Displayed");
		}catch(Exception e) {
			System.out.println("Error Msg NOT Displayed");
		}
//		hp.mailid(prop.getProperty("submail"));

//		sa.assertAll();
	}

	public void print() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
	}

	public void stat(String linkUrl) throws IOException {

		URL url;
		try {
			driver.get(linkUrl);
			url = new URL(linkUrl);
			HttpURLConnection check = (HttpURLConnection) url.openConnection();
			check.setConnectTimeout(5000);
			check.connect();
			System.out.println(driver.getTitle());
			System.out.println(linkUrl + ": " + check.getResponseCode());
			System.out.println();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void scroll() {

	}

}

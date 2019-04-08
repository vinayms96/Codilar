package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.waiting;

public class home_pg {
	
	//Header
	@FindBy(xpath="//div[@id=\"mm-0\"]/.//div[@class=\"container\"]/a")
	private WebElement ad;
	
	@FindBy(xpath="//a[@class=\"open-close-offer\"]")
	private WebElement minad;
	
	@FindBy(xpath="//button[@class=\"cancel-offer\"]")
	private WebElement closead;
	
	@FindBy(xpath="//header[@id=\"header\"]/.//div[@class=\"page-header-container\"]/a")
	private WebElement logo;
	
	@FindBy(xpath="//input[@class=\"input-text UI-SEARCH\"]")
	private WebElement search;
	
	@FindBy(xpath="//div[@class=\"nav-submit-button\"]/button[@type=\"submit\"]")
	private WebElement go;
	
	@FindBy(xpath="//div[@class=\"account-cart-wrapper\"]/button[@class=\"skip-link\"]")
	private WebElement login;
	
	@FindBy(xpath="//div[@class=\"Close\"]/a/i")
	private WebElement closelog;
	
	@FindBy(xpath="//div[@class=\"deal\"]/a")
	private WebElement deals;
	
	@FindBy(xpath="//div[@class=\"header-minicart\"]/a")
	private WebElement cart;
	
	//Mega Menu
//	@FindBy(xpath="(//nav[@id=\"nav\"]/ol/li)[1]/a")
//	private WebElement menu1;
//
//	@FindBy(xpath="(//nav[@id=\"nav\"]/ol/li)[2]/a")
//	private WebElement menu2;
//
//	@FindBy(xpath="(//nav[@id=\"nav\"]/ol/li)[3]/a")
//	private WebElement menu3;
//
//	@FindBy(xpath="(//nav[@id=\"nav\"]/ol/li)[4]/a")
//	private WebElement menu4;
//
//	@FindBy(xpath="(//nav[@id=\"nav\"]/ol/li)[5]/a")
//	private WebElement menu5;
//
//	@FindBy(xpath="(//nav[@id=\"nav\"]/ol/li)[6]/a")
//	private WebElement menu6;
//
//	@FindBy(xpath="(//nav[@id=\"nav\"]/ol/li)[7]/a")
//	private WebElement menu7;
//
//	@FindBy(xpath="(//nav[@id=\"nav\"]/ol/li)[8]/a")
//	private WebElement menu8;
//
//	@FindBy(xpath="(//nav[@id=\"nav\"]/ol/li)[9]/a")
//	private WebElement menu9;
//
//	@FindBy(xpath="(//nav[@id=\"nav\"]/ol/li)[10]/a")
//	private WebElement menu10;
	
	//Banners
	@FindBy(xpath="//div[@data-slick-index=\"0\"]/div/a")
	private WebElement banner1;
	
	@FindBy(xpath="//div[@data-slick-index=\"1\"]/div/a")
	private WebElement banner2;
	
	@FindBy(xpath="//div[@data-slick-index=\"2\"]/div/a")
	private WebElement banner3;
	
	@FindBy(xpath="//*[@id=\"slick-slide00\"]/button")
	private WebElement bannerbut1;
	
	@FindBy(xpath="//*[@id=\"slick-slide01\"]/button")
	private WebElement bannerbut2;
	
	@FindBy(xpath="//*[@id=\"slick-slide02\"]/button")
	private WebElement bannerbut3;
	
	//Most Impo Row1
	
//	By link = By.xpath("//div[@class=\"info-picker\"]/a");
	
//	@FindBy(xpath="//div[@class=\"image-item bg-pink\"]/div/img")
//	private WebElement row1img1;
//
//	@FindBy(xpath="//div[@class=\"image-item bg-sky\"]/div/img")
//	private WebElement row1img2;
//	
//	@FindBy(xpath="(//div[@class=\"info-picker\"])[1]/a[text()=\" SHOP \"]")
//	private WebElement row1img1shop;
//	
//	@FindBy(xpath="(//div[@class=\"info-picker\"])[2]/a[text()=\" SHOP \"]")
//	private WebElement row1img2shop;
//	
//	//Most Impo Row2
//	@FindBy(xpath="//div[@class=\"image-item small-block bg-green\"]/div/img")
//	private WebElement row2img1;
//	
//	@FindBy(xpath="//div[@class=\"image-item small-block bg-orange\"]/div/img")
//	private WebElement row2img2;
//	
//	@FindBy(xpath="//div[@class=\"image-item small-block bg-turquoise\"]/div/img")
//	private WebElement row2img3;
//	
//	@FindBy(xpath="(//div[@class=\"info-picker\"])[3]/a")
//	private WebElement row2img1shop;
//	
//	@FindBy(xpath="(//div[@class=\"info-picker\"])[4]/a")
//	private WebElement row2img2shop;
//	
//	@FindBy(xpath="(//div[@class=\"info-picker\"])[5]/a")
//	private WebElement row2img3shop;
	
	//Promo Message
	@FindBy(xpath="//div[@class=\"item-row\"]/div[@class=\"col col-12 col-sm-9 col-md-7 col-lg-6\"]/div/a")
	private WebElement row3img1;
	
	//Ordinary Products
	@FindBy(xpath="//div[@class=\"ordinary-products\"]/.//div[@class=\"col col-12 col-sm-6\"]/.//div[@class=\"image-description\"]/div/a")
	private WebElement ord_col1;
	
	@FindBy(xpath="((//div[@class=\"ordinary-products\"]/.//div[@class=\"col col-12 col-sm-6\"])[2]/.//div[@class=\"col col-6 col-sm-6\"])[1]/.//div[@class=\"image-description\"]/div/a")
	private WebElement ord_col2img1;
	
	@FindBy(xpath="((//div[@class=\"ordinary-products\"]/.//div[@class=\"col col-12 col-sm-6\"])[2]/.//div[@class=\"col col-6 col-sm-6\"])[2]/.//div[@class=\"image-description\"]/div/a")
	private WebElement ord_col2img2;
	
	@FindBy(xpath="//div[@class=\"ordinary-products\"]/.//div[@class=\"col col-12\"]/.//div[@class=\"image-description\"]/div/a")
	private WebElement ord_col2img3;
	
	//Milestone Products
	@FindBy(xpath="(//div[@class=\"item-row nomargin\"]/..//img)[1]/../a/span/span")
	private WebElement mileimg1;
	
	@FindBy(xpath="(//div[@class=\"item-row nomargin\"]/..//img)[1]")
	private WebElement milestoneimg1;
	
	@FindBy(xpath="(//div[@class=\"item-row nomargin\"]/..//img)[2]/../a/span/span")
	private WebElement mileimg2;
	
	@FindBy(xpath="(//div[@class=\"item-row nomargin\"]/..//img)[2]")
	private WebElement milestoneimg2;
	
	@FindBy(xpath="(//div[@class=\"item-row nomargin\"]/..//img)[3]/../a/span/span")
	private WebElement mileimg3;
	
	@FindBy(xpath="(//div[@class=\"item-row nomargin\"]/..//img)[3]")
	private WebElement milestoneimg3;
	
	@FindBy(xpath="(//div[@class=\"item-content\"])[1]/a")
	private WebElement milestonelink1;
	
	@FindBy(xpath="(//div[@class=\"item-content\"])[2]/a")
	private WebElement milestonelink2;
	
	@FindBy(xpath="(//div[@class=\"item-content\"])[3]/a")
	private WebElement milestonelink3;
	
	//Maternity Kit
	@FindBy(xpath="(//button[@class=\"slick-next slick-arrow\"])[2]/i")
	private WebElement next;
	
//	@FindBy(xpath="//ul[@class=\"product-type\"]/li[1]/a")
//	private WebElement matkitlink1;
//	
//	@FindBy(xpath="//ul[@class=\"product-type\"]/li[2]/a")
//	private WebElement matkitlink2;
//	
//	@FindBy(xpath="//ul[@class=\"product-type\"]/li[3]/a")
//	private WebElement matkitlink3;
	
//	@FindBy(xpath="//div[@aria-describedby=\"slick-slide20\"]")
//	private WebElement matcheck;
	
	@FindBy(xpath="//div[@class=\"bestseller\"]/.//div[@id=\"proslide\"]/.//div[@class=\"slick-track\"]/.//div[@data-slick-index=\"-4\"]")
	private WebElement bestlist;
	
	//Our Help
	@FindBy(xpath="(//div[@class=\"form-picker\"])[1]")
	private WebElement subimg;
	
	@FindBy(xpath="//input[@id=\"newsletter\"]")
	private WebElement submail;
	
	@FindBy(xpath="//button[@title=\"Subscribe\"]")
	private WebElement subsubmit;
	
	@FindBy(xpath="//ul[@class=\"messages\"]/li/ul/li/span")
	private WebElement successmsg;
	
	@FindBy(xpath="//div[@id=\"advice-required-entry-newsletter\"]")
	private WebElement emptycheck;
	
	@FindBy(xpath="(//div[@class=\"our-help\"]/.//div[@class=\"item-row\"]/div)[2]/.//div[@class=\"form-picker\"]/a")
	private WebElement helpcertificate;
	
	@FindBy(xpath="(//div[@class=\"our-help\"]/.//div[@class=\"item-row\"]/div)[3]/.//div[@class=\"form-picker\"]/form/input")
	private WebElement locatetext;
	
	@FindBy(xpath="(//div[@class=\"our-help\"]/.//div[@class=\"item-row\"]/div)[3]/.//div[@class=\"form-picker\"]/form/button/span")
	private WebElement locatesearch;
	
	//Footer Header
	@FindBy(xpath="(//div[@class=\"footer-container\"]/.//div[@class=\"footer-top\"]/div)[1]/a")
	private WebElement foothead1;
	
	@FindBy(xpath="(//div[@class=\"footer-container\"]/.//div[@class=\"footer-top\"]/div)[2]/a")
	private WebElement foothead2;
	
	@FindBy(xpath="(//div[@class=\"footer-container\"]/.//div[@class=\"footer-top\"]/div)[3]/a")
	private WebElement foothead3;
	
	@FindBy(xpath="(//div[@class=\"footer-container\"]/.//div[@class=\"footer-top\"]/div)[4]/a")
	private WebElement foothead4;
	
	@FindBy(xpath="(//div[@class=\"footer-container\"]/.//div[@class=\"footer-top\"]/div)[5]/a")
	private WebElement foothead5;
	
	//Footer Links Column1
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[1]/div/ul/li)[1]/a")
	private WebElement footcol1link1;
	
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[1]/div/ul/li)[2]/a")
	private WebElement footcol1link2;
	
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[1]/div/ul/li)[3]/a")
	private WebElement footcol1link3;
	
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[1]/div/ul/li)[4]/a")
	private WebElement footcol1link4;
	
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[1]/div/ul/li)[5]/a")
	private WebElement footcol1link5;
	
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[1]/div/ul/li)[6]/a")
	private WebElement footcol1link6;
	
	//Footer Links Column2
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[2]/div/ul/li)[1]/a")
	private WebElement footcol2link1;
	
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[2]/div/ul/li)[2]/a")
	private WebElement footcol2link2;
	
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[2]/div/ul/li)[3]/a")
	private WebElement footcol2link3;
	
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[2]/div/ul/li)[4]/a")
	private WebElement footcol2link4;
	
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[2]/div/ul/li)[5]/a")
	private WebElement footcol2link5;
	
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[2]/div/ul/li)[6]/a")
	private WebElement footcol2link6;
	
	//Footer Links Column3
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[3]/div/ul/li)[1]/a")
	private WebElement footcol3link1;
	
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[3]/div/ul/li)[2]/a")
	private WebElement footcol3link2;
	
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[3]/div/ul/li)[3]/a")
	private WebElement footcol3link3;
	
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[3]/div/ul/li)[4]/a")
	private WebElement footcol3link4;
	
	//Footer Links Column4
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[4]/div/ul/li)[1]/a")
	private WebElement footcol4link1;
	
	@FindBy(xpath="((//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/div/div/div/div)[4]/div/ul/li)[2]/a")
	private WebElement footcol4link2;
	
	//Footer Social Links
	@FindBy(xpath="(//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/.//div[@class=\"social-links\"]/ul/li)[1]/a")
	private WebElement footsocial1;
	
	@FindBy(xpath="(//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/.//div[@class=\"social-links\"]/ul/li)[2]/a")
	private WebElement footsocial2;
	
	@FindBy(xpath="(//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/.//div[@class=\"social-links\"]/ul/li)[3]/a")
	private WebElement footsocial3;
	
	@FindBy(xpath="(//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/.//div[@class=\"social-links\"]/ul/li)[4]/a")
	private WebElement footsocial4;
	
	@FindBy(xpath="(//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/.//div[@class=\"social-links\"]/ul/li)[5]/a")
	private WebElement footsocial5;
	
	@FindBy(xpath="(//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/.//div[@class=\"social-links\"]/ul/li)[6]/a")
	private WebElement footsocial6;
	
	//Footer Logo
	@FindBy(xpath="//div[@class=\"footer-container\"]/.//div[@class=\"footer-links\"]/.//div[@class=\"logo-moms\"]/a")
	private WebElement footlogo;
	
	//Footer Bottom Links
	@FindBy(xpath="(//div[@class=\"footer-container\"]/.//div[@class=\"footer-bottom\"]/.//div[@class=\"item-row\"]/div/a)[1]")
	private WebElement footbotlink1;
	
	@FindBy(xpath="(//div[@class=\"footer-container\"]/.//div[@class=\"footer-bottom\"]/.//div[@class=\"item-row\"]/div/a)[2]")
	private WebElement footbotlink2;
	
	public home_pg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void actMove(WebDriver driver,WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public void actClick(WebDriver driver,WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).click().perform();
	}
	
	public void scroll(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0",element.getLo
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public void headerad(WebDriver driver) {
		actClick(driver, ad);
	}
	
	public void miniad(WebDriver driver) {
		actClick(driver, minad);
	}
	
	public void closead(WebDriver driver) {
		actClick(driver, closead);
	}
	
	public String ban1() {
		return banner1.getAttribute("href");
	}
	
	public String ban2() {
		return banner2.getAttribute("href");
	}
	
	public String ban3() {
		return banner3.getAttribute("href");
	}
	
	public void banbut1() {
		bannerbut1.click();
	}
	
	public void banbut2() {
		bannerbut2.click();
	} 
	
	public void banbut3() {
		bannerbut3.click();
	}
	
	//Logo
	public void clicklogo() {
		logo.click();
	}
	
	//Login
	public void log() {
		login.click();
	}
	
	public void closelogin() {
		closelog.click();
	}
	
	//Deals
	public void deals() {
		deals.click();
	}
	
	//Cart
	public void cart(WebDriver driver) {
		actMove(driver, cart);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		actClick(driver, cart);
	}
	
	//Mega Menu
	public void megamenu(WebDriver driver,WebElement ele) {
		actClick(driver, ele);
	}
	
//	//Most Impo Row1
	
	public void shop(WebDriver driver,WebElement ele, WebElement ele2) {
//		scroll(driver, ele2);
		waiting.waitVisi(driver, ele2);
		actMove(driver, ele);
		waiting.waitClick(driver, ele);
		actClick(driver, ele); 
	}
	
//	public List<WebElement> improwimg(WebDriver driver) {
////		String link="";
//		List<WebElement> shop = driver.findElements(link);
////		for(WebElement ele : shop) {
////			link = ele.getAttribute("href");
////		}
//		return shop;
//	}
	
//	public void impr1i1(WebDriver driver) {
////		row1img1.click();
//		actMove(driver,row1img1);
//	}
//	
//	public String impr1i1shop(WebDriver driver) {
////		row1img1shop.click();
//		return row1img1shop.getAttribute("href");
//	}
//	
//	public void impr1i2(WebDriver driver) {
////		row1img2.click();
//		actMove(driver,row1img2);
//	}
//	
//	public String impr1i2shop(WebDriver driver) {
////		row1img2shop.click();
//		return row1img2shop.getAttribute("href");
//	}
//	
//	// Most Impo Row2
//	public void impr2i1(WebDriver driver) {
//		actMove(driver, row2img1);
//	}
//	
//	public String impr2i1shop(WebDriver driver) {
//		return row2img1shop.getAttribute("href");
//	}
//	
//	public void impr2i2(WebDriver driver) {
//		actMove(driver, row2img2);
//	}
//	
//	public String impr2i2shop(WebDriver driver) {
//		return row2img2shop.getAttribute("href");
//	}
//	
//	public void impr2i3(WebDriver driver) {
//		actMove(driver, row2img3);
//	}
//	
//	public String impr2i3shop(WebDriver driver) {
//		return row2img3shop.getAttribute("href");
//	}
	
	//Promo Msg
	public void learnmore() {
		row3img1.click();
	}
	
	//Ordinary Products
	public void ordc1() {
		ord_col1.click();
	}
	public void ordc2i1() {
		ord_col2img1.click();
	}
	public void ordc2i2() {
		ord_col2img2.click();
	}
	public void ordc2i3() {
		ord_col2img3.click();
	}
	
	//Milestone Products
	public void mileimg1(WebDriver driver) {
//		milestoneimg1.click();
//		actMove(driver, mileimg1);
		actClick(driver, milestoneimg1);
	}
	public void mileimg2(WebDriver driver) {
//		milestoneimg2.click();
//		actMove(driver, mileimg2);
		actClick(driver, milestoneimg2);
	}
	public void mileimg3(WebDriver driver) {
//		milestoneimg3.click();
//		actMove(driver, mileimg3);
		actClick(driver, milestoneimg3);
	}
//	public void matlink(WebDriver driver, WebElement element) {
//		actClick(driver, element);
//	}
	public void arrow(WebDriver driver,WebElement ele) {
		actClick(driver, ele);
	}
	public void matercheck(WebDriver driver,WebElement ele) {
		String val = ele.getAttribute("aria-hidden");
		if(val == "false") {
			waiting.waitClick(driver, ele);
			actClick(driver,ele);
		}else {
			arrow(driver,ele);
			actClick(driver, ele);
		}
	}
	
	public void subcheckimg(WebDriver driver) {
		actMove(driver, subimg);
	}
	
	public void mailid(String mail) {
		submail.sendKeys(mail);
	}
	
	public void subSubmit(WebDriver driver) {
		actClick(driver, subsubmit);
	}
	public void succMsg(WebDriver driver) {
		waiting.waitVisi(driver, successmsg);
		System.out.println(successmsg);
	}
	public String emptySub() {
		return emptycheck.getText();
	}
}

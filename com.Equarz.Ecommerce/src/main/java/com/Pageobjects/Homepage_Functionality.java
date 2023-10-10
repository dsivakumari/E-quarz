package com.Pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Utils;
import com.base.Testbase;

public class Homepage_Functionality  extends Testbase{
	Utils ut=new Utils();
	
	@FindBy(xpath="//a[@href='http://e-quarz.com/products?data_from=featured&page=1']")
	WebElement featuredProducts;
	@FindBy(xpath="//a[@href='http://e-quarz.com/products?data_from=latest&page=1']")
	WebElement latestProducts;
	@FindBy(xpath="//a[@href='http://e-quarz.com/products?data_from=best-selling&page=1']")
	WebElement BestSellingProducts;
	@FindBy(xpath="//a[@href='http://e-quarz.com/products?data_from=top-rated&page=1']")
	WebElement TopRatedProducts;
	@FindBy(xpath="//a[text()='Profile Info']")
	WebElement profileInfo;
	@FindBy(xpath="//a[text()='Wish List']")
	WebElement wishlist;
	@FindBy(xpath="//a[text()='Track Order']")
	WebElement Trackorder;
	@FindBy(xpath="//a[text()='Refund policy']")
	WebElement Refundpolicy;
	@FindBy(xpath="//a[text()='Return policy']")
	WebElement Returnpolicy;
	@FindBy(xpath="//a[text()='Cancellation policy']")
	WebElement Cancellationpolicy;
     
	@FindBy(xpath="//i[@class='fa fa-envelope m-2']")
	WebElement email;
	@FindBy(xpath="//i[@class='fa fa-user-o m-2']")
	WebElement supportTicker;
	@FindBy(xpath="//a[@class='social-btn text-white sb-light sb-twitter mr-2 mb-2']")
	WebElement Twitter;
	@FindBy(xpath="//a[@class='social-btn text-white sb-light sb-linkedin mr-2 mb-2']")
	WebElement linkedin;
	@FindBy(xpath="//a[@class='social-btn text-white sb-light sb-google-plus mr-2 mb-2']")
	WebElement google;
	@FindBy(xpath="//a[@class='social-btn text-white sb-light sb-pinterest mr-2 mb-2']")
	WebElement pinterest;
	@FindBy(xpath="//a[@class='social-btn text-white sb-light sb-instagram mr-2 mb-2']")
	WebElement Instagram;
	@FindBy(xpath="//a[@class='social-btn text-white sb-light sb-facebook mr-2 mb-2']")
	WebElement facebook;
	@FindBy(xpath="//a[@href='http://e-quarz.com/terms']")
	WebElement Terms;
	@FindBy(xpath="//a[@href='http://e-quarz.com/privacy-policy']")
	WebElement privacypolicy;
	@FindBy(xpath = " //a[@class='navbar-brand d-none d-sm-block mr-3 flex-shrink-0 __min-w-7rem']")
	WebElement logo;
	
public Homepage_Functionality (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
 //public  void Homelinks() {
	 
	// Actions act =new Actions(driver);
		//act.moveToElement(featuredProducts).build().perform();
 //}
 //public void logoclick()
	//{
		//logo.click();
	//}
		
	// featuredProducts.click();
	 public void featuredProducts1() {
		 featuredProducts.click();
		 String str=driver.getCurrentUrl();
			assertEquals(str, "http://e-quarz.com/products?data_from=featured&page=1");	 

	 }
	 
	 	 
	// latestProducts.click();
	 public void latestProducts1() {
		 latestProducts.click();
		 String str=driver.getCurrentUrl();
		 assertEquals(str, "http://e-quarz.com/products?data_from=latest&page=1");
	 }
	// BestSellingProducts.click();
	 public void BestSellingProducts1() {
		 BestSellingProducts.click();
		 String str=driver.getCurrentUrl();
		 assertEquals(str, "http://e-quarz.com/products?data_from=best-selling&page=1");
		 
	 }
	 //TopRatedProducts.click();
	 public void TopRatedProducts1() {
		 TopRatedProducts.click();
		 String str=driver.getCurrentUrl();
		 assertEquals(str, "http://e-quarz.com/products?data_from=top-rated&page=1");
		 
	 }
	 //profileInfo.click();
	 public void profileInfo1() {
		 profileInfo.click();
		 String str=driver.getCurrentUrl();
		 assertEquals(str, "http://e-quarz.com/user-account");
	 }
	 //Trackorder.click();
	 public void Trackorder1() {
		 Trackorder.click();
		 String str=driver.getCurrentUrl();
		 assertEquals(str, "http://e-quarz.com/track-order");
	 }
	 
	// Refundpolicy.click();
	 public void Refundpolicy1() {
		 Refundpolicy.click();
		 String str=driver.getCurrentUrl();
		 assertEquals(str, "http://e-quarz.com/refund-policy");
	 }
	 //Returnpolicy.click();
	 public void Returnpolicy1() {
		 Returnpolicy.click();
		 String str=driver.getCurrentUrl();
		 assertEquals(str, "http://e-quarz.com/return-policy");
	 }
	 
	 //Cancellationpolicy.click();
	 public void Cancellationpolicy1() {
		 Cancellationpolicy.click();
		 String str=driver.getCurrentUrl();
		 assertEquals(str, "http://e-quarz.com/cancellation-policy");
	 }
	 
	
	 
	// supportTicker.click();
	 public void supportTicker1() {
		 supportTicker.click();
		 String str=driver.getCurrentUrl();
		 assertEquals(str, "http://e-quarz.com/account-tickets");
	 }
	// Twitter.click();
	 public void Twitter1() throws Throwable {
		 window1 = driver.getWindowHandle();
			Twitter.click();
			ut.Windowhandless(window1);
			Thread.sleep(2000);
			 String str = driver.getCurrentUrl();
			driver.switchTo().window(window1);
			//assertEquals(str, "https://twitter.com/i/flow/login?redirect_after_login=%2F%3Flang%3Den-in");
		 //Twitter.click();
		// String str1=driver.getCurrentUrl();
		 assertEquals(str, "https://twitter.com/i/flow/login?redirect_after_login=%2F%3Flang%3Den-in");
	 }
	// linkedin.click();
	 public void linkedin1() throws Throwable {
		 window1 = driver.getWindowHandle();
		 linkedin.click();
			ut.Windowhandless(window1);
			Thread.sleep(2000);
			 String str = driver.getCurrentUrl();
				driver.switchTo().window(window1);
				 //assertEquals(str, "https://in.linkedin.com/");
		// linkedin.click();
		 //String str1=driver.getCurrentUrl();
		 assertEquals(str, "https://in.linkedin.com/");
	 }
	 
	// google.click();
	 public void google1() throws Throwable {
		 window1 = driver.getWindowHandle();
		 google.click();
			ut.Windowhandless(window1);
			Thread.sleep(2000);
			 String str = driver.getCurrentUrl();
				driver.switchTo().window(window1);
				// assertEquals(str, "https://www.marolix.com/");
		// google.click();
		 //String str1=driver.getCurrentUrl();
		 assertEquals(str, "https://www.marolix.com/");
	 }
	 
	// pinterest.click();
	 public void pinterest1() throws Throwable {
		 window1 = driver.getWindowHandle();
		 pinterest.click();
			ut.Windowhandless(window1);
			Thread.sleep(2000);
			 String str = driver.getCurrentUrl();
				driver.switchTo().window(window1);
				// assertEquals(str, "https://www.pinterest.com/pinterest/");
		// pinterest.click();
		 //String str1=driver.getCurrentUrl();
		 assertEquals(str, "https://www.pinterest.com/pinterest/");
	 }
	 //Instagram.click();
	 public void Instagram1() throws Throwable {
		 window1 = driver.getWindowHandle();
		 Instagram.click();
			ut.Windowhandless(window1);
			Thread.sleep(2000);
			 String str = driver.getCurrentUrl();
				driver.switchTo().window(window1);
				 //assertEquals(str, "https://www.instagram.com/?hl=en");
		// Instagram.click();
		 //String str1=driver.getCurrentUrl();
		 assertEquals(str, "https://www.instagram.com/?hl=en");
	 }
	// facebook.click();
	 public void facebook1() throws Throwable {
		 window1 = driver.getWindowHandle();
		 facebook.click();
			ut.Windowhandless(window1);
			Thread.sleep(2000);
			 String str = driver.getCurrentUrl();
				driver.switchTo().window(window1);
				// assertEquals(str, "https://www.facebook.com/");
		// facebook.click();
		 //String str1=driver.getCurrentUrl();
		 assertEquals(str, "https://www.facebook.com/");
	 }
	 
	// Terms.click();
	 public void Terms1() {
		 Terms.click();
		 String str=driver.getCurrentUrl();
		 assertEquals(str, "http://e-quarz.com/terms");
	 }
	// privacypolicy.click();
	 public void privacypolicy1() {
		 privacypolicy.click();
		 String str=driver.getCurrentUrl();
		 assertEquals(str, "http://e-quarz.com/privacy-policy");
	 }
	 
	 public void logoclick()
		{
			logo.click();
		}

 
	
	
	
	
 }
	
	
	
	
	



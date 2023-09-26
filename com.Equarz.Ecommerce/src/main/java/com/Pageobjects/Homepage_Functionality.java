package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Homepage_Functionality  extends Testbase{
	
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
	
public Homepage_Functionality (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
 public  void Homelinks() {
	 
	 Actions act =new Actions(driver);
		act.moveToElement(featuredProducts).build().perform();
		
	 featuredProducts.click();
	 latestProducts.click();
	 BestSellingProducts.click();
	 TopRatedProducts.click();
	 profileInfo.click();
	 Trackorder.click();
	 Refundpolicy.click();
	 Returnpolicy.click();
	 Cancellationpolicy.click();
	 email.click();
	 supportTicker.click();
	 Twitter.click();
	 linkedin.click();
	 google.click();
	 pinterest.click();
	 Instagram.click();
	 facebook.click();
	 Terms.click();
	 privacypolicy.click();

 
	
	
	
	
 }
	
	
	
	
	

}

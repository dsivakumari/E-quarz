package com.Pageobjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;
import com.base.Testbase1;

public class Wishlist_Functionality extends Testbase1 {
	
	
	@FindBy(xpath=" (//span[text()='Books'])[1]")
	WebElement category;
	@FindBy(xpath="(//span[text()='School text books'])[1]")                    //FROM CATEGORY
	WebElement subcat;
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/ncert-text-bookexemplar-problems-solutions-mathematics-class-10-8C8xbH']")
	WebElement book;
	@FindBy(xpath="//button[@class='btn __text-18px text-danger'] ")
	WebElement wishlist;
	@FindBy (xpath="//i[@class='czi-close-circle']")
	WebElement remove;
	@FindBy(xpath="//div[text()='Product has been remove from wishlist!']")
	WebElement msg;
	
	
	@FindBy(xpath="//span[@class='carousel-control-next-icon']")
	WebElement sidearrow;
	@FindBy(xpath="(//img[@class='d-block w-100 __slide-img'])[2]")
	WebElement banner;
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/selvia-women-dress-isfrnK']")
	WebElement dress;
	
	@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
	WebElement search;
	@FindBy(xpath="//button[@class='input-group-append-overlay search_button']")               //SEARCHWISLIST
	WebElement searchbtn;
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/gem-190-l-2-star-direct-cool-single-door-refrigerator-grdn-2102cmbtv-camelot-blue-2022-model-SyTbcW']")
	WebElement product;
	
	@FindBy(xpath="(//a[@href='http://e-quarz.com/product/esd-safe-pcb-magazine-rack-ByUIpG'])[1]")
	WebElement homeproduct;
	@FindBy(xpath="//a[@class='navbar-tool-icon-box bg-secondary dropdown-toggle']")
	WebElement icon;
	@FindBy(id="set-wish-list")
	List<WebElement> wishitem;
	@FindBy(xpath = "//span[@class='countWishlist']")
	WebElement wishcount;
	@FindBy(xpath = " //img[@class='d-block footer_banner_img __inline-63'] ")
	WebElement footban;
	
	@FindBy(xpath = "//a[@href='http://e-quarz.com/product/aurelia-womens-cotton-kurta-cWdeUS']")
	WebElement prdt;
	@FindBy(xpath = "//button[@class='buy_btn']")
	WebElement dealbuy;
	
	
	public Wishlist_Functionality (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void categorylist () {
		
	   Actions act =new Actions(driver);
		act.moveToElement(category).build().perform();
		
		subcat.click();
		book.click();
		wishlist.click();
		
		remove.click();
		String print=msg.getText();
		assertEquals("Product has been remove from wishlist!",print);
	}
	public void bannerlist() {
		sidearrow.click();
		banner.click();
		dress.click();
		wishlist.click();
		remove.click();	
		String print=msg.getText();
		assertEquals("Product has been remove from wishlist!",print);		
		

	}
	public void searchlist() {
		search.sendKeys("refrigerator");
		searchbtn.click();
		product.click();
		wishlist.click();
		icon.click();
		remove.click();
		String print=msg.getText();
		assertEquals("Product has been remove from wishlist!",print);				
		
		
		for(WebElement wish:wishitem)
		{
		String str=wish.getText();
		System.out.println(str);
		assertTrue(str.contains("Mouse Hp"));
		}
	
	}
	public void homelist() {
		
	  JavascriptExecutor js =(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,550)","");
  	  homeproduct.click();
  	  wishlist.click();
  	remove.click();	
	String print=msg.getText();
	assertEquals("Product has been remove from wishlist!",print);				
	
	}
	public void footerbannerlist() {
	  	footban.click();
	  	prdt.click();
	  	  wishlist.click();
		}
		public void dealoflist() throws Throwable  {
			Thread.sleep(2000);
			dealbuy.click();
		  	  wishlist.click();
		  	remove.click();					
			String print=msg.getText();
			assertEquals("Product has been remove from wishlist!",print);	
			}
	
	
	
	
}
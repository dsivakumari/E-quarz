package com.Pageobjects;

import com.base.Testbase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Product_functionality extends Testbase {
	@FindBy(xpath="//button[@class='close __close']")
	WebElement popclose;
//@FindBy(xpath="//a[@href='http://e-quarz.com/product/avro-furniture-set-of-2-plastic-chairs-matt-and-gloss-pattern-plastic-chairs-for-home-living-room-bearing-capacity-up-to'][1]")
	//WebElement Product;
	
	@FindBy(xpath="//span[text()='TVs & Appliances']")
	WebElement cat;
	@FindBy(xpath="//span[text()='Microwave oven']")
	WebElement subcat;
	@FindBy(xpath="//a[text()='Premium']")
	WebElement subsub;
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/panasonic-20l-solo-microwave-oven-nn-st26jmfdg-silver-51-auto-menus-C81NSM']")
    WebElement product;
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addtocart;
	public Product_functionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public Homepage validateProduct() throws InterruptedException
	{
		popclose.click();
		//Thread.sleep(3000);
		//search.sendKeys(props.getProperty("laptops"));
		Actions ac=new Actions(driver);
		ac.moveToElement(cat).build().perform();
		Thread.sleep(3000);
		ac.moveToElement(subcat).build().perform();
		subsub.click();
		
		
		product.click();
		addtocart.click();
		
		return new Homepage();
		
	}

}
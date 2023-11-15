package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;
import com.base.Testbase1;

public class Dealsproduct_functionality  extends Testbase1{
	//@FindBy(xpath="//button[@class='close __close']")
	//WebElement popclose;
	//@FindBy(xpath="//span[text()='Flash deal']")
	//WebElement Flashdeal;
	@FindBy(xpath="//button[@class='buy_btn']")
	WebElement buynow;
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addtocart;
	public Dealsproduct_functionality (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void validateProduct() throws InterruptedException
	{
		//popclose.click();
		buynow.click();
		Thread.sleep(3000);
		addtocart.click();
		
		
	}
	

}
	



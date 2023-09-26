package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Address_Functionality  extends Testbase {
	@FindBy(id="add_new_address")
	WebElement addnewaddress;
	@FindBy(xpath="//label[text()='Permanent']")
	WebElement parmanent;
	@FindBy(id="name")
	WebElement contractpersonname;
	@FindBy(id="phone")
	WebElement  phone;
	@FindBy(id="address-city")
	WebElement city;
	@FindBy(id="zip")
	WebElement zip;
	@FindBy(xpath="//div[text()='India']")
	WebElement india;
	@FindBy(id="address")
	WebElement address;
	@FindBy(xpath="//a[text()='Close']")
	WebElement close;
	@FindBy(xpath="//button[@class='btn btn--primary']")
	WebElement update;
	
	public Address_Functionality (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		public  void Addresspage(String name,String phone,
				String city,String zip,String india,String address ) {
			
			contractpersonname.sendKeys(name);
			
			
			
			
			
			
		
		
			
		
			
			

			
			
			
			
			
		      
			
			
			
			
			
			
			
			
		
		}
			
		
	
	
	
	
	
	
	
	

}

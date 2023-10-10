package com.Pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Utils;
import com.base.Testbase;

public class Address_Functionality  extends Testbase {
	@FindBy(xpath="//img[@src='http://e-quarz.com/public/assets/front-end/img/image-place-holder.png']")
	WebElement profile;
	//Utils ul;
    @FindBy(xpath="//a[normalize-space()='My profile']")
	WebElement myprofile;
    Utils ul;
	@FindBy(xpath="//a[normalize-space()='Address']")
	WebElement address;
	@FindBy(id="add_new_address")
	WebElement addnewaddress;
	@FindBy(xpath="//label[text()='Permanent']")
	WebElement parmanent;
	@FindBy(id="person_name")
	WebElement contractpersonname;
	@FindBy(id="own_phone")
	WebElement  phone;
	@FindBy(id="address-city")
	WebElement city;
	@FindBy(id="zip_code")
	WebElement zip;
	@FindBy(xpath="//input[@role='textbox']")
	WebElement searchbar;
	@FindBy(xpath="//div[text()='India']")
	WebElement india;
	@FindBy(xpath="//div[@class='filter-option-inner-inner']")
	WebElement country;
	@FindBy(xpath="//textarea[@class='form-control']")
	WebElement address1;
	@FindBy(xpath="//button[@class='btn btn-secondary']")
	WebElement close;
	@FindBy(xpath=" //button[text()='Add Informations  ']")
	WebElement AddInformation;
    @FindBy(xpath="//section[6]//div[1]//div[1]//div[3]//a[1]//i[1]")
	WebElement edit;
	
	public Address_Functionality (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		public  void Addresspage(String name,String phone1,String city1,String zip1,String address1 ) 
		{
			 Actions act =new Actions(driver);
				act.moveToElement(address).build().perform();
				profile.click();
				//ul=new Utils();
				//Utils.dropdown(profile, "2");
				myprofile.click();
				ul=new Utils();
				Utils.dropdown(profile, "2");
				
				address.click();
				addnewaddress.click();
				parmanent.click();
			contractpersonname.sendKeys(name);	
			phone.sendKeys(phone1);
			city.sendKeys(city1);
			zip.sendKeys(zip1);
			
	}
		public void dropdownsearch1()
		{
			searchbar.sendKeys(props.getProperty("country"));
			searchbar.sendKeys(Keys.ENTER);
			india.sendKeys(india1);
			country.sendKeys(country1);
			address1.sendKeys(address2);
			close.click();
			AddInformation.click();
			edit.click();
			
			
			
				
			}
		
		
		
			
			
			
		
			
			
		
			
			
			
			
			
			
			
			
		
		
			
		
			
			

			
			
			
			
			
		      
			
			
			
			
			
			
			
			
		
		
		
			
		}
			
		
	
	
	
	
	
	
	
	



package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Utils;
import com.base.Testbase;

public class ProfileInfo_Functionality extends Testbase {
	@FindBy(xpath="//img[@src='http://e-quarz.com/public/assets/front-end/img/image-place-holder.png']")
	WebElement profile;
	@FindBy(xpath="//a[normalize-space()='My profile']")
	WebElement myprofile;
    //Utils ul;
    @FindBy(xpath="//input[@id='f_name']")
    WebElement firstname;
    @FindBy(xpath="//input[@id='l_name']")
    WebElement lastname;
    @FindBy(xpath="//input[@id='account-email']")
    WebElement emailid;
    @FindBy(xpath="//input[@id='phone']")
    WebElement phonenumber;
    @FindBy(xpath="//input[@id='password']")
    WebElement newpassword;
    @FindBy(xpath="//input[@id='confirm_password']")
    WebElement confirmpassword;
    @FindBy(xpath="//button[@class='btn btn--primary']")
    WebElement update;
    @FindBy (xpath="//a[@class='btn btn-danger']")
    WebElement delect;
    
    
    public ProfileInfo_Functionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    public void VerifyProfile( String first, String last , String email , String phone , String password , String confimpass ) {
    
    	 Actions act =new Actions(driver);
			act.moveToElement(profile).build().perform();
    	
    	firstname.sendKeys(first);
    	lastname.sendKeys(last);
    	emailid.sendKeys(email);
    	phonenumber.sendKeys(phone);
    	newpassword.sendKeys(password);
    	confirmpassword.sendKeys(confimpass);
    	update.click();
    	
    	
    	
    	
    	
    }

}

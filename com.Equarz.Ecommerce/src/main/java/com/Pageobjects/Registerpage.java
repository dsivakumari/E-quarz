package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;
//import com.hospiol.pageobjects.Homepage;

public abstract class Registerpage extends Testbase {
	
	@FindBy(xpath="//input[@name='f_name']")
	WebElement fastname;
		
	@FindBy(xpath="//input[@name='l_name']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement phone;
	
	@FindBy(id="si-password")
	WebElement pass;
	
	@FindBy(xpath="//input[@name='con_password']")
	WebElement con_password;
	
	@FindBy (xpath="//input[@placeholder='Enter captcha value']")
	WebElement captcha;
	
	@FindBy (id="id=inputCheckd")
	WebElement checkbox;
	
	@FindBy (id="sign-up")
	WebElement signup;
	
	
	public void Registerpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void verifyRegistartion(String first,String last,String email,String phonenumber,String password,String conpassword, String captcha ) {
		
		fastname.sendKeys(first);
		lastname.sendKeys(last);
		emailid.sendKeys(email);
		phone.sendKeys(phonenumber);
		pass.sendKeys(password);
		con_password.sendKeys(conpassword);
		checkbox.click();
		signup.click();
		
	
		
	
		
		
		
		
		
		
	
		
		
		
		
		
		
	}
	
	

}

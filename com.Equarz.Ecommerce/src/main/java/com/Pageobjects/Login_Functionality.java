package com.Pageobjects;

import javax.swing.JOptionPane;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;


public class Login_Functionality extends Testbase {
	
	@FindBy(id="si-email")
	WebElement User;
	
	@FindBy(id="si-password")
	WebElement pass;
	
	
	
	
	//String str=JOptionPane.showInputDialog("enter captcha");
		//@FindBy(xpath="//input[@placeholder='Enter captcha value']")
	//WebElement captch;
	
	
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement signnbtn;
	
	public Login_Functionality (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public Homepage validateLogin(String user1,String password1) throws Throwable {
			
		//User.sendKeys(props.getProperty("username"));
		//pass.sendKeys(props.getProperty("password"));
		
		
		
		User.sendKeys(user1);
		pass.sendKeys(password1);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)" );
			
		
		Thread.sleep(15000);
					
		//captch.sendKeys(str);
		
		signnbtn.click();
		return new Homepage();
		
		
		
	}
	
	

	

	
}

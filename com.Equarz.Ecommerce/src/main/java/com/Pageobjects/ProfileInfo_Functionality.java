package com.Pageobjects;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Utils;
import com.base.Testbase;

public class ProfileInfo_Functionality extends Testbase {
	//Utils ut=new Utils();
	 Actions act =new Actions(driver);
	@FindBy(xpath="//small[text()='Hello, Siva']")
	WebElement profile;
	@FindBy(xpath="//a[normalize-space()='My profile']")
	WebElement myprofile;
	@FindBy(xpath="//label[@class='spandHeadO m-0']")
	WebElement upload;
    @FindBy(xpath="//input[@id='f_name']")
    WebElement firstname;
    @FindBy(xpath="//input[@id='l_name']")
    WebElement lastname;
    //@FindBy(xpath="//input[@id='account-email']")
    //WebElement emailid;
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
     
    public void VerifyProfile( String first, String last , String email , String phone , String password , String confimpass ) throws AWTException {
    
    	// Actions act =new Actions(driver);
			act.moveToElement(profile).build().perform();
			myprofile.click();	
			upload.click();
			Robot rb=new Robot();
			rb.delay(3000);
			StringSelection upload=new StringSelection("C:\\Users\\Dell\\Desktop\\download");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(upload, null);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);

    	
    	firstname.sendKeys(first);
    	lastname.sendKeys(last);
    	//emailid.sendKeys(email);
    	phonenumber.sendKeys(phone);
    	newpassword.sendKeys(password);
    	confirmpassword.sendKeys(confimpass);
    	update.click();
    	
    	
    	
    	
    	
    	
    }

}

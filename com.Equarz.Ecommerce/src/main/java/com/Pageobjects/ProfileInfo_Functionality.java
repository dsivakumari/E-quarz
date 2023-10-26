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
	WebElement dashboard;
	@FindBy(xpath="//a[text()=' My profile']")
	WebElement profile;
	@FindBy(xpath="//label[@class='spandHeadO m-0']")
	WebElement upload;
	@FindBy(xpath="//input[@id='f_name']")
	WebElement fname;
	@FindBy(xpath="//input[@id='l_name']")
	WebElement lname;
	@FindBy(xpath="//input[@id='phone']")
	WebElement phone;
	@FindBy(xpath="//input[@id='password']")
	WebElement pass;
	@FindBy(xpath="//input[@id='confirm_password']")
	WebElement cpass; 
	@FindBy(xpath="//button[text()='Update   ']")
	WebElement update;
	@FindBy(xpath="//div[text()='Updated successfully']")
	WebElement successful;
	public ProfileInfo_Functionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	public void editprofie() throws InterruptedException, AWTException 
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(dashboard).build().perform();
		profile.click();
		upload.click();
		Robot rb=new Robot();
		rb.delay(3000);
		StringSelection ss=new StringSelection("\"C:\\Users\\Dell\\Desktop\\logo.jpeg\"");


		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		fname.clear();
		fname.sendKeys("siva");
		lname.clear();
		lname.sendKeys("kumari");
		phone.sendKeys("3");
		pass.clear();
		pass.sendKeys("dsivakumari2022@gmail.com");
		cpass.clear();
		cpass.sendKeys("dsivakumari2022@gmail.com");
		update.click();
		String print=successful.getText();
		System.out.println(print);
		assertEquals("Updated successfully",print);
		

	}
}

	

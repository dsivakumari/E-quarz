package com.Equarz.Testcases;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import com.Pageobjects.Wishlist_Functionality;
import com.base.Testbase;

public class wishlisttest  extends Testbase{
	Wishlist_Functionality wf;
	WebDriver driver;
	
	public wishlisttest()
	{
	super()	;
	
	}
	@BeforeMethod
	public void initialize()
	{
		Setup();
		wf=new Wishlist_Functionality (driver);
	
	}
	@Test
	public void wishlist() throws Throwable  

	{
		wf.validateProduct();
		String url=driver.getCurrentUrl();

		
	}
	@AfterMethod
	public void wishlist1() 
	{
		driver.close();
		
	}
	
	

}

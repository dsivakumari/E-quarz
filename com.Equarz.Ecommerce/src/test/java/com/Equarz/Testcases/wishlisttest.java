package com.Equarz.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Wishlist_Functionality;
import com.base.Testbase;

public class wishlisttest extends Testbase {
	
	Wishlist_Functionality wf;
	Login_Functionality lg;
	
	public wishlisttest() {
		super();
	}
	
	@BeforeMethod
	public void initialize() throws Throwable {
		
		Setup();
		lg= new Login_Functionality(driver);
		//lg.validateLogin();
		//lg.validateLogin(props.getProperty("username"),props.getProperty("password"));
		 wf = new Wishlist_Functionality(driver);
	}


	@Test
	public void categorywishlist() 
	{
		wf.categorylist();
	}
	@Test
	public void bannerwishlist() 
	{
		wf.bannerlist();
	}
	@Test
	public void searchwishlist() 
	{
		wf.searchlist();
	}
	@Test
	public void homewishlist()
	{
		wf.homelist();
	}
	public void footerbannerlist()
	{
		wf.footerbannerlist();
	}
	public void dealoflist() throws Throwable
	{
		wf.dealoflist();
	}
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}
}
	
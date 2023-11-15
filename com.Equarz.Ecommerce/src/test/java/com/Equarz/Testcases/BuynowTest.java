package com.Equarz.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Buynow_Functionality;
import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Wishlist_Functionality;
import com.base.Testbase;
import com.base.Testbase1;

public class BuynowTest extends Testbase1 {
	Buynow_Functionality bf;
	Login_Functionality lg;


	public BuynowTest()
	{
		super();
	}
	@BeforeMethod
	public void initialize() throws InterruptedException
	{

		Setup();
		lg=new Login_Functionality(driver);
		lg.validateLogin();
		bf=new Buynow_Functionality (driver);		

	}
	@Test()
	public void addbuy () throws InterruptedException 
	{
		bf.addbuy();

	}
	@Test()
	public void buy () throws InterruptedException 
	{
		bf.buynow();

	}



	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}

}
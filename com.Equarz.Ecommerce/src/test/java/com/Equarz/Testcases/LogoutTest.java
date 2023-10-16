package com.Equarz.Testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Logout_functionality;
import com.base.Testbase;

public class LogoutTest extends Testbase{
	Logout_functionality lf;
	Login_Functionality lg;


	public LogoutTest ()
	{
		super();
	}

	@BeforeMethod
	public void initialize() 
	{

		Setup();
		lg=new Login_Functionality(driver);
		lg.validateLogin();
		lf=new Logout_functionality(driver);		

	}
	@Test()
	public void logout() throws InterruptedException, AWTException
	{
		lf.logout();

	}
	@Test()
	public void refresh() throws InterruptedException, AWTException
	{
		lf.refresh();

	}
	@Test()
	public void back() throws InterruptedException, AWTException
	{
		lf.back();

	}




}

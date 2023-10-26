package com.Equarz.Testcases;



import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Pageobjects.Homepage_Functionality;
import com.Pageobjects.Login_Functionality;
import com.Pageobjects.ProfileInfo_Functionality;
import com.Utils.Utils;
import com.base.Testbase;

public class ProfileInfoTest extends Testbase {
	ProfileInfo_Functionality ef;
	Login_Functionality lg;
	
	
	public ProfileInfoTest ()
	{
		super();
	}
	@BeforeClass
	public void login()
	{
		Setup();
		lg=new Login_Functionality(driver);
		lg.validateLogin();
		
	}
	@BeforeMethod
	public void initialize() 
	{
		
//		Setup();
//		lg=new Login_Functionality(driver);
//		lg.validateLogin();
		ef=new ProfileInfo_Functionality (driver);		
				
	}
	@Test()
	public void search() throws InterruptedException, AWTException
	{
		ef.editprofie();
		
	}

}

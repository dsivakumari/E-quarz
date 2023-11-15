package com.Equarz.Testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Utils.Utils;
import com.base.Testbase;
import com.base.Testbase1;

public class LoginTest extends Testbase1 {


	Login_Functionality lg;
	
	public LoginTest() {
		super();
		
	}
	@BeforeMethod
	
	public void initialize() {
		Setup();
		lg=new Login_Functionality(driver);
	}
	//@Test(dataProvider = "setdata",dataProviderClass = Utils.class)
	@Test
	public void verifylog() throws Throwable {
		lg.validateLogin();
		//lg.validateLogin(Username, password);
		//String url=driver.getCurrentUrl();
		//Assert.assertEquals("http://e-quarz.com/", url);
		
	}

	//@Test
	//public void verifyurl() throws Throwable {
		//lg.validateLogin();
		//String url=driver.getCurrentUrl();
		//Assert.assertEquals("http://e-quarz.com/", url);
		
	//}
	@AfterMethod
	public void teardown() {
	driver.close();
	}
	

}

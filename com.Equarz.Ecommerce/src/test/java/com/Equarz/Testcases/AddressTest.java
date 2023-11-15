package com.Equarz.Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Pageobjects.Address_Functionality;
import com.Pageobjects.Login_Functionality;
import com.Utils.Utils;
import com.base.Testbase;
import com.base.Testbase1;

public class AddressTest extends Testbase1 {
	int testid;
	Address_Functionality af;
	Login_Functionality lg;
	private final String sheetname="addressdata";
	
	
	public AddressTest()
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
	@DataProvider
	public String[][] addressData() throws Throwable
	{
		return Utils.readata(sheetname);
	}
	
	@BeforeMethod
	public void initialize() 
	{
		
//		Setup();
//		lg=new Login_Functionality(driver);
//		lg.validateLogin();
		af=new Address_Functionality (driver);		
				
	}
	@Test(priority=1,dataProvider = "addressData",dataProviderClass =AddressTest.class )
	public void addaddress(String name,String phone,String city,String zipcode) throws InterruptedException 
	{
		testid=1;
		af.addaddress(name,phone,city,zipcode);
		
	}
	@Test(priority=2)
	public void editaddress()
	{
		af.editaddress();
	}
	@Test(priority=3)
	public void deleteaddress() throws Throwable
	{
		af.deleteaddress();
	}
	

}
package com.Equarz.Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Address_Functionality;
import com.Pageobjects.Login_Functionality;
import com.base.Testbase;

public class AddressTest extends Testbase {
	Address_Functionality af;
	Login_Functionality lg;
	
	public AddressTest() {
		super();
		
	}
	@BeforeMethod
	public void initialize() {
    Setup();
    af=new Address_Functionality (driver);
    lg=new Login_Functionality(driver);
    lg.validateLogin();
	}
	@Test
	public void Addresspage1(String name,String phone1,String city1,String zip1,String address1 ) {
		af.Addresspage(name, phone1, city1, zip1, address1);
		
	}
	@Test
	public void dropdown() {
		af.dropdownsearch1();
	}
	

}

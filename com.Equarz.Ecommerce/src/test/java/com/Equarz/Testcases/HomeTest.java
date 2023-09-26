package com.Equarz.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Homepage_Functionality;
import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Search_Functionality;
import com.base.Testbase;

public class HomeTest extends Testbase {
	Homepage_Functionality hf;
	
	public HomeTest() {
		super();
		
	}
@BeforeMethod
	
	public void initialize() {
		Setup();
	
		hf=new Homepage_Functionality (driver);
				
			}
@Test
public void  Homelinks() {
	hf.Homelinks();
	
 
	
	}


	
	
			

@AfterMethod
public void teardown()
{
	driver.close();
	
}

}

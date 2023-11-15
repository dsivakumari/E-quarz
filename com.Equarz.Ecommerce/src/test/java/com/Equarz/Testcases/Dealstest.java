package com.Equarz.Testcases;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.apache.poi.ss.formula.functions.DProduct;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Dealsproduct_functionality;
import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Product_functionality;
import com.base.Testbase;
import com.base.Testbase1;

public class Dealstest extends Testbase1{
	Dealsproduct_functionality df;
	Login_Functionality lg;
	public Dealstest()
	{
		super();
		
	}
	@BeforeMethod
	public void initialize()
	{
		Setup();
		lg=new Login_Functionality(driver);
		lg.validateLogin();
		df=new Dealsproduct_functionality (driver);
		
	}
	@Test
public void cat() throws Throwable  {
		
		df.validateProduct();
		
				
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
		
	}
	
	
	

}

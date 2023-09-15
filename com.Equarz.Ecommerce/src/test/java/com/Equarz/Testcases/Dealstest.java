package com.Equarz.Testcases;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.apache.poi.ss.formula.functions.DProduct;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Dealsproduct_functionality;
import com.Pageobjects.Product_functionality;
import com.base.Testbase;

public class Dealstest extends Testbase{
	Dealsproduct_functionality df;
	public Dealstest()
	{
		super();
		
	}
	@BeforeMethod
	public void initialize()
	{
		Setup();
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

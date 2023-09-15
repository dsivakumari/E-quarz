package com.Equarz.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Search_Functionality;
import com.base.Testbase;

public class SearchTest extends Testbase{

	Search_Functionality product;

	public SearchTest() {
		super();
		
	}
	@BeforeMethod
	
	public void initialize() {
		Setup();
				product=new Search_Functionality(driver);
			}
	@Test
	public void cat() throws Exception {
		
		product.Search_product();
				
	}
	@AfterMethod
	public void shutdown() 
	{
		driver.close();
	}
	

}

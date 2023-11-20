package com.Equarz.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.AdminScenarioBuyProduct;
import com.Pageobjects.Login_Functionality;
import com.aventstack.extentreports.model.Report;
import com.base.Testbase;

public class AdminScenarioTest extends Testbase {
	
	int testid;
	Login_Functionality lg;

	Report extentreports;
	AdminScenarioBuyProduct Admin;
	public AdminScenarioTest() {
		super();
		
	}
	@BeforeMethod
	public void initialize() {
		Setup();
		lg=new Login_Functionality(driver);
		
		Admin = new AdminScenarioBuyProduct(driver);

	}
	@Test (testName = "test1")
	public void verifyproduct() throws Throwable {
		lg.validateLogin();
		Admin.AdminProduct();

		
	}
	
	
	

}

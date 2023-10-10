package com.Equarz.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Homepage_Functionality;
import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Search_Functionality;
import com.base.Testbase;

public class HomeTest extends Testbase {
	Homepage_Functionality hf;
	Login_Functionality lg;
     
	
	public HomeTest() {
		super();
	}
	@BeforeClass
	public void initialize() {
		Setup();
	
		hf=new Homepage_Functionality (driver);
		lg= new Login_Functionality(driver);
		lg.validateLogin();
		//lg.validateLogin(props.getProperty("username"),props.getProperty("password"));
	}
	
@BeforeMethod

public void Logo() {
	hf.logoclick();
}
	
	
@Test(priority = 1)
public void  verifyfeature() {
	hf.featuredProducts1();
	
 
	}
@Test(priority = 2)
public void verifylatest() {
	hf.latestProducts1();
	
	}
@Test(priority = 3)
public void verifyselling() {
	hf.BestSellingProducts1();
}
@Test(priority = 4)
public void toprate() {
	hf.TopRatedProducts1();
}
@Test(priority = 5)
public void Track() {
	hf.Trackorder1();
}
@Test(priority = 6)
public void Refund() {
	hf.Refundpolicy1();
}
@Test(priority = 7)
public void Return() {
	hf.Returnpolicy1();
}
@Test(priority = 8)
public void Cancellation() {
	hf.Cancellationpolicy1();
}
@Test(priority = 9)
public void supportTicker() {
	hf.supportTicker1();
}
@Test(priority = 10)
public void Tiwtter() throws Throwable {
	hf.Twitter1();
}
@Test(priority = 11)
public void linkedin() throws Throwable {
	hf.linkedin1();
}
@Test(priority = 12)
public void google() throws Throwable {
	hf.google1();
}
@Test(priority = 13)
public void pinterest() throws Throwable {
	hf.pinterest1();
}
@Test(priority = 14)
public void Instagram() throws Throwable {
	hf.Instagram1();
}
@Test(priority = 15)
public void facebook() throws Throwable {
	hf.facebook1();
	
}
@Test
public void Terms() {
	hf.Terms1();
}
@Test
public void Privacy() {
	hf.privacypolicy1();
}

			

@AfterClass
public void teardown()
{
	driver.quit();
	
}

}

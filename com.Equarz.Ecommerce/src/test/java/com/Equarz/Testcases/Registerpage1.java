package com.Equarz.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Registerpage;
import com.Utils.Utils;
import com.base.Testbase;

public class Registerpage1 extends Testbase {
	
Registerpage1 Rp;
	
	public Registerpage1 (WebDriver driver) {
		super ();
		
	}
	
	@BeforeMethod 
	public void intailazation  () {
		
		Setup();
		
		Rp = new Registerpage1(driver) ;
		 
		
		
		}
	
	
	 
	 @Test (dataProvider = "setdata",dataProviderClass = Utils.class)
	 public void verifyRegi (String first1,String last1,
				String email1,String phonenumber1,String password1,String conpassword1, String captcha1 ) {
		 
	 
	 Rp.verifyRegistartion(first1,last1,email1,phonenumber1,password1,conpassword1);
	 
	 }
		 
		 
	 
	
	

}

package com.Equarz.Testcases;



import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Pageobjects.Homepage_Functionality;
import com.Pageobjects.Login_Functionality;
import com.Pageobjects.ProfileInfo_Functionality;
import com.Utils.Utils;
import com.base.Testbase;

public class ProfileInfoTest extends Testbase {
	int testid;
	ProfileInfo_Functionality pf;
	Login_Functionality lg;
	//Utils ut;
	private final String sheetname="Profileinfo";
	
	

	 public ProfileInfoTest() {
		 super();
	 }
	 @DataProvider 
	 public String[][] profiledata() throws Throwable {//declare chesukunam
		 return Utils.readata(sheetname);
		 
	 }
	 @BeforeClass
		public void initialize() {
			Setup();
		
		pf=new ProfileInfo_Functionality (driver);
			lg= new Login_Functionality(driver);
			lg.validateLogin();
	 }
	 @Test(priority = 1,dataProvider = "profiledata",dataProviderClass = ProfileInfoTest.class )
	 public void VerifyProfile( String first, String last , String email , String phone , String password , String confimpass ) throws AWTException {
		 testid=1;
		 pf.VerifyProfile(first, last, email, phone, password, confimpass);
	 }
	 
}

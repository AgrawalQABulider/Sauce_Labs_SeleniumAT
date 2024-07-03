package com.sauce.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.qa.base.TestBase;
import com.sauce.qa.pages.InvalidLoginPage;


public class InvalidLoginTest extends TestBase{

	InvalidLoginPage InvalidloginPage;
	
	
	public InvalidLoginTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		InvalidloginPage = new InvalidLoginPage();	
	}
	
	
	
	@Test()
	public void InvalidloginTest(){
		InvalidloginPage.Invalidlogin(prop.getProperty("fakeusername"), prop.getProperty("fakepassword"));
		//InvalidloginPage.login();
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
}

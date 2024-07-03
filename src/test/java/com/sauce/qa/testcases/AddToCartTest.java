package com.sauce.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.qa.base.TestBase;
import com.sauce.qa.pages.LoginPage;

public class AddToCartTest extends TestBase{
	
LoginPage loginPage;
com.sauce.qa.pages.AddToCartPage AddToCartPage;
	
	
	public AddToCartTest(){
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp(){
		initialization();	
	}
	
	
	



	@Test
	public void AddToCartTest(){
		loginPage = new LoginPage();
		
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		AddToCartPage = new com.sauce.qa.pages.AddToCartPage();
		AddToCartPage.CartPage(prop.getProperty("Firstname"),prop.getProperty("Lastname"),prop.getProperty("postalcode"));
		
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
}




package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.sauce.qa.base.TestBase;

public class InvalidLoginPage extends TestBase {

	//Page Factory - OR:
			@FindBy(name="user-name")
			WebElement fakeusername;
			
			@FindBy(name="password")
			WebElement fakepassword;
			
			@FindBy(xpath="//input[@type='submit']")
			WebElement loginbtn;
			
			@FindBy(xpath= "//button[@class='error-button']")
			WebElement errormessage;
			
			public InvalidLoginPage(){
				PageFactory.initElements(driver, this);
				
			}
			
			
			public void Invalidlogin(String un, String pwd) {
				fakeusername.sendKeys(un);
				fakepassword.sendKeys(pwd);
				loginbtn.click();
				String bodyText= errormessage.getText();
				Assert.assertTrue(bodyText.contains("Epic sadface: Username and password do not match any user in this service"),"Not Successfully ordered!");
				
			}
	}


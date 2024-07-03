package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory - OR:
		@FindBy(name="user-name")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement loginbtn;
		
		
		public LoginPage(){
			PageFactory.initElements(driver, this);
			
		}
		
		
		public void login(String un, String pwd) {
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginbtn.click();
		}
}

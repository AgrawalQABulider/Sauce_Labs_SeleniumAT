package com.sauce.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.TestBase;
import org.testng.Assert;




public class AddToCartPage extends TestBase{
	
	//Page Factory - OR:
			@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-backpack']")
			WebElement Saucebagpack;
			
			@FindBy(xpath = "//a[@class='shopping_cart_link']")
			WebElement Cartbtn;
			
			@FindBy(xpath= "//button[@name='checkout']")
			WebElement checkoutBtn;
			
			@FindBy(xpath="//input[@name='firstName']")
			WebElement Firstname;
			
			@FindBy(xpath = "//input[@name='lastName']")
			WebElement Lastname;
			
			@FindBy(xpath= "//input[@name='postalCode']")
			WebElement postalcode;
			
			@FindBy(xpath= "//input[@name='continue']")
			WebElement continuebtn;

			@FindBy(xpath= "//button[@name='finish']")
			WebElement finishbtn;
			
			@FindBy(xpath= "//h2[@class='complete-header']")
			WebElement ordrmessage;
			
			public AddToCartPage(){
				PageFactory.initElements(driver, this);
				
			}
			
			
			public void CartPage(String frstname, String lstname, String postcode) {
				Saucebagpack.click();
				Cartbtn.click();
				checkoutBtn.click();
				Firstname.sendKeys(frstname);
				Lastname.sendKeys(lstname);
				postalcode.sendKeys(postcode);
				continuebtn.click();
				finishbtn.click();
				String bodyText= ordrmessage.getText();
				Assert.assertTrue(bodyText.contains("Thank you for your order!"),"Not Successfully ordered!");
				
				
			}
				
				
				
				
}

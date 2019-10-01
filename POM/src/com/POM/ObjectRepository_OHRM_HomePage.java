package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Object Repository is nothing but finding the property of the element and doing some operation on the webelement
public class ObjectRepository_OHRM_HomePage {
	

	@FindBy(id="txtUsername")
	WebElement UserName;
	
	@FindBy(id ="txtPassword")
	WebElement Password;
	
	@FindBy(id="btnLogin")
	WebElement SignIn;
	
	public void login(String uName,String pword)
	{
		UserName.sendKeys(uName);
		Password.sendKeys(pword);
		SignIn.click();
	}

}

package com.hybrid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepository_OHRM {
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


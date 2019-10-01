package com.POM;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase_OHRM extends BaseTest_OHRM {
	@Test
	public void homePage() throws InterruptedException
	{
		ObjectRepository_OHRM_HomePage oroh =PageFactory.initElements(driver,ObjectRepository_OHRM_HomePage.class);
		oroh.login("Admin","admin123");
		Thread.sleep(2000);
		
	}
	

}

package com.KeywordDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTours_Login extends TestBase{

	@Test
	public void logIn() throws IOException {
		FileInputStream file= new FileInputStream("E:\\LIVE TECH\\Testing\\NewTours_Login.properties");
		Properties pr =new Properties();
		pr.load(file);
		
		
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");;
		driver.findElement(By.xpath(pr.getProperty("SignIn"))).click();
		
	}
}

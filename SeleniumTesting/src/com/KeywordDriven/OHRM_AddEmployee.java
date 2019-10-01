package com.KeywordDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.datadriven.OrangeHRMTestBase;

public class OHRM_AddEmployee extends OrangeHRMTestBase {
	
	@Test
	public void logIn() throws IOException
	{
		FileInputStream file =new FileInputStream("E:\\LIVE TECH\\SeleniumTesting\\OHRM_AddEmployee.properties");
		Properties pr =new Properties();
		pr.load(file);
		
		driver.findElement(By.id(pr.getProperty("UserName"))).sendKeys("Admin");
		driver.findElement(By.id(pr.getProperty("PassWord"))).sendKeys("admin123");
		driver.findElement(By.id(pr.getProperty("LoginButton"))).click();
		
		
		WebElement pim=driver.findElement(By.xpath(pr.getProperty("Pim")));
		Actions act=new Actions(driver);
		act.moveToElement(pim).perform();
		driver.findElement(By.id(pr.getProperty("AddEmployee"))).click();
		
		driver.findElement(By.id(pr.getProperty("FirstName"))).sendKeys("TejaSri");
		driver.findElement(By.id(pr.getProperty("MiddleName"))).sendKeys("Sri");
		driver.findElement(By.id(pr.getProperty("LastName"))).sendKeys("Ponnuru");
		
		driver.findElement(By.id(pr.getProperty("Save"))).click();
		
	}
	

}

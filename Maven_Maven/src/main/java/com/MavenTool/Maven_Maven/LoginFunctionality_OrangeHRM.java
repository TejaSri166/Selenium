package com.MavenTool.Maven_Maven;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginFunctionality_OrangeHRM {
	Logger logger =Logger.getLogger(LoginFunctionality_OrangeHRM.class);
	WebDriver driver =null;
	String url ="https://opensource-demo.orangehrmlive.com/";
	@BeforeTest
	public void setUp()
	{
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\SeleniumTesting\\DriverFiles\\chromedriver.exe");
		driver =new ChromeDriver();
		logger.info("Chrome is opened successfully");
		driver.get(url);
		logger.info("Url is opened successfully");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
		@Test
		public void login()
		
		{
			driver.findElement(By.id("txtUsername")).clear();
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			logger.info("UserName is entered successfully");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			logger.info("Password is enetered successfully");
			driver.findElement(By.id("btnLogin")).click();
			logger.info("Login button is clicked");
			String expected_result ="Welcome Admin";
			logger.info("the expected result is:"+expected_result);
			String Actual_result =driver.findElement(By.id("welcome")).getText();
			logger.info("The Actual_result is:"+Actual_result);
			if(Actual_result .equals(expected_result)) {
				logger.info("LogIn is success_Pass");
			}
			else {
				logger.info("LogIn is Failed_Fail");
			}
			
		}	
		
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
		
		
		
	
	
	}



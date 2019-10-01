package com.Maven_OHRM;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_AddEmployee {
	
	
	Logger log =Logger.getLogger(OHRM_AddEmployee.class);
	WebDriver driver=null;
	String url="https://opensource-demo.orangehrmlive.com/";
	
	@BeforeTest
	
	public void setUp() {
		
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\SeleniumTesting\\DriverFiles\\chromedriver.exe");
		driver =new ChromeDriver();
		log.info("The Browser is opened successfully");
		
		driver.get(url);
		log.info("The Url is opened successfully");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
		
	@Test
	public void addEmployee() {
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		log.info("The UserName is entered successfuly");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		log.info("Password is entered successfully");
		
		driver.findElement(By.id("btnLogin")).click();
		log.info("Login Button is clicked Successfully");
		
		
	}
	
	

}

package com.LogPrograms;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;



public class NewToursLogin {
	
	public static void main(String[] args) {
		Logger logger =Logger.getLogger(NewToursLogin.class);
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\SeleniumTesting\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		logger.info("Chrome Driver");
		driver.get("http://www.newtours.demoaut.com/");
		logger.info("url is opened");
		
		
		
	
		

	}

}

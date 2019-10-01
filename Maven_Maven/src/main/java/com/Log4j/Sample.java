package com.Log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		Logger log =Logger.getLogger("Sample.class");
		WebDriver driver =null;
		String url ="https://opensource-demo.orangehrmlive.com/";
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\SeleniumTesting\\DriverFiles\\chromedriver.exe");
		driver =new ChromeDriver();
		log.info("Chrome is opened successfully");
		driver.get(url);
		log.info("Url is opened successfully");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		

	}

}

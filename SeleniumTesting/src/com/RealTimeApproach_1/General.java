package com.RealTimeApproach_1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class General extends Global
{
	public void setup() {
		driver =new FirefoxDriver();
		driver.get(url);
		//log.info("successfully navigate to url page");
		
	}

	
	

}

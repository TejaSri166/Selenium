package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Monster_DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String url="https://my.monsterindia.com/sponsered-popup.html";                                                                               
		driver.get(url);
		
		

	}

}

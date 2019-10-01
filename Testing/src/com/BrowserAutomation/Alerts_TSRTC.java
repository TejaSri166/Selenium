package com.BrowserAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_TSRTC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		//CheckAvaliability
		driver.findElement(By.id("searchBtn")).click();
		Alert al=driver.switchTo().alert();
		String alert_Message=al.getText();
		System.out.println("The alert message is:"+alert_Message);
		Thread.sleep(8000);
		al.accept();
		
		
		
	}

}

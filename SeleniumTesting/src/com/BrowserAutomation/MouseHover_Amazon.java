package com.BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Amazon {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	//hover on hello signin your orders
	WebElement yourWishTo=driver.findElement(By.xpath("//*[@id=\'nav-link-yourAccount\']"));
	Actions act=new Actions(driver);
	act.moveToElement(yourWishTo).perform();
	Thread.sleep(2000);
	//Inspect the properties of yourwishto 
	driver.findElement(By.xpath("//*[@id=\"nav-flyout-yourAccount\"]/div[3]/a[3]/span")).click();
	
	driver.quit();
	
	
	

	}

}

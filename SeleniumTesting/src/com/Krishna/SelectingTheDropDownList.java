package com.Krishna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectingTheDropDownList {
	@Test
	public void dropdown() {
		//WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement month=driver.findElement(By.xpath("//*[@id='month']"));
		
		
		Select selection =new Select(month);
		selection.selectByVisibleText("Jun");
		
		
	
		
		
		
	}

}

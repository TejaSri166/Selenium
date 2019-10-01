package testNG_Programs;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Annotations2_BeforeTestAndAfterTest{
	
	
	WebDriver driver =null;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
	@Test
	//Property of UserName
	public void loginfunctionlity() {
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	
	//Property of Password
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	//Property of Login
	driver.findElement(By.id("btnLogin")).click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}

package dataDrivenApproach;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OrangeHRMTestBase {
	WebDriver driver =null;
	String url="https://opensource-demo.orangehrmlive.com/";
	
	@BeforeTest 
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get(url);		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	//@AfterTest
	public void tearDown() {
		driver.quit();
		
	}
	
		
		
	}



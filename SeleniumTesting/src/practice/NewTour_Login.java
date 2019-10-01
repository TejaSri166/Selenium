package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTour_Login {
	
	

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
	
	ChromeDriver driver =new ChromeDriver();
	
	driver.navigate().to("http://www.newtours.demoaut.com/");
	//<input type="text" name="userName" size="10">
	driver.findElement(By.name("userName")).sendKeys("tutorial");
	//<input type="password" name="password" size="10">
	driver.findElement(By.name("password")).sendKeys("tutorial");
	
driver.findElement(By.name("login")).click();
	}

}

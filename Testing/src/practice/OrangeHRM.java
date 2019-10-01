package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		//Username-<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//Password-<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		//Login-<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
		
		System.out.println("Navigating to orange hrm page");
		driver.manage().window().maximize();
		
		//Properties of Admin
	WebElement userManagement= 	driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b"));
	Actions act =new Actions(driver);
	act.moveToElement(userManagement).perform();
	
	//Property of usermanagement-<a href="#" id="menu_admin_UserManagement" class="arrow">User Management</a>
	driver.findElement(By.id("menu_admin_UserManagement"));
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	System.out.println("Navigating to UserManagement page");
	
	//Property- of user<a href="/index.php/admin/viewSystemUsers" id="menu_admin_viewSystemUsers">Users</a>
	
	WebElement user=driver.findElement(By.id("menu_admin_viewSystemUsers"));
	Actions act1=new Actions(driver);
	act1.moveToElement(user).perform();
	driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
	System.out.println("Navigating to Admin Page");
	driver.quit();
	
	
	
	
	}
	
}
	
package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLoginAndLogout {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		driver.findElement(By.id("welcome")).click();
		////*[@id="welcome-menu"]/ul/li[2]/a
		driver.findElement(By.xpath("*[@id='welcome-menu']/ul/li[2]/a")).click();
		System.out.println("logout successfully");
		driver.quit();
		
		
		
		
	}

}

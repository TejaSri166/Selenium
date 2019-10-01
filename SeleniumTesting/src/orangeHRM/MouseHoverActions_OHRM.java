package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions_OHRM {

	

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");

	
	//<input name="txtUsername" id="txtUsername" type="text">
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	driver.findElement(By.id("btnLogin")).click();
	driver.manage().window().maximize();
	
	//Inspecting the properties of PIM
	WebElement configuration=driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
	Actions act =new Actions(driver);
	act.moveToElement(configuration).perform();
	
	Thread.sleep(6000);
	
	//Inspecting the properties of configuration
	WebElement CustomFields=driver.findElement(By.id( "menu_pim_Configuration"));
	
	Actions act1 =new Actions(driver);
	act1.moveToElement(CustomFields).perform();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@id=\"menu_pim_listCustomFields\"]")).click();
	driver.quit();
	
	

	}

}

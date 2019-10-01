package newTours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions_Assignment {

	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	
	Actions act=new Actions(driver);
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys(Keys.TAB).perform();
	
	//<a href="mercuryunderconst.php?osCsid=76d0a11c6c5e73afa0a51787811571b9">Vacations</a>
	
	driver.findElement(By.linkText("Vacations")).click();
	System.out.println("Navigating toparticular page");
	
	
	//Inspecting the properties of back to home
	//<img src="/images/forms/home.gif" width="118" height="23" border="0">
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
	Thread.sleep(5000);
	System.out.println("Navigating to home page");
	
	
	
	

	}

}

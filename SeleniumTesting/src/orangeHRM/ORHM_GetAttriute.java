package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORHM_GetAttriute {

	public static void main(String[] args) {
		WebDriver driver=null;

		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		driver= new ChromeDriver();
		String url="https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
	 WebElement Admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
	 String ExpectedUrl_AdminElement=Admin.getAttribute("ADMIN");
	 System.out.println("The ExpectedUrl is:"+ExpectedUrl_AdminElement);
	 Admin.click();
	 String Actual_UrlAdminElement=driver.getCurrentUrl();
	 System.out.println("The actualUrl is:"+Actual_UrlAdminElement);
	 if(Actual_UrlAdminElement.equals( ExpectedUrl_AdminElement)) {
		 System.out.println("Pass");
	 }
	 else {
		 System.out.println("Fail");
	 }
		
		
driver.quit();
	}

}

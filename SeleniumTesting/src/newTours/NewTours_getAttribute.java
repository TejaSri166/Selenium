package newTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_getAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		WebElement support=driver.findElement(By.linkText("SUPPORT"));
		String expectedUrl_supportElement=support.getAttribute("href");
		System.out.println("The expected Urlis:"+expectedUrl_supportElement);
		support.click();
		
		String actualUrl_supportElement=driver.getCurrentUrl();
		System.out.println("The actual Url is:"+actualUrl_supportElement);
		if(actualUrl_supportElement.equals (expectedUrl_supportElement)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		driver.quit();

	}
}

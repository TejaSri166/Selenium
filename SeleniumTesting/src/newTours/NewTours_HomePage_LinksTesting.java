package newTours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_LinksTesting {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver",".//DriverFiles//geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.newtours.demoaut.com/");
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	int linksCount=links.size();
	System.out.println("the total no of links present in the NewTour application is:"+linksCount);
	
	for(int j=0;j<linksCount;j++) {
		String linksName=links.get(j).getText();
		System.out.println("the name of the link is:"+linksName);
		
		links.get(j).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		links=driver.findElements(By.tagName("a"));
		
		
		driver.quit();
		
		
	}
	}

}

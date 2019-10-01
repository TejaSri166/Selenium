package newTours;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Countries {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com/index.php");
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	WebElement country=	driver.findElement(By.name("country"));
	List <WebElement> countryNames=country.findElements(By.tagName("option"));
	System.out.println("The number of countries present in the dropdown list are:"+countryNames.size());
	for(int i=0;i<countryNames.size();i++) {
		String countryNames_list=countryNames.get(i).getText();
		System.out.println("The country names are:"+countryNames_list);
	}
	driver.quit();
		
	
	
	
	

	}

}

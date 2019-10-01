package fACEBOOKandGMAIL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList_FaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//<div class="mtm mbs _2_68">Birthday</div>
		//String dob=driver.findElement(By.xpath("//*[@id=\"u_0_10\"]/div[1]")).getText();
		WebElement day=driver.findElement(By.id("day"));
		Select selection=new Select(day);
		selection.selectByValue("1");
		Thread.sleep(3000);
		WebElement month=driver.findElement(By.id("month"));
		Select selection1=new Select(month);
		selection1.selectByIndex(7);
		Thread.sleep(4000);
		WebElement year=driver.findElement(By.id("year"));
		Select selection3=new Select(year);
		selection3.selectByValue("2015");
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}

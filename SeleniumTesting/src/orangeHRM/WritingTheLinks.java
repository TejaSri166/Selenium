package orangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritingTheLinks {
	static int count;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
        Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
		
		List<WebElement> links1=driver.findElements(By.tagName("a"));
		int linksCount1=links1.size();
		System.out.println( "The links present in links1 is:"+linksCount1);
		List<WebElement> links2=driver.findElements(By.tagName("b"));
		int linksCount=links2.size();
		System.out.println("The links present in links2 is:"+linksCount);
		count=linksCount+linksCount1;
		System.out.println("The total no of links is:"+count);
	for(int i=0;i<linksCount;i++) {
		String linkName1=links1.get(i).getText();
		{
		/*try {	
		String linkName2=links2.get().getText();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}*/
		System.out.println("The name of the link is :"+linkName1);
		//System.out.println("The name of the link is:"+linkName2);
		}
		
	}
	}
	}


		
		
		
		
		
		
		

	



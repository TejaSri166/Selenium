import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@class='whsOnd zHQkBf'][@name='identifier']")).sendKeys("ptejasri94@gmail.com");
		driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='whsOnd zHQkBf'][@name='password']")).sendKeys("janakimurthy");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac'][1]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@class='TN bzz aHS-bnt'][1]")).click();
		driver.findElement(By.xpath("//*[@class='qj qr'][1]")).click();
	}

}
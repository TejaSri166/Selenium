package dataDrivenApproach;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	
	public class OrangeHRM_LoginCombinations {
	WebDriver driver =null;
	
	@BeforeTest
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}

	@Test
	public void loginfunctionality() throws IOException {
		FileInputStream file =new FileInputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\OrangeLogin Combinations.xlsx");
		XSSFWorkbook workBook =new XSSFWorkbook(file);
		XSSFSheet sheet =workBook.getSheet("Sheet1");
		int rowCount =sheet.getLastRowNum();
		for(int i=0;i<rowCount;i++) {
			Row r= sheet.getRow(i);
			
		//<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());
		
		//Password
		driver.findElement(By.id("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
		
		//Login
		driver.findElement(By.id("btnLogin")).click();
		String Expected_Text ="welcome Admin";
		System.out.println("The Expected_Text is:"+Expected_Text);
		String Actual_Text =driver.getTitle();
		System.out.println("The actul_Text is:"+Actual_Text);
		if(Actual_Text .contains(Expected_Text)) {
			System.out.println("Pass");
			r.createCell(2).setCellValue("Login Successful");
			
		}
		else 
		{
		System.out.println("fail");
		r.createCell(2).setCellValue("Login fail");
		}
		
		
		
		
	}

}
	}

package testNGxmlFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTours_LogIn extends TestBase {
	
	@Test
	public void logIn() throws IOException, InterruptedException {
	FileInputStream file = new FileInputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\TestNG_NewTours.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	XSSFSheet sheet = workBook.getSheet("Sheet1");
	//Identifying active rows
	int rowCount =sheet.getLastRowNum();
	
	for(int i=1;i<=rowCount;i++) 
	{
		Row r = sheet.getRow(i);
		
	//Property of username-//<input type="text" name="userName" size="10">
		driver.findElement(By.name("userName")).sendKeys(r.getCell(0).getStringCellValue());
		
	//Property of password
		driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
		
		Thread.sleep(1000);
	//Property of Login
		driver.findElement(By.name("login")).click();
	
		
		String Expected_Title ="Find";
		System.out.println("The Expected_Title after login is:"+Expected_Title);
		String Actual_Title =driver.getTitle();
		System.out.println("The Actual_Title after login is:"+Actual_Title);
		
		if(Actual_Title .contains(Expected_Title)) {
			System.out.println("Login SuccessFul");
			r.createCell(2).setCellValue("Login Successful_Pass");
		}
		else {
			System.out.println("Login failed:-fail");
			r.createCell(2).setCellValue("Login failed:-fail");
			
		}
		
		FileOutputStream file1= new FileOutputStream("E:\\LIVE TECH\\Testing\\src\\com\\ResultFiles\\NewTours.xlsx");
		
		workBook.write(file1);
		
		driver.navigate().back();
	    driver.navigate().refresh();
		
		
	}
	
	}
	
}
	


package com.datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public  class NewTours_Login extends BaseTest {

	@Test
	public void logIn() throws IOException, InterruptedException {
	FileInputStream file = new FileInputStream("E:\\LIVE TECH\\SeleniumTesting\\src\\excelOperations\\NewTours_Login.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	XSSFSheet sheet = workBook.getSheet("Sheet1");
	//Identifying active rows
	int rowCount =sheet.getLastRowNum();
	
	for(int i=1;i<=rowCount;i++) 
	{
		Row r = sheet.getRow(i);
		
	//Property of username-//<input type="text" name="userName" size="10">
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys(r.getCell(0).getStringCellValue());
		
	//Property of password
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
		
		Thread.sleep(1000);
	//Property of Login
		driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > div > input[type=image]")).click();
	
		
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
		
		FileOutputStream file1= new FileOutputStream("E:\\LIVE TECH\\SeleniumTesting\\src\\com\\ResultFiles\\NewTours_Login.xlsx");
		
		workBook.write(file1);
	}

	
	}


}

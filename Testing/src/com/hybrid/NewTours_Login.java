package com.hybrid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class NewTours_Login extends BaseTest{
	@Test
	public void LogIn() throws IOException {
		FileInputStream file1 =new FileInputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\TestNG_NewTours.xlsx");
		XSSFWorkbook workBook =new XSSFWorkbook(file1);
		XSSFSheet sheet =workBook.getSheet("Sheet1");
	int	rowCount =sheet.getLastRowNum();
	for(int i=1;i<=rowCount;i++) {
		Row r=sheet.getRow(i);
		
		//Identifying properties file in the project
		
		Properties pr =new Properties();
		pr.load(file1);
		
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys(r.getCell(0).getStringCellValue());
		
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys(r.getCell(1).getStringCellValue());
		
		
		driver.findElement(By.name(pr.getProperty("SignIn"))).click();
		
		String Expected_Title ="Find";
		System.out.println("The Expected_title is:"+Expected_Title);
		
		String Actual_Title =driver.getTitle();
		System.out.println("The Actual_Title is:"+Actual_Title);
		
		if(Actual_Title .contains(Expected_Title)) {
			System.out.println("Login successful is Pass");
			r.createCell(2).setCellValue("LogIn successful_Pass");
			
		}
		else {
			System.out.println("LogIn failed -Fail");
			r.createCell(2).setCellValue("LogIn failed_fail");
		}
		
		FileOutputStream file2 =new FileOutputStream("E:\\LIVE TECH\\Testing\\src\\com\\ResultFiles\\KeyWordResult.xlsx");
		workBook.write(file2);
		driver.navigate().back();
		driver.navigate().refresh();
		
		
	}
		
		
		
	}

}

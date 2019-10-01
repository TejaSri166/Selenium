package dataDrivenApproach;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testNG_Programs.TestBase;
public class NewTours_UserRegistration extends TestBase {
	
@Test(priority=1)
public void register() {
	driver.findElement(By.linkText("REGISTER")).click();
			
}
@Test(priority=2)
public void userRegistrationpage() throws IOException, InterruptedException
{
	FileInputStream file =new FileInputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\TestNG_NewTours_UserRegister.xlsx");
	XSSFWorkbook workBook =new XSSFWorkbook(file);
	XSSFSheet sheet =workBook.getSheet("Sheet1");
	
	int rowCount =	sheet.getLastRowNum();
	for(int i=1;i<=rowCount;i++) {
		Row r =sheet.getRow(i);
		
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		
		//Type Casting
		double d =r.getCell(2).getNumericCellValue();
		long x =(long)d;
		String phoneNumber =Long.toString(x);
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys(phoneNumber);
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
		
		
		driver.findElement(By.name("address1")).clear();
		driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
		//Type Casting
		double d1 =r.getCell(7).getNumericCellValue();
		long y =(long)d1;
		String postalCode =Long.toString(y);
		driver.findElement(By.name("postalCode")).clear();
		driver.findElement(By.name("postalCode")).sendKeys(postalCode);
		//driver.findElement(By.name("country")).clear();
		driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
		
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
		driver.findElement(By.name("confirmPassword")).clear();
		driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
		
		//Property of submit button
		driver.findElement(By.name("register")).click();
		
		Thread.sleep(3000);
		String Expected_UserName =r.getCell(9).getStringCellValue();
		System.out.println("The expected_result is:"+Expected_UserName);
		
		//String Actual_UserRegisteredText =driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]\r\n")).getText();
				
		String Actual_UserRegisteredText =driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b")).getText();
		System.out.println("The Actual_UserRegisteredText:"+Actual_UserRegisteredText);
		if (Actual_UserRegisteredText .contains(Expected_UserName)) {
			
			System.out.println("User Registration Successfully _Pass");
			r.createCell(12).setCellValue("User Registration Successfully_pass");
			
		}
		else {
			System.out.println("User Registration failed_fail");
			r.createCell(12).setCellValue("User Registration failed_fail");
		}
		FileOutputStream file1 =new FileOutputStream("E:\\LIVE TECH\\Testing\\src\\com\\ResultFiles\\NewToursUserLogin.xlsx");
		workBook.write(file1);
		driver.navigate().back();
	
	
		
	}
	
}
}
	
///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]


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

public class OrangeHRM_AddEmployee_TestNG  extends OrangeHRMTestBase {
@Test(priority = 1)
	public void Login() {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//Password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//Login
		driver.findElement(By.id("btnLogin")).click();
}
	
@Test(priority = 2)
	public void pim() throws IOException {
		driver.findElement(By.xpath("//*[@id=\'menu_pim_viewPimModule\']/b")).click();
		
		//AddEmployee<a href="/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		FileInputStream file =new FileInputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\OrangeHrm_AddEmployee_ Excel.xlsx");
		XSSFWorkbook workBook =new XSSFWorkbook(file);
		XSSFSheet sheet =workBook.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		for(int i=1;i<=rowCount;i++) {
			Row r =sheet.getRow(i);
		
		//FirstName
		driver.findElement(By.id("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		
		//Middle Name
		driver.findElement(By.id("middleName")).sendKeys(r.getCell(1).getStringCellValue());
		
		//Last Name
		driver.findElement(By.id("lastName")).sendKeys(r.getCell(2).getStringCellValue());
		
		
		String Actual_Result  =driver.findElement(By.xpath("//*[@id='employeeId']")).getAttribute("value");
		System.out.println("The actual result is:"+Actual_Result);
		
		
		//property of save
		driver.findElement(By.id("btnSave")).click();

		System.out.println("Navigating to personal details");
		
	
		

	//Inspecting the properties of employee id in the personal details page
	//<input value="0045" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
	String  Expected_Result = driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
	System.out.println("The expected resultis:"+Expected_Result);
	
	if(Actual_Result .contains(Expected_Result)) {
		System.out.println("Pass");
		r.createCell(3).setCellValue("Pass");
	}
	else {
		System.out.println("Fail");
		r.createCell(3).setCellValue("fail");
	}
	FileOutputStream file1=new FileOutputStream("E:\\LIVE TECH\\Testing\\src\\com\\ResultFiles\\OrangeHrmAddEmployee.xlsx");
	workBook.write(file1);
	driver.navigate().back();
	driver.navigate().refresh();
		
	}
		
		
		
	}
	
	
}
	
	
	



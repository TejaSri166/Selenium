package com.ExcelPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrm_AddEmployee_EmployeeList_Data {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Property of UserName
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		//Property of Password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//Property of Login
		driver.findElement(By.id("btnLogin")).click();
		
		//Property of addEmployee-<a href="/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		/*WebElement AddEmployee = driver.findElement(By.linkText("Add Employee"));
		Actions act =new Actions(driver);
		act.moveToElement(AddEmployee).perform();
		System.out.println("Navigating to Add Employee Page");*/
		
		//Property of pim-//*[@id="menu_pim_viewPimModule"]/b
		driver.findElement(By.xpath("//*[@id=\'menu_pim_viewPimModule\']/b")).click();
		
		//Property of Add Employee-<a href="/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		driver.findElement(By.linkText("Add Employee")).click();
		
		System.out.println("Navigating to Add Employee Page");
		
		//Property of first name-<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		driver.findElement(By.id("firstName")).sendKeys("teja");
		
		//Property of last name-<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		driver.findElement(By.id("lastName")).sendKeys("sri");
		
		//Property of save-<input type="button" class="" id="btnSave" value="Save">
		driver.findElement(By.id("btnSave")).click();
		
		System.out.println("Navigating to Personal details page");
		driver.navigate().back();
		System.out.println("Navigating to Employee List Page");
		
		//Property of Employee List page-<a href="/index.php/pim/viewEmployeeList/reset/1" id="menu_pim_viewEmployeeList">Employee List</a>
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		
		
		//Property of complete table-//*[@id="search-results"]/div
	WebElement table=driver.findElement(By.id("frmList_ohrmListComponent"));
	List <WebElement> rows=driver.findElements(By.tagName("tr"));
	FileInputStream file= new FileInputStream("E:\\LIVE TECH\\Testing\\src\\excelOperations\\OrangeHrm.xlsx");
	XSSFWorkbook workBook=new XSSFWorkbook(file);
	XSSFSheet sheet =workBook.getSheet("sheet1");
	System.out.println("The no.of rows:"+rows.size());
	for (int i=0;i<rows.size();i++) {
		
	List <WebElement> columns=rows.get(i).findElements(By.tagName("td"));
	//System.out.println("the no.of columns:"+columns.size());
	Row r=sheet.getRow(i);
	int cellCount =r.getLastCellNum();
	for (int j=0;j<columns.size();j++) {
		String data =r.getCell(j).getStringCellValue();
		System.out.print(data+ "        ");
	}
	System.out.println();
	
	}
	
	driver.quit();
	}
}

	 
	




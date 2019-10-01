


/*Assignment------goto orange hrm and give the username and password and click on login...
 and go to pim in that go to add employee...and give the details in the firstname,middle name,last name and clickon save
 and it should navigate to personal detils page...and take the validation for employee id in the personal details and in add employee page
 and compare it. and validate the profilein the personaldetails and compare with the text given and logout.*/
 

package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_ORHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
		
		driver.manage().window().maximize();
		
		//property of pim
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
		
		//property of AddEmployee
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		System.out.println("Navigating to add employee page");
		
		//property of firstname
		driver.findElement(By.id("firstName")).sendKeys("Teja");
		
		//property of middlename
		driver.findElement(By.id("middleName")).sendKeys("sri");
		
		//property of lastname
		driver.findElement(By.id("lastName")).sendKeys("Ponnuru");
		

		//Inspecting the properties of employee id in the Add Employee page
		//	<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0053" id="employeeId">
		String beforeSaving =driver.findElement(By.xpath("//*[@id='employeeId']")).getAttribute("value");
		System.out.println("The actual result is:"+beforeSaving);
		
		
		//property of save
		driver.findElement(By.id("btnSave")).click();

		System.out.println("Navigating to personal details");
		
	
		

	//Inspecting the properties of employee id in the personal details page
	//<input value="0045" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
	String  AfterSaving = driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
	System.out.println("The expected resultis:"+AfterSaving);
	
	if(AfterSaving .equals (beforeSaving)) {
		System.out.println("Pass");
	}
	else {
		System.out.println("fail");
	}
	String Expected_text="teja sri Ponnuru";
	System.out.println("The Expected_text is:"+Expected_text);
	
	//Validating the profile
	String Actual_text=driver.findElement(By.cssSelector("#profile-pic > h1")).getText();
	System.out.println("The Actual_text is:"+Actual_text);
	
	
	if(Actual_text .contains(Expected_text)) {
		System.out.println("The text is matching");
	}
	else {
		System.out.println("The text is not matching");
	}

	//Logout
	//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>-WelcomeAdmin
	driver.findElement(By.id("welcome")).click();
	
	Thread.sleep(2000);
	
	//<a href="/index.php/auth/logout">Logout</a>
	driver.findElement(By.linkText("Logout")).click();

	driver.quit();
	

	}
}

		
	






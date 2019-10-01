package com.Krishna;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test2 extends Test1 {
	
	
	@Test(priority=-3)
		public void employee() {
		driver.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).click();
		//driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();
		
			
		}
	}



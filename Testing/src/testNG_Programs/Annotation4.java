package testNG_Programs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation4 {
	@BeforeMethod
	public void gmailLaunchAndLogIn() {
		System.out.println("Application Launch");
	}
	
	@Test
	public void drafts() {
		System.out.println("Drafts functionality");
	}
	@Test(enabled =false)
	public void facebook() {
		System.out.println("facebook functionality");
	}
	@Test
	public void composeMail() {
		System.out.println("ComposeMail functionality");
	}
	@AfterMethod
	public void gmailApplicationClose() {
		System.out.println("Gmail application close");
	}

		
	}



package testNG_Programs;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 {
	@BeforeTest
	public void gmailLaunchAndLogIn(){
		System.out.println("Application launch and login");
	}
	@Test
	public void composeMail()
	{
		System.out.println("ComposeMail functionality");
			
	}
	@Test
public void drafts() {
		System.out.println("drafts functionality");
	}
	@Test
	public void bin() {
		System.out.println("Bin functionality");
	}
	@AfterTest
	public void gmailApplicationClose() {
		System.out.println("Close functionality");
	}
}

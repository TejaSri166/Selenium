package testNG_Programs;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_2 {
@BeforeTest
public void faceBookLogin() {
	System.out.println("Application is opened");
}
@Test
public void faceBooknotification() {
	System.out.println("Notifications");
}
@Test 
public void faceBookChat() {
	System.out.println("Chat in faceBook");
}
@AfterTest
public void faceBookLogout()
{
	System.out.println("Facebook logout");
}


}

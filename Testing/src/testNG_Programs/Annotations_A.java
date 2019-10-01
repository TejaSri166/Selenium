package testNG_Programs;

import org.testng.annotations.Test;

public class Annotations_A {
@Test(priority =0)
public void faceboooklogin() {
	System.out.println("facebook  launched");
}
@Test
public void facebooknotifications() {
	System.out.println("facebook notifications");
}
@Test(priority =2)
public void facebokchat()
{
	System.out.println("facebook chat");
}
@Test(priority =1)
public void facebooklogout() {
	System.out.println("facebook logout");
}
}

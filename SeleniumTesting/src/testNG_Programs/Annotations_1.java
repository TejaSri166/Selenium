package testNG_Programs;

import org.testng.annotations.Test;

public class Annotations_1 {
	@Test(priority =0)
	public void gmail() {
		System.out.println("gmail Url");
	}
	@Test(enabled =false)
	public void  whatsapp() {
		System.out.println("Whatsapp login");
	}
	@Test(priority =1)
	public void twitter() {
		System.out.println("Twitter");
	}
	@Test(priority =-3)
	public void linkdin() {
		System.out.println("Linkdin Login");
			
	}
	@Test(priority =-1)
	public void facebook() {
		System.out.println("facebook Login");
	
	}
	
	

}

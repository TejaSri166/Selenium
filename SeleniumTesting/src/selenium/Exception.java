package selenium;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter thefirst variable");
		double a=sc.nextDouble();
		System.out.println("enter the next vsrisble");
		int b=sc.nextInt();
		System.out.println("teja");
		System.out.println("jagan");
		try {
			System.out.println(a/b);
		}
		catch(ArrayIndexOutOfBoundsException  ae) {
			
			ae.printStackTrace();
		}
		
		System.out.println("janaki");
		
	

	}

}

package collections;

import java.util.Scanner;

public class SwappingofNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of x");//5
		int x =sc.nextInt();
		System.out.println("Enter the value of y");//4
		int y =sc.nextInt();
		x=x+y;//x=5+4=9
		y=x-y;//y=9-4=5
		x=x-y;//x=9-5=4
		System.out.println("After swapping x value is:"+x);
		System.out.println("After swapping y value is:"+y);
		
		
		
		
			
		}
		
		

}

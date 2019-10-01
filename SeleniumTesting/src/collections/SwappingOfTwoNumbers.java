package collections;

import java.util.Scanner;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		int temp,x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of  x");
		int x1=sc.nextInt();
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the value of  y");
		int y1=s.nextInt();
		temp = x1;
	     x1 = y1;
	     y1 = temp;
	     System.out.println("The value of of x1 after swaapping is"+x1);
	     System.out.println("The value of y1 after swapping is"+y1);
	     
		
		
		

	}

}

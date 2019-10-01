package collections;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of a number");
		int n =sc.nextInt();
		for (int i=1;i<=n;i++) {
		fact=fact*i;
		System.out.println(fact);
		
		}
		
		

	}

}

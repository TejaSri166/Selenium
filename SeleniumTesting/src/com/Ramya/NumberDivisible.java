package com.Ramya;

import java.util.Scanner;

public class NumberDivisible {
	
public static void main(String[] args)
{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number : ");
	n=sc.nextInt();
	if(n%5==0)
		System.out.println("Given number is divisible by 5");
	else
		System.out.println("Given number is not divisible by 5");
}
}

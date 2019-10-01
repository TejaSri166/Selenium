package com.Ramya;

import java.util.Scanner;

public class SecondBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c)
			{
				//System.out.println("a is  big number among three");
				if(b>c)
				{
					System.out.println("b is second big");
				}
				else
				{
					System.out.println("c is second big");
				}
			}
			if(b>a && b>c)
			{
				//System.out.println("b is  big");
				if(a>c)
				{
					System.out.println("a is second big");
				}
				else
				{
					System.out.println("c is second big");
				}
			}
			if(c>b && c>a)
			{
				//System.out.println("c is big");
				if(b>a)
				{
					System.out.println("b is second big");
				}
				else
				{
					System.out.println("a is second biggest");
				}
		}

	}

}

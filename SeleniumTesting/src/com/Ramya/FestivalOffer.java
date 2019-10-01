package com.Ramya;

import java.util.Scanner;

public class FestivalOffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pCost,qty,time,totalBill;
		String card;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the product cost : ");
		pCost=sc.nextInt();
		System.out.print("Enter the quantity : ");
		qty=sc.nextInt();
		System.out.print("Enter the time when customer has entered:");
		time=sc.nextInt();
		System.out.print("Enter the card name : ");
		card=sc.next();
		System.out.println("Product cost is:"+pCost);
		System.out.println("Quantity is:"+qty);
		totalBill=pCost*qty;
		System.out.println("Total bill is :"+totalBill);
		int discount=20,disAmount;
		if(time>=10&&time<=17)
		{
			if(card=="HDFC")
			{
				discount=(discount)+10+5;
				System.out.println("The discount percentage is:"+discount);
				disAmount=(totalBill)*discount/100;
				System.out.println("Discount amount is:"+disAmount);
			}
			else
			{
				discount=discount+10;
				System.out.println("The discount percentage is:"+discount);
				disAmount=(totalBill)*discount/100;
				System.out.println("Discount amount is:"+disAmount);
			}
		}
		else
		{
			if(card=="HDFC")
			{
				discount=discount+5;
				System.out.println("The discount percentage is:"+discount);
				disAmount=(totalBill)*discount/100;
				System.out.println("Discount amount is:"+disAmount);
			}
			else
			{
				System.out.println("The discount percentage is:"+discount);
				disAmount=(totalBill)*discount/100;
				System.out.println("Discount amount is:"+disAmount);
				
				
			}
		}
		
		
		
	}

}

package com.app;

import java.util.Scanner;

public class AddMultiple {

	public static void main(String[] args) {
		int n=0,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total element number you want to add");
		n=s.nextInt();
		int[] aa=new int[n];
		System.out.println("Enter Elements");
		for(int i=0;i<n;i++) {
			aa[i]=s.nextInt();
			sum=sum+aa[i];
		}
		System.out.println("Total Sum :"+sum);

	}

}

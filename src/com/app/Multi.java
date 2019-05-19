package com.app;

public class Multi {
public static void main(String[] args) {
	
	 for (int i = 1; i <= 10; i++) {
	        for (int j = i; j <= 10 * i; j += i) {
	            System.out.print(j + " ");
	        }
	        System.out.println();
	   }
}
}
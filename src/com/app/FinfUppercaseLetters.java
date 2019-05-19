package com.app;


public class FinfUppercaseLetters {

	public static void main(String[] args) {

		String sr="I am not Your BussinnessConsigred";
		for(int i=0;i<sr.length();i++) {
			if (Character.isUpperCase(sr.charAt(i))) {
				System.out.print(sr.charAt(i)+" ");
				System.out.println();
			} 

		}
		for(int i=0;i<sr.length();i++) {
			if (Character.isLowerCase(sr.charAt(i))) {
				System.out.print(sr.charAt(i)+" ");
			} 

		}
		

	}

}


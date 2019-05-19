package com.app;

public class Palindrome {

	public static void main(String[] args) {
		String str="radar";String b="";
		for(int in=str.length()-1;in>=0;in--) {
			b=b+str.charAt(in);
			//System.out.println(b);
		}
		if(b.equalsIgnoreCase(str)) {
			System.out.println("ITs Palindrome string ");
		}else {
			System.out.println("Not A Palindrome String");
		}
		
		System.out.println("----------------------------------------------------------------------------");
		
		int tot=121,reversal=0; int ars=tot;
		while(tot!=0) {
			int digit=tot%10;
			reversal=reversal*10+digit;
			tot/=10;
		}
		if(ars==reversal) {
			System.out.println("Palindrome Numbers");
		}
		else {
			System.out.println("NOt Pal Numbers");
		}
	}
}
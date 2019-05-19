package com.app;

public class UPLOWNum {
	public static void main(String[] args) {
		String st="YogeshGirde21@gmail.com";
		int upper=0,lower=0,digit=0,special=0;
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z') {
				upper++;
			}
			else if(ch>='a'&&ch<='z') {
				lower++;
			}
			else if(ch>='0'&&ch<='9') {
				digit++;
			}
			else {
				special++;
			}
		}
		System.out.println("Upper :-"+upper);
		System.out.println("Lower :-"+lower);
		System.out.println("Number :-"+special);
		System.out.println("Special :-"+digit);
		char[]ch=st.toCharArray();
		System.out.println("Last String Element : "+ch[ch.length-1]);
	}
}



package com.app;

public class ReverseString {
public static void main(String[] args) {
	String s="wicked";
	char[]ch=s.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch[i]);
	}
}
}
/*{
	String oas ="First luv";
	 StringBuilder putt=new StringBuilder();
	 putt=putt.append(oas).reverse();
	 System.out.println(putt);
}
}*/
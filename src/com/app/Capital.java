package com.app;

public class Capital {

	public static void main(String[] args) {
		String a =" Atta5ry is vary Famou7rs For Its Ga3ming Form";

		for(int i=0;i<a.length();i++) {
			if(Character.isDigit(a.charAt(i))) {
				System.out.print(a.charAt(i)+"\t");
			}
		}

		for(int i=0;i<a.length();i++) {
			if(Character.isUpperCase(a.charAt(i))) {
				System.out.print(a.charAt(i));
			}
	}
}
}


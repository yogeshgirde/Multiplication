package com.app;

public class ReverseNumber {
public static void main(String[] args) {
	int num=4561,reversal=0;
	while(num!=0) {
		int digit=num%10;
		reversal=reversal*10+digit;
		num/=10;
	}
	System.out.println(reversal);
}
}




/* {
 * int nums=987456,reversal=0;
		for(;nums!=0;nums/=10) {
			int digit=nums%10;
			reversal =reversal*10+digit;
			//nums/=10;
		}
		System.out.println(reversal);
	}
 * 
 * 
	String s="110022";
	StringBuilder ss=new StringBuilder();
	 
	System.out.println(ss);
}
}*/

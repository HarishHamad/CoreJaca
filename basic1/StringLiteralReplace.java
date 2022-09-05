package com.raystech.basic1;

public class StringLiteralReplace {
public static void main(String[] args) {
	String str = "Java";
	
	String str1 = new String("Javaa");
	System.out.println(str);
	System.out.println(str1);
	
	//..........................//
	System.out.println("........Replace........");
	
	String s1 =str.replace("a", "@");
	String s2 = str.replaceAll("[a-z]", "j");
	System.out.println(s1);
	System.out.println(s2);
}
}

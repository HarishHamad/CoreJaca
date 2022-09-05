package com.raystech.basic1;

public class StringvsSb2 {
public static void main(String[] args) {
	String s1  = "Java";
	String s2 = "Java";
	System.out.println("value 8-8 byte="+s1.equals(s2));  //value 8 bytes
	System.out.println(s1==s2);                            //Adress 2 bytes
	
	//.............String new keyword...........//
	System.out.println(".....New keyword....");
	String s3 = new String ("Java");
	String s4 = new String ("Java");
	System.out.println("value 8-8 byte="+s3.contentEquals(s4));
	System.out.println(s3==s4);
	
}
}

package com.raystech.basic1;

public class StringBufferMethod {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer ("Vijay");
	sb.append("Dinanath Chouhan");
	System.out.println("Length="+sb.length());
	System.out.println("Capacity="+sb.capacity());
	System.out.println("Char at="+sb.charAt(14));
	System.out.println("Index Of="+sb.indexOf("Chouhan"));
	System.out.println("Replace="+sb.replace(0, 2, "Chouhan"));
	System.out.println("Reverse="+sb.reverse());
}
}

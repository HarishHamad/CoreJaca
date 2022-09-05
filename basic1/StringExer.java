package com.raystech.basic1;

public class StringExer {
	
	public static void main(String[] args) {
		String name = "Vijay Dinanath Chouhan";
		System.out.println(name.indexOf("D"));
		System.out.println("Strin Length="+name.length());
		System.out.println("7th character is="+name.charAt(6));
		System.out.println("index of i is="+name.indexOf("i"));
		System.out.println("First n Position="+name.indexOf("n"));
		System.out.println("Last n Position="+name.lastIndexOf("n"));
		System.out.println("a is replaced by b="+name.replace("a","b"));
		System.out.println("Chhota vijay="+name.toLowerCase());
		System.out.println("Bada vijay="+name.toUpperCase());
		System.out.println("Starts With Vijay="+name.startsWith("Vijay"));
		System.out.println("Ends with han="+name.endsWith("han"));
		System.out.println("substring="+name.substring(8));
	}

}

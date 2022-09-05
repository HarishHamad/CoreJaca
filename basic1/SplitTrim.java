package com.raystech.basic1;

public class SplitTrim {

	public static void main(String[] args) {
		String name = "Vijay Dinanath Chouhan";
		String[] s1 = name.split(" ");
		for (String s:s1) {
			
		System.out.println("name.split:" +s); // Space pass se break karega

		System.out.println("Name=" + name);
		System.out.println("name.trim:" + name.trim()); // Aage piche ki space hatata he
	}
}
}
package com.raystech.basic1;

public class ExtractlastnameString {
public static void main(String[] args) {
	String name = "vijay Chouhan";
	String[]s = name.split(" ");
	for (String str : s) {
	//	System.out.println(str);

	}
	System.out.println(s[0]);
}
}

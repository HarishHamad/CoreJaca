package com.raystech.basic1;

public class StringCount {

	public static void main(String[] args) {
		String name = "Vijay dinanath chouhan";
		char c = 'a';
		int count = 0;
		for (int i = 0; i < name.length(); ++i) {
			if (c == name.charAt(i)) {
				count++;

			}
		}
		System.out.println(count);
	}

}

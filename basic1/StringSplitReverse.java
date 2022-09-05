package com.raystech.basic1;

public class StringSplitReverse {

	public static void main(String[] args) {

		String name = "Vijay dinanath chouhan";
		String[] s = name.split(" ");

		for (int i = 0; i < s.length; i++) {

			for (int j = s[i].length() - 1; j >= 0; j--) {

				System.out.print(s[i].charAt(j));

			}
			System.out.print(" ");

		}

	}
}

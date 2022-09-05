package com.raystech.basic1;

public class Grade {
	public static void main(String[] args) {
		int marks = 32;
		if (marks >= 91 && marks <= 100) {
			System.out.println("A+");
		} else if (marks >= 75 && marks <= 90) {
			System.out.println("B+");
		} else if (marks >= 60 && marks <= 74) {
			System.out.println("C+");

		}else if (marks>=33 && marks<=59) {
			System.out.println("D+");
		}else {
			System.out.println("Fail");
		}
	}
}

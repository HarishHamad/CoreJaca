package com.exercise4_14;

public class Que5ReverseDigit {
public static void main(String[] args) {
	int n = 123;
	int r = 0;
	int i = 0;
	while(i<n) {
		r = n%10;
		System.out.print(r);
		n=n/10;
	}
	
		
	}
}


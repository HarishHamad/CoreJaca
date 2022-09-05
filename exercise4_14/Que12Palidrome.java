package com.exercise4_14;

public class Que12Palidrome {
public static void main(String[] args) {
	int number = 141;
	int r = 0;
	int sum = 0;
	int n=number;
	while(n>0) {
		r=n%10;
		sum = (sum*10)+r;
		n = n/10;
		
	}
	if(sum==number) {
		System.out.println("palidrome number="+number);
	}else {
		System.out.println("not palidrome number="+number);
	}
}
}

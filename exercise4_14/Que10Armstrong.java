package com.exercise4_14;

public class Que10Armstrong {
public static void main(String[] args) {
	int num =153;
	int n=num;
	int sum =0;
	while (num!= 0) {
		int r  = num%10;
		sum = sum +(r*r*r);
		num = num/10;
	}
	if (sum==n) {
		System.out.println(n+" is Armstrong number");
	}
	else {
		System.out.println(n+" not Armstrong number");
	}
}
}

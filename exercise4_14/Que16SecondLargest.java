package com.exercise4_14;

public class Que16SecondLargest {
public static void main(String[] args) {
	int a[] = { 12,34, 46, 29, 12, 87};
	int x = 0;
	int y = a[0];
	for (int i = 0; i < a.length; i++) {
		if (a[i]>x){
			y = x;
			x = a[i];	
		}
		else if (a[i]>y&&a[i]<x) {
			y = a[i];
		}
		
	}
	System.out.println("second largest number is="+y);
}
}

package com.exercise4_14;

public class Que6FibonacciSeries {
	public static void main(String[] args) {
		int a =0;
		int b =1;
		int i = 0;
		while(i<=10) {
			System.out.println(a);
			i++;
			int c = a+b;
			a=b;
			b=c;
		}
	}
}


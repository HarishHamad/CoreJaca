package com.exercise4_14;

public class Que13harmonicSeries {
public static void main(String[] args) {
	int n = 100;
	int sum = 0;
	for(int i = 1; i<=n; i++) {
		sum=sum+(1/i);
	}
	System.out.println("Harmonic value="+sum);
	
}
}

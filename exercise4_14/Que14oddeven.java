package com.exercise4_14;

public class Que14oddeven {
public static void main(String[] args) {
	int sum = 0;
	int sum1 = 0;
	int i;
	for ( i = 0; i < 50; i++) {
		sum=sum+i;
		
	}
	System.out.println("sum of odd number="+sum);
	for (int j = 2; j < 50; j++) {
		sum1=sum1+j;
	}
	System.out.println("sum of even number="+sum1);
	int average = (sum1+sum)/2;
	System.out.println(average);
}
}

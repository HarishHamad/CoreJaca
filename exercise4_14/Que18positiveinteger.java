package com.exercise4_14;

public class Que18positiveinteger {
public static void main(String[] args) {
	int a[] = {5,4,3,2,1};
	int b= 7;
	add(b,a);
	
}

private static void add(int b, int[] a) {
	int p = 0, s = 0;
	for (int i = 0; i < a.length; i++) {
		if (b==a[i]) {
			s=i;
			p++;
			
			
		}
	}
	if(p>0) {
		System.out.println("value exist="+s);
		}else {
			System.out.println(-1);
		}
	
}
}

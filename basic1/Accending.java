package com.raystech.basic1;

public class Accending {
public static void main(String[] args) {
	System.out.println("Accending order numbers are");
	int[]abc = {23,55,73,58,89,59};
	for(int i = 0; i<abc.length;i++) {
		for(int j=i+1; j<abc.length; j++) {
			int a =0;
			if(abc[i]>abc[j]) {
			a=abc[i];
			abc[i]=abc[j];
			abc[j]=a;
			
		}
			
		}
		System.out.print(abc[i]+" ");		
	}
}
}
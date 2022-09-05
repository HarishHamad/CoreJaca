package com.raystech.basic1;

public class Condifelsefor {
public static void main(String[] args) {
	int size = args.length;
	if(size==0) {
		System.out.println("Usage = Java Hello All n1 n2 n3.....");
	}else {
		for(int i = 0;i<size;i++) {
			System.out.println(i+"=hello="+args[i]);
		}
	}
}
}

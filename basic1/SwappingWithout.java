package com.raystech.basic1;

public class SwappingWithout {
public void Swapping() {
	int a = 20;
	int b = 10;
	System.out.println(a+" "+b);
	a = a+b;
	b= a-b;
	a = a-b;
	System.out.println(a+" "+b);
}
public static void main(String[] args) {
	{
		SwappingWithout m = new SwappingWithout();
		m.Swapping();
	}
}
}

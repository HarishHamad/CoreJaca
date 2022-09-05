package com.raystech.basic1;

public class TestMethod {
public int add (int a, int b){
	int c = a+b;
	return c;
	}
	public int sub (int a, int b) {
		int c = a-b;
		return c;	
}
public static void main(String[] args) {
	TestMethod t = new TestMethod();
	int c= t.add(87, 54);
	System.out.println(c);

	int d = t.sub(75, 25);
	System.out.println(d);
}
}

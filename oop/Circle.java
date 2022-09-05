package oop;

public class Circle extends Shape {
private static final int PI = (int) 3.14;
private int radius;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}
public double area() {
	double area =  PI*radius*radius;
	return radius;
	
}
}

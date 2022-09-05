package polymorphism.abstractclass;

public class Triangle extends Shape {
private int base;
private int height;
public Triangle() {}
public Triangle(int b , int h) {
	base = b;
	height = h;
	
}
@Override
public double area() {
	double arr = base*height;
	return arr;
	
}
}

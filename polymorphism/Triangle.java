package polymorphism;

public class Triangle extends Shape {
private int base;
private int height;
public Triangle(int b, int h) {
	base = b;
	height = h;
	
}
public double area() {
	double arr = 0.5 * base * height;
	return arr;

}
}

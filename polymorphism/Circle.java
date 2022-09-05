package polymorphism;

public class Circle extends Shape {

private static final double PI = 3.14;
private int radius;
public Circle(int r) {
	radius = r;
	
}
public double area() {
	double arr = PI *radius*radius;
	return arr;

}
}
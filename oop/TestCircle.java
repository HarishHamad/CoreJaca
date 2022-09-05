package oop;

public class TestCircle {
public static void main(String[] args) {
	Circle c = new Circle();
	c.setborderwidth(12);
	c.setcolour("red");
	c.setRadius(12);
	
	double arr= c.area();
	System.out.println(c.getborderwidth());
	System.out.println(c.getcolour());
	System.out.println(arr);
}
}

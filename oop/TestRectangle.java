package oop;

public class TestRectangle {
public static void main(String[] args) {
	Rectangle r = new Rectangle();
	r.setborderwidth(12);
	r.setcolour("blue");
	r.setLength(8);
	r.setWidth(10);
	
	double a = r.area();
	System.out.println(r.getborderwidth());
	System.out.println(r.getcolour());
	System.out.println(r.getLength());
	System.out.println(r.getWidth());
}
}

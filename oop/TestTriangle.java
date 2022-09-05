package oop;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.setBase(5);
		t.setHeight(3);
		t.setcolour("red");
		t.setborderwidth(12);
		double arr = t.area();

		System.out.println("Area of triangle= "+arr);
		System.out.println("Base of triangle= "+t.getBase());
		System.out.println("Height of triangle= "+t.getHeight());
		System.out.println("Colour of triangle= "+t.getcolour());
		System.out.println("Borderwidth of triangle= "+t.getborderwidth());

	}
}

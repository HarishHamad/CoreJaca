package polymorphism;

public class Shape {
	private String colour;
	private int borderWidth;
	private static final double PI= 3.14;
	private static double area;

	public void  setcolour (String c) {
		colour = c;
		
	}
	public String getcolour() {
		return colour;
		
	}
	public void setborderwidth(int b) {
		borderWidth = b;
		
	}
	public int getborderwidth() {
		return borderWidth;
		
	}
	public double area() {
		return 0;
		
	}
	}


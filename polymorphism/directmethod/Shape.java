package polymorphism.directmethod;

public class Shape {
	private String colour;
	private int borderwidth;
	public static final double pi = 3.14;
	public static final double PI = 3.14;

	public double area() {
		return 0;

	}

	public Shape() {
	}

	public Shape(String c, int b) {
		colour = c;
		borderwidth = b;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;

	}

	public static Shape getShape(int i) {
		if (i == 1) {
			return new Circle();
		}
		if (i == 2) {
			return new Rectangle();
		}
		if (i == 3) {
			return new Triangle();
		}
		return new Shape();

	}

}

package polymorphism.abstractclass;

public abstract class Shape {
private String colour;
private int radius;
private int borderwidth;
public static final float PI=3.14f;
public abstract double area();
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}
public int getBorderwidth() {
	return borderwidth;
}
public void setBorderwidth(int borderwidth) {
	this.borderwidth = borderwidth;
}
public static float getPi() {
	return PI;
}
}

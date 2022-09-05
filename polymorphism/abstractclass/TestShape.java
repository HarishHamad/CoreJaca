package polymorphism.abstractclass;

public class TestShape {
public static void main(String[] args) {
	Shape s = new Circle (5);
	s.setBorderwidth(5);
	s.setColour("red");
	s.setRadius(15);
	double arr = s.area();
	System.out.println("Area of circle= "+arr);
	System.out.println(s.getBorderwidth());
	System.out.println(s.getColour());
	System.out.println(s.getRadius());
}
}

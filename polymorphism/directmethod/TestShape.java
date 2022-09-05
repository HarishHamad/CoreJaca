package polymorphism.directmethod;

public class TestShape {
public static void main(String[] args) {
	Shape s = new Shape();
	
	Circle c = (Circle) Shape.getShape(1);
	c.setRadius(12);
	c.area();
	
	Rectangle r = (Rectangle) Shape.getShape(2);
	r.setLength(8);
	r.setWidth(10);
	r.area();
	
	Triangle t = (Triangle) Shape.getShape(3);
	t.setBase(15);
	t.setHeight(20);
	t.area();
}
}

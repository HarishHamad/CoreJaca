package polymorphism;

public class TestArrayShape {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Triangle(10, 12);
		s[1] = new Rectangle(8, 14);
		s[2] = new Circle(15);
		
		double TotalArea=0;

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
			TotalArea = calArea(s);
	

		}
		System.out.println("Total Area of Shape= " + TotalArea);
		
	}

	private static double calArea(Shape[] s) {
		double TotalArea = 0;

		for (int i = 0; i < s.length; i++) {
			TotalArea = TotalArea + s[i].area();

		}
		return TotalArea;
		
	
	}
	
}

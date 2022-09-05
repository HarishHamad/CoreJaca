package oop;

public class TasteShape {

public static void main(String[] args) {
	Shape s = new Shape();
	s.setcolour("blue");
	s.setborderwidth(8);
	
	System.out.println("colour="+s.getcolour());
	System.out.println("borderwidth="+s.getborderwidth());
}
}

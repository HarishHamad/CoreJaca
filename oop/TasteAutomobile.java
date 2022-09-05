package oop;

public class TasteAutomobile {
public static void main(String[] args) {
	Automobile a = new Automobile();
	a.setColour("red");
	a.setSpeed(30);
	a.setMake("Tata");
	a.setGear(1);
	
	
	
	System.out.println("colour= "+a.getColour());
	System.out.println("speed= "+a.getSpeed());
	System.out.println("make= "+a.getMake());
	System.out.println("gear= "+a.getGear());
	
}
}

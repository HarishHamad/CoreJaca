package polymorphism.methodoverloading;

public class TestAddition {

	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(12, 23);
		a.add(43, 11, 21);
		a.add(21, 15);
		a.add("Ram", "Siya");

	}

}

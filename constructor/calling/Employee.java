package constructor.calling;

public class Employee extends Person {
private int id;
private String Designation;

public Employee() {
	System.out.println("This is default constructor");
}

public Employee(int i, String d, String fn, String ln, String ad) {
	super("rays","technology","indore");
	id = i;
	Designation = d;
	System.out.println(id+" "+Designation+" "+fn+" "+ ln+" "+ad);
}
public static void main(String[] args) {
	
	Employee e = new Employee(23421, "Software developer", "harish", "hamad", "indore");

}
}
package constructor.calling;

public class Person  {
private String fname;
private String Address;
private String lname;

public Person() {
	System.out.println("This is default constructor");
	
}
public Person(String fn, String ln) {
	fname = fn;
	lname = ln;
	System.out.println("2nd parameter= "+fname +" "+ lname);
}
public Person(String fn, String ln, String ad ) {
	this(fn ,ln);
	Address = ad;
	System.out.println("3rd parameter= "+fname+" "+lname+" "+Address);
}
public static void main(String[] args) {
	Person p = new Person("rays" , "hamad", "indore");
	
	
}
}
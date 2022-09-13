package cloning;

public class EmployeeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address a = new Address();

		a.setCity("indore");
		a.setHouseno(50);
		a.setStreet("Vijay nagar");
		
		a.setAddr(a);
		a.setId(122456);
		a.setFirstname("HArish");
		a.setLastname("Hamad");
		
		System.out.println(a.getId());
		System.out.println(a.getFirstname());
		System.out.println(a.getLastname());
		System.out.println(a.getAddr().getCity());
		System.out.println(a.getAddr().getHouseno());
		System.out.println(a.getAddr().getStreet());
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		Employee e1 = (Employee)a.clone();
		
		System.out.println(e1.getId());
		System.out.println(e1.getFirstname());
		System.out.println(e1.getLastname());
		System.out.println(e1.getAddr().getCity());
		System.out.println(e1.getAddr().getHouseno());
		System.out.println(e1.getAddr().getStreet());
	}
}

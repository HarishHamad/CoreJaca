package cloning;

public class Employee implements Cloneable {
private int id;
private String firstname;
private  String lastname;
public Address addr;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
public Employee() {
	// TODO Auto-generated constructor stub
}
public Address Address(Address a) {
	addr =a;
	return addr;
	
}


}

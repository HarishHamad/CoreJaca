package oop;

import java.util.Date;

public class constructor2 {
private String name;
private Date dob;
private String address;

public constructor2(String n, Date d, String a) {
	name = n;
	dob = d;
	address =a;
	
		//System.out.println(name + " " + dob + " " + address);
	}

public String getName() {
	return name;
}

public Date getDob() {
	return dob;
}

public String getAddress() {
	return address;
}
	
}


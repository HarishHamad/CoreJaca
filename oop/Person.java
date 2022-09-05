package oop;

import java.util.Date;

public class Person {
	private String name;
	private String adress;
	private Date Dateofbirth;

	public void setname(String n) {
		name = n;

	}

	public String setname() {
		return name;

	}

	public void setadress(String i) {
		adress = i;

	}

	public String getadress() {
		return adress;

	}

	public void setDateofbirth(Date d) {
		Dateofbirth = d;
	}

	public Date getDateofbirth() {
		return Dateofbirth;

	}

}

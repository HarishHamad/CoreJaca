package oop;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TastePerson {
public static void main(String[] args) throws ParseException {
	Person p = new Person();
	SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
	String s = "19/08/2001";
	Date d = sdf.parse(s);
	
	
    p.setDateofbirth(d);
	p.setname("Harish");
	p.setadress("indore");
	
	
	System.out.println("name= "+p.setname());
	System.out.println("adress= "+p.getadress());
	System.out.println("Dateofbirth= "+sdf.format (p.getDateofbirth()));
	
}
}

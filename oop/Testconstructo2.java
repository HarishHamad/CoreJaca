package oop;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Testconstructo2 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String s = "11/11/2011";
		Date d = sdf.parse(s);
		
		

		constructor2 c2 = new constructor2("Harish", d, "indore");
		
    System.out.println(c2.getName());
    System.out.println(c2.getAddress());
  System.out.println(sdf.format(c2.getDob()));
    
	}
}

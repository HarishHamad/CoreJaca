package com.raystech.basic1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Formate {
public static void main(String[] args) throws ParseException {
	Date d = new Date();
	System.out.println(d);
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String sd = sdf.format(d);  // convert date -> String
	System.out.println(sd);
	
	String date = " 19/08/2050";
	Date d1 =sdf.parse(date);
	System.out.println(d1);
}
}

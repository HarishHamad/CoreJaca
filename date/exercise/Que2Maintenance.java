package date.exercise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Que2Maintenance {
public static void main(String[] args) {
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DATE, 30);
	Date Today = cal.getTime();
	String s =sdf.format(Today);
	System.out.println("Maintenence Date="+" "+s);
}
}

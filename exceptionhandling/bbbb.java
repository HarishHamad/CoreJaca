package exceptionhandling;

public class bbbb {
public static void main(String[] args) {
	
	try {
		String s = null;
		System.out.println(s.length());
	double div = 15/0;
	System.out.println(div);
	}catch (ArithmeticException e) {
		System.err.println("you can not divide by zero");
		
	} 
	catch (NullPointerException e) {
	System.err.println("You can not resolve null");
	}
}
}
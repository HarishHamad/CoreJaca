package exceptionhandling;

public class Exception22 {
	public static void main(String[] args) {
		try {
		double div = 15/0;
		}catch (ArithmeticException e) {
	  System.out.println("you can not divide by zero");
	  System.exit(0);
		}finally { 
			System.out.println("tu 13 dekh");
			
		} 
	}
}

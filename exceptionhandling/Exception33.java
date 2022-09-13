package exceptionhandling;

public class Exception33 {
	public static void main(String[] args) {
		try {
			try {
				double div = 15 / 0;
				System.out.println(div);
			} catch (ArithmeticException e) {
				System.err.println("you can not divide by zero");
			}
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("String khali hai");
			
			try {
				double div = 15 / 0;
				System.out.println(div);
			} catch (ArithmeticException e1) {
				System.err.println("you can not divide by zero e11");
			} finally {
				System.out.println("tu 13 dekh");
				try {
					double div = 15 / 0;
					System.out.println(div);
				} catch (ArithmeticException e1) {
					System.err.println("you can not divide by zero e1");
				}
			}
		}
	}
}
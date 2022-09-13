package exceptionhandling;

public class AccountTest {
public static void main(String[] args)  {
	Account a = new Account();
	a.setbalance(1000);
	System.out.println(a.getbalance());
	try {
		a.Withdrawl(600);
	} catch (Insuffund e) {
		System.out.println(e.getMessage());
	}
}
}

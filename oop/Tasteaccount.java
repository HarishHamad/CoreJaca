package oop;

public class Tasteaccount {

	public static void main(String[] args) {
		Account a = new Account();
		a.setNumber("958935225040");
		a.setType("saving");
		a.setBalance(50000);

		System.out.println("Account Number= " + a.getNumber());
		System.out.println("Account type= " + a.getType());
		System.out.println("Account balance= " + a.getBalance());

		a.deposite(80000);
		a.withdrawal(10000);
		a.paybill(1000.0);
		a.fundtransfer(10000);

	}
}

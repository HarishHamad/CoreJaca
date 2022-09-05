package oop;

public class Account {
	private static final double Amount = 0;
	private String number;
	private String type;
	private double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdrawal(double Amount) {
		double Total = getBalance() - Amount;
		setBalance(Total);
		System.out.println("Balance after withdrawal= " + Total);
	}

	public void deposite(double Amount) {
		double Total = getBalance() + Amount;
		setBalance(Total);
		System.out.println("Balance after deposite= " + Total);
	}

	public void paybill(double Amount) {
		double Total = getBalance() - Amount;
		setBalance(Total);
		System.out.println("Balance after paybill= " + Total);

	}
	public void fundtransfer(double Amount) {
		double Total = getBalance() - Amount;
		System.out.println(Total);
	}

}

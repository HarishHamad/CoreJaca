package exceptionhandling;

public class Account {
private double balance;

public Account() {
	// TODO Auto-generated constructor stub
}
public double getbalance() {
	return balance;
	
}
public  void setbalance(double balance) {
	this.balance = balance;
}
public void Withdrawl(double amount) throws Insuffund {
	double total = getbalance() - amount;
	if(total<500) {
		throw new Insuffund("in Suffcient fund");
	}else {
		setbalance(total);
		System.out.println("balance after Withdrawal= "+getbalance());
	}
}
	}
package in.co.rays.interface1;

public class Businessman implements Socialworker, Richman {

	@Override
	public void earnmoney() {
		System.out.println("Earn money");

	}

	@Override
	public void donation() {
		System.out.println("Give donation");

	}

	@Override
	public void party() {
		System.out.println("Party Hard");

	}

	@Override
	public void helptoothers() {
		System.out.println("Help to others");

	}

	public static void main(String[] args) {
		Socialworker s = new Businessman();
		s.helptoothers();

		Richman r = new Businessman();
		r.earnmoney();
		r.donation();
		r.party();
	}

}

package sourcecode;

public class wallet extends payment {
	private double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public double pay(double c) {
		return (this.getAmount()-c);
	}
}

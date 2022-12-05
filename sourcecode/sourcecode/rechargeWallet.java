package sourcecode;

public class rechargeWallet extends services {
	public wallet w;
	public rechargeWallet(wallet w) {
		this.w = w;
	}
	public double cost(int n, int i) {
		this.w.setAmount(w.getAmount() + n);
		return n;
	}
	
}

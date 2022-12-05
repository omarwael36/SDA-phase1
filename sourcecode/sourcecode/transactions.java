package sourcecode;


public class transactions {
	static int ID = 0;
	private String t;
	private String source;
	private serviceProvider sp;
	private double amount;
	public transactions() {
		ID++;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public serviceProvider getSp() {
		return sp;
	}
	public void setSp(serviceProvider sp) {
		this.sp = sp;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double d) {
		this.amount = d;
	}
	public void showDetails() {
		System.out.println("the transaction ID is : " + this.getID());
		System.out.println("the transaction time is : " + this.getT());
		System.out.println("the transaction source is : " + this.getSource());
		System.out.println("the transaction service provider is : " + this.getSp());
		System.out.println("the transaction amount is : " + this.getAmount());
	}
}

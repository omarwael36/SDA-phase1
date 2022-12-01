package sourcecode;

import java.time.LocalDateTime;

public class transactions {
	private int ID;
	private LocalDateTime t;
	private String source;
	private serviceProvider sp;
	private float amount;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public LocalDateTime getT() {
		return t;
	}
	public void setT(LocalDateTime t) {
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
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public void showDetails() {
		System.out.println("the transaction ID is : " + this.getID());
		System.out.println("the transaction time is : " + this.getT());
		System.out.println("the transaction source is : " + this.getSource());
		System.out.println("the transaction service provider is : " + this.getSp());
		System.out.println("the transaction amount is : " + this.getAmount());
	}
}

package sourcecode;

public class credit extends payment {
	private double amount;
	private String expiredate;
	private String securitydate;
	private String cardnumber;
	
	public credit(double a) {
		this.setAmount(a);
	}
	public double pay(double c) {
		
		return (this.getAmount()-c);
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getExpiredate() {
		return expiredate;
	}
	public void setExpiredate(String expiredate) {
		this.expiredate = expiredate;
	}
	public String getSecuritydate() {
		return securitydate;
	}
	public void setSecuritydate(String securitydate) {
		this.securitydate = securitydate;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	
}

package sourcecode;

public class specificDiscount extends discount {
	private services ser;
	private String promocode;
	public specificDiscount() {
		dis.add("overall discount");
	}
	public specificDiscount(String n) {
		dis.add(n);
	}
	public specificDiscount(services s , float r,String pc){
		this.setSer(s);
		this.setRate(r);
		promocode = pc;
	}
	public double cost(int n, int i) {
		return getSer().cost(n , i) - (n*this.getRate()/100);
	}
	
	public String getPromocode() {
		return promocode;
	}
	public void setPromocode(String promocode) {
		this.promocode = promocode;
	}
	public services getSer() {
		return ser;
	}
	public void setSer(services ser) {
		this.ser = ser;
	}
}

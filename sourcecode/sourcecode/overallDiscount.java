package sourcecode;

public class overallDiscount extends discount {
	private services ser;
	public overallDiscount() {
		dis.add("overall discount");
	}
	public overallDiscount(String n) {
		dis.add(n);
	}
	public double cost(int n,int i) {
		
		return getSer().cost(n, i) - (n*this.getRate()/100);
	}
	public services getSer() {
		return ser;
	}
	public void setSer(services ser) {
		this.ser = ser;
	}


	

}

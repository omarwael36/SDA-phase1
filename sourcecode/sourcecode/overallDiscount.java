package sourcecode;

public class overallDiscount extends discount {
	private services ser;
	systeminfo s;
	public overallDiscount() {
		s.dis.add("overall discount");
	}
	public overallDiscount(String n) {
		s.dis.add(n);
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

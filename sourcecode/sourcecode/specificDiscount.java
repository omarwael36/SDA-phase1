package sourcecode;

public class specificDiscount extends discount {
	private float rate;
	private services ser;
	public specificDiscount(services s , float r) {
		this.ser = s;
		this.rate = r;
	}
	abstract public float cost(int n) {
		
	}
}

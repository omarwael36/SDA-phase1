package sourcecode;

import java.util.ArrayList;
public abstract class services {
	public ArrayList<String> name = new ArrayList<String>();
	public services() {
		name.add("mobile recharge");
		name.add("internet payment");
		name.add("donations");
		name.add("monthly reciept");
		name.add("quarter reciept");
		name.add("wallet recharge");
		name.add("refund");
	}
	
	abstract public float cost(int n);
}

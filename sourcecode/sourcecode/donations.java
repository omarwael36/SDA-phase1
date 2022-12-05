package sourcecode;

abstract public class donations extends services{
	public donations(){
		name.add("internet payment");
		serviceProvider temp = new serviceProvider("school",0);
		sp.add(temp);
		temp = new serviceProvider("NGO", 0);
		sp.add(temp);
		temp = new serviceProvider("cancer hospital", 0);
		sp.add(temp);
	}
	public double cost(int n, int i){
		return n +( n*sp.get(i).getTaxes());
	}
}


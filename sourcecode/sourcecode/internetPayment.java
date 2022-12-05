package sourcecode;


public class internetPayment extends services {

	public internetPayment(systeminfo s) {
		s.servicesname.add("internet payment");
		serviceProvider temp = new serviceProvider("vodafone", 0.14);
		sp.add(temp);
		temp = new serviceProvider("etisalat", 0.14);
		sp.add(temp);
		temp = new serviceProvider("we", 0.14);
		sp.add(temp);
		temp = new serviceProvider("orange", 0.14);
		sp.add(temp);
	}
	public double cost(int n , int i) {
		amount = n + (sp.get(i).getTaxes() * n);
		index = i;
		return  (n + (sp.get(i).getTaxes() * n));
	}
	
}

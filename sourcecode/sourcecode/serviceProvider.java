package sourcecode;

public class serviceProvider{
	private String name;
	private double taxes;
	serviceProvider(){
		name = " ";
		taxes = 0;
	}
	serviceProvider(String n, double t){
		this.name = n;
		this.taxes = t;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTaxes() {
		return taxes;
	}
	public void setTaxes(float taxes) {
		this.taxes = taxes;
	}
}

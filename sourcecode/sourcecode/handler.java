package sourcecode;

abstract public class handler {
	private int number_of_fields;
	private String label;
	private String mobile_number;
	private double amount;
	private String address;
	private String landline_number;
	private String other;
	
	public handler() {
		setNumber_of_fields(0);
		setLabel(" ");
		setMobile_number(" "); 
		setAmount(0);
		setAddress(" ");
		setLandline_number(" ");
	}
	abstract public void createField();
	public int getNumber_of_fields() {
		return number_of_fields;
	}
	public void setNumber_of_fields(int number_of_fields) {
		this.number_of_fields = number_of_fields;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String temp) {
		this.address = temp;
	}
	public String getLandline_number() {
		return landline_number;
	}
	public void setLandline_number(String landline_number) {
		this.landline_number = landline_number;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
}
